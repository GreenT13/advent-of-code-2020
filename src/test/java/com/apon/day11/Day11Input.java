package com.apon.day11;

public class Day11Input {
    public static final String EXAMPLE_INPUT = "L.LL.LL.LL\n" +
            "LLLLLLL.LL\n" +
            "L.L.L..L..\n" +
            "LLLL.LL.LL\n" +
            "L.LL.LL.LL\n" +
            "L.LLLLL.LL\n" +
            "..L.L.....\n" +
            "LLLLLLLLLL\n" +
            "L.LLLLLL.L\n" +
            "L.LLLLL.LL";

    public static final String INPUT = "LLLLL.LLLLLLL.LLLLLL.L.LLLL..LLLL.LLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLL.L.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLL..LLLLLLLLLLLL.LLLLLLLL.L..LLLLLLLLLLLL.LLLL.LLL.LLLLL.LLL.LLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLL.LLL.LLLLLLLL.LLLLL.LL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLL.LLL.LLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLLL.LLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLL.L.LLLLLL.LLLLLL..LLLLLL..LLLLLLLLLLLLLL.LLLLLL\n" +
            ".L..L.L.L.LL..LL.........L....L.L..LL.LLLL.L..L.LLLL.L.L..L.......LL...LL..LL.L..L.L.LL..L\n" +
            "LLL.L.LLL.LLLLL..LLL.LLLLLL.LL.L.L.LLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLLLLLLL..LLLLL\n" +
            "LL.L..LLLLLLLLLLLLLL.LLLLLL.LLLLLL.LLLLLLLLLLLLLLLLL.LLLLLL.LLLL.LLLLLLLLL.LLLLLLLLLLLLLLL\n" +
            "LLL.LLL.LLLL.LL.LLLL.LLLLLLLLLLLLL.LLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLL.LLLLLLL.LLLLLLLLLLLLL\n" +
            "LLLLLLLLL.LLLLL.LLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLL.LL.LLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LL.LLLLLL..LLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLL..LLLLLLL.LLL.LL.LLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLL.LLLLLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLL.LL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLL.LLLLLLLLL..LLLLLLLL.LLLLLL.L.LLLLLLLLLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLL.LLL.LLLLL.LLLLLLLL.LLL.LLLL.LLLLLL.LLLLLL.LLLLLLL.LLLLL.LLLLLLLLL\n" +
            "...L..L..........L...L..LLL..L....LL......L......L.L.L...........L....L.L.LL..LL.L....LL..\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLL.LLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLL.LLLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLLLLL..LLLLL..LLLLLLL.LLLLLLLL..LLLLL.LLLLLLLL.LLLLLLLLLLL.LL.LLLLLL\n" +
            "LLLLL.LL.LLL.LL..LLLL.LLLLL.LL.LL..LLL.LLLL.LLLLLLL..LLLLLLLL.LLLLLL.LLLL..LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLL.LLLL.L.LLLLLLLL..LLLLLLLLLLLLLLLLLLLLLLL.LLLLL.LLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLLLLL.LLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLL..LLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLL.LLL.LLLL.LLLLLL.L.LLLLLLLLLLLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLLLLLLLLLLLL\n" +
            "LL...L.LLL.....L....LL.....L...L.L....L.L.....L.LL...L..L.....L.L..LLL.L.LL.LLLL..........\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLL.LLLLLLLLLLL.LLL..LLLL.LLL.LLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL..LLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLL.LLLLL..LLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLL..LLLLLL.LLLLL.LL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLL.LLLLL.LLLLLLLLLLLLLLLLLL.LLLLLLL..LLLLL.LLLLLLLLL.LLLLLLLL.LLLLL..LL.LLLL.LLLLLL\n" +
            "L..LL.L.....L...LL.....L.L........L..LL...L.....L....L..L.L...L...LL.......L.L....L.......\n" +
            "LLLLL..LLLLLLLL.LLLL.LLLLLL.LLLLLLLL.LLLL.LLLLLLL.LLLLLLLLLLLLLLLLLL..LLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLL.LLLLLL.LLLLLLLLLLLLLLL.LLLL.LLL.LLLL.L.LLLLLLLLLLLLLLLLL.L.LLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LL.LLLLLLLLLLLLLLL.LLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL..LLLLL\n" +
            "LLLLLLLLLLLLLLL.LLL..LL.LLLLLLLLLLLLLLLLLLL.LLL.LLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLL.\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLL.L.LLLLLL.LLLLLLLLLLLLLLL.LL.LLLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLL..LLL.LLLLLL.LLLLLLLLL.LLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLL.LL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLL.LL\n" +
            ".L.LLLLL.............L.LL.L.LLL.L.LL....L...L...L.....L..L...LLLL..L..L.......L.L.LLL.LLLL\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLL..LLLLL.LLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLLL.LLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLL.LLL.LL.LLLLL.LLLLL.LLLLLL.LLLLLLLL\n" +
            "LLLLLLLLLL.LLL.LLLLL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLLL.LLLLLLLLLL.LLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLLLLLLLL.LLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLL..LLLLL.LLLLLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLLLLLL..LLLLLL.LLLLLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLL..LLLLLLLLL..LLL.LLLLLL.L.LLLLLL.LLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.L..LL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLL..LLLLLLLLLLLLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLLLLL.LLL.LLLLLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLL..LLLLLL\n" +
            "LLLLL.LLLLL.LLL..LLL.LLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLL.LLL.LL\n" +
            ".L.......LL...L...L.LL.LL......L..L...L...L...L....LL..L...L..LLL.....L.....L.....LLL.LL..\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLL.LLLLL..LLLLL.LL.LLLLL.LLLLLLL..L.LLLL\n" +
            "LLLLL.LLLLLLLLLLLLLLLLLLLLL.L.LLLLLLLLLLL.L.LLL.LLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLL.LLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLL.LLLLLL.LLLLL.LLLLLLLL.LLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLL.L.LLLLL.LL.LLLLL.LLLLLL\n" +
            "LLLL..LLLLLLLLL.LLLLLLLLLLL.LL.LLL.LLLLLLLL.LLLLLLLLLLLL.LL.LLLLLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            ".......L......L....L....L......L...L.L..L...L.LL.....L......L.......LL.........L.L.L...LLL\n" +
            "L.LLL.LLLLLLLLL.LLLL.LLLLL..LLLLLL.LLLLLLLLLLLLLL.LL.LLLLLL.LLLLLL.L.LLLLL.LLLLL.LLL.LLLLL\n" +
            "LLLLL.LLLLLLLLLLL.LL.LLLLLL..LLLL..LLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLLLLLLLLLLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLL.LLLLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLL.LLLL.LLL.LLLL.LLL.L..LLL.LLL.LLLL.LLLLLLL.LLLLLLLLLLLLL\n" +
            "LLLL.LLLLLLLLLL.L.LL.LLLLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLLLL.LLL..LLLLLL.LLLLLLLLLLLLLLLLL.LLLLLLLLLLL.LLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            ".LLLLLLLLLLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLL.L.LLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLL.LLL..LLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLLL.LLLLLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\n" +
            "L...L.........L....L......LL..LL.....LL.L..LLL....L.L...L..LLL.......LL.L...L..L...LL...L.\n" +
            "LLLLL.LLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLL.LLLLLLLLLL.LLLLLLLLL.LLLLL\n" +
            "LLLLL.L.LLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLL.LLLLL.LLLLLLLL.LLLLL..LL.LLLLLLLLLLL\n" +
            "LLLLLLLLLLLLLLLLLLLL.LLLLL.LLLLLLLLLLLLLLLL.LLLLLLLL.L.LLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLLLLLLLL.LLLLLLLL.LL.LLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLLLLLLL..LLLLL\n" +
            ".L.L.L..L.L...LLLLLL.....LL...L..L..L......LLLL.L.LL.....LLLL.LL.L.....L.L...L....L...L...\n" +
            "LLLL..LLLLLL.LL.LLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLLLL.LLLLLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLLLLL..LLLLL.L.L.LLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLL.LLLLLLLLLL.LLLLLL.LLL.LLLLLLLLLLLLLL.LLLL..LLLLL\n" +
            "LLLLLL.LLLLLL.LLLLLLLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LL.LL..LLLLLLL.LLLLLL\n" +
            "LLLLL.LLLL..LLLLL.LL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLL.LLLL.LLL.LLLLLL\n" +
            "....L........L..L...........L.L............L.....LL..L.L.L.........LLLLLL.LL..L..L.L..L...\n" +
            "LL.LLLLLLLLLLLL.LLLLLLLLLLL.LLLLLL.LLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLL.L..LLLL..LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLLLLLLL.L.LLLLLLLL.LLLLLLLL.LLL.LL.LLLLLLLL..LLLL.LLLL.LLLLLLLLLL\n" +
            "LLLL.LLLLLLLLLL.LLLL.LLLLLL.LLLLLLLLLLLLL.L.LLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLL.LLL.LLLLLLLL.LLLLLLLLLLL.LLL.LLLLL.LLLLLLL..LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLLLL..LL.LLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.LLLLLL.LLLLLL..LLLLLLL.LLLLL.LL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL...LLLLLL.LLLL.L.LLLLL.LL.LLLLL.LLLLLLLL.L.LLLL\n" +
            "LLLLLLLLLLLLLLL.LLLL.L.LLLL.LLLLLL.LLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLL.L.LLLLLL.LLLLLL\n" +
            "L.LLL......LLL....L.......L..L..L.....LL......L.LLLL...L.....L.L............L.LL....LL....\n" +
            "LLLLLLLLLLLLLLL.LLLLLLLLLLL.LLL.LL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "L..LL.LLLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLLL.LLLL.LLLLLL.LLLLLLLLLLLLLLL.LLLLLLL.LLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLLLLLLLLL.LLLLL..LL.LLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLL.LLL.LLLL.LLLLLL\n" +
            "LLLLL.LL.LLLLLL.LLLL.LLLLLL.LL.LLL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLL\n" +
            "LLLLLLLLLLLLLLL.LLLLLLL..LL.LLLL.L.LLLLLLLL.L.LLLLL..LLLLLL.LLLLLLL..LLLLLLLLLLLLLL.LLLLLL\n" +
            "LLL...LLLLLLLLL.LLLL.LLLLL..LLLLLLL.LLLLLLL...LLLLLLLLLLLLLLLLLLLLLL.LLLLL.LLLLLLLL.LLL.LL\n" +
            "LLLLLLLLLLLLLLL.LLLL.LLLLLL.LLLL.LLLLLLLLLL.LLLLLLL.LLL.LLLLLLLLLL.L.LLLLLLLLLLLLLL.L.LLLL\n" +
            "...L.L.L.L.....LL...L...LL.L........L...LL.L...........L..L.L.L.L..L...LL.LL.L.L.L....L..L\n" +
            "LLL.L.LLLLLLLLL.LLLL.L.LLLLLLLLLLL.LLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL..LLLL.LLLLL.LL.LLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLL.LLL.LLLLLLLLLL.LLLLLLLLLLLLLLL\n" +
            "LLLLL.LLLLLLLLL.LLLL.LLLLLL.LLLLLL.LLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLL..LLLLLLLL.LLLLLL\n" +
            "LLLLL.LLLLLLLLLLLLLL.L.LLLL.LLLL.L.LLLLLLLL.LLLLLLLL.LLL.LL.LLLLLLLL.LLLLL.LLLLLLLL.LLLLLL\n" +
            "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLL.LLLLLLL.LLLLLLL.LLLLL.LLLLLLLL.LLLLLL";
}
