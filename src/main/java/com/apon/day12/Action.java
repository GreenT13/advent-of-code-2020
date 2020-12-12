package com.apon.day12;

public class Action {
    public final ActionType actionType;
    public final long value;

    public Action(ActionType actionType, long value) {
        this.actionType = actionType;
        this.value = value;
    }

    public static Action of(String line) {
        return new Action(ActionType.valueOf(line.substring(0, 1)),
                Long.parseLong(line.substring(1)));
    }

    @Override
    public String toString() {
        return "Action{" +
                "actionType=" + actionType +
                ", value=" + value +
                '}';
    }
}
