package com.apon.day8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day8 {
    private Map<Integer, Command> parseInput(String input) {
        String[] inputArray = input.split("\n");
        Map<Integer, Command> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            map.put(i, Command.of(inputArray[i]));
        }
        return map;
    }

    public int part1(String input) {
        Map<Integer, Command> commandMap = parseInput(input);
        FinishedStatus finishedStatus = runProgram(commandMap);
        if (!FinishedStatus.Status.DUPLICATE_COMMAND.equals(finishedStatus.status)) {
            throw new RuntimeException("Some command should be duplicated!");
        }

        return finishedStatus.accumulator;
    }

    public int part2(String input) {
        Map<Integer, Command> commandMap = parseInput(input);

        // Create another map, because we cannot loop over a map and modify it at the same time.
        Map<Integer, Command> modifiedMap = parseInput(input);

        for (Map.Entry<Integer, Command> entry : commandMap.entrySet()) {
            Command command = entry.getValue();

            if (Command.CommandType.ACC.equals(command.commandType)) {
                continue;
            }

            // Temporarily overwrite map and rewrite it back after.
            Command temporaryCommand = new Command(Command.CommandType.NOP.equals(command.commandType) ? Command.CommandType.JMP : Command.CommandType.NOP, command.value);
            modifiedMap.put(entry.getKey(), temporaryCommand);
            FinishedStatus finishedStatus = runProgram(modifiedMap);
            modifiedMap.put(entry.getKey(), command);

            if (FinishedStatus.Status.FINISHED_LAST_COMMAND.equals(finishedStatus.status)) {
                return finishedStatus.accumulator;
            }
        }

        throw new RuntimeException("This should not happen");
    }

    private static class FinishedStatus {
        enum Status {
            DUPLICATE_COMMAND,
            FINISHED_LAST_COMMAND
        }
        public final Status status;
        public final int accumulator;

        public FinishedStatus(Status status, int accumulator) {
            this.status = status;
            this.accumulator = accumulator;
        }
    }
    
    private FinishedStatus runProgram(Map<Integer, Command> commandMap) {
        int accumulator = 0;

        Set<Command> executedCommands = new HashSet<>();
        int i = 0;
        while (true) {
            Command command = commandMap.get(i);
            if (command == null) {
                return new FinishedStatus(FinishedStatus.Status.FINISHED_LAST_COMMAND, accumulator);
            }

            if (executedCommands.contains(command)) {
                return new FinishedStatus(FinishedStatus.Status.DUPLICATE_COMMAND, accumulator);
            }

            switch (command.commandType) {
                case ACC -> {
                    accumulator += command.value;
                    i++;
                }
                case JMP -> i += command.value;
                case NOP -> i++;
            }
            executedCommands.add(command);
        }
    }

    private static class Command {
        enum CommandType {
            NOP,
            ACC,
            JMP
        }

        public final CommandType commandType;
        public final int value;

        public Command(CommandType commandType, int value) {
            this.commandType = commandType;
            this.value = value;
        }

        public static Command of(String line) {
            String[] arr = line.split(" ");
            return new Command(CommandType.valueOf(arr[0].toUpperCase()), Integer.parseInt(arr[1]));
        }
    }
}
