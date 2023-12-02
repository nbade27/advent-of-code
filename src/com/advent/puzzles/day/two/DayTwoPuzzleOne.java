package com.advent.puzzles.day.two;

public class DayTwoPuzzleOne {

    /*
    Problem Statement:
        Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
        Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
        Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
        Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
        Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green

        In game 1, three sets of cubes are revealed from the bag (and then put back again). The first set is 3 blue cubes and 4 red cubes; the second set is 1 red cube, 2 green cubes, and 6 blue cubes; the third set is only 2 green cubes.

        The Elf would first like to know which games would have been possible if the bag contained only 12 red cubes, 13 green cubes, and 14 blue cubes?

        In the example above, games 1, 2, and 5 would have been possible if the bag had been loaded with that configuration. However, game 3 would have been impossible because at one point the Elf showed you 20 red cubes at once; similarly, game 4 would also have been impossible because the Elf showed you 15 blue cubes at once. If you add up the IDs of the games that would have been possible, you get 8.

        Determine which games would have been possible if the bag had been loaded with only 12 red cubes, 13 green cubes, and 14 blue cubes. What is the sum of the IDs of those games?


     */


    public static final Integer maxRedCubes = 12;
    public static final Integer maxGreenCubes = 13;
    public static final Integer maxBlueCubes = 14;
    // only 12 red cubes, 13 green cubes, and 14 blue cubes
    public static void main(String[] args) {
        String gamesGiven = "Game 1: 12 blue, 15 red, 2 green; 17 red, 8 green, 5 blue; 8 red, 17 blue; 9 green, 1 blue, 4 red\n" +
                "Game 2: 6 red, 6 blue, 2 green; 1 blue, 1 red; 6 green, 1 red, 10 blue\n" +
                "Game 3: 1 green, 2 blue; 7 blue, 4 green; 2 green, 1 blue; 10 blue, 4 green; 4 blue; 1 green, 7 blue, 1 red\n" +
                "Game 4: 16 red, 12 blue, 10 green; 15 red, 5 green, 6 blue; 10 green, 15 red, 12 blue\n" +
                "Game 5: 2 green, 2 red, 9 blue; 1 red, 5 green; 4 green, 12 blue, 1 red; 5 blue, 8 green\n" +
                "Game 6: 17 blue, 3 green, 4 red; 6 green, 16 blue, 3 red; 2 red, 15 blue\n" +
                "Game 7: 4 green, 10 red; 1 green, 4 red, 4 blue; 4 blue, 11 red\n" +
                "Game 8: 8 green, 4 blue; 17 green, 4 red; 10 blue, 5 green, 9 red; 9 green, 8 red, 3 blue; 9 green, 5 red, 2 blue\n" +
                "Game 9: 4 red, 2 green; 7 blue, 3 red, 3 green; 3 green, 7 blue, 3 red\n" +
                "Game 10: 3 green, 2 red, 2 blue; 3 green, 11 red, 1 blue; 16 green, 11 red\n" +
                "Game 11: 2 blue, 18 green; 12 blue, 1 green; 2 green, 6 blue; 1 red, 4 blue, 20 green; 14 blue, 1 red, 4 green\n" +
                "Game 12: 2 green, 1 blue, 7 red; 11 red, 3 green, 6 blue; 1 red, 2 blue, 3 green; 4 red, 2 green, 5 blue\n" +
                "Game 13: 4 red, 17 blue, 5 green; 6 blue, 2 green; 12 blue, 4 green, 2 red; 5 green, 9 blue; 5 green, 3 blue, 3 red; 4 green, 1 red, 7 blue\n" +
                "Game 14: 4 blue, 18 green; 3 blue, 3 red, 13 green; 5 blue, 10 green; 10 green, 2 blue; 1 blue, 14 green; 3 blue, 18 green, 2 red\n" +
                "Game 15: 1 green, 2 blue, 1 red; 1 green, 2 red, 1 blue; 1 green, 2 red; 1 green, 4 blue, 4 red; 6 blue, 2 red, 1 green; 3 blue, 2 red\n" +
                "Game 16: 3 green, 2 red; 4 green, 1 red, 8 blue; 5 blue, 9 red, 3 green; 7 blue, 19 green, 18 red\n" +
                "Game 17: 10 blue, 9 red, 7 green; 16 red, 11 green, 11 blue; 8 blue, 3 green; 12 red, 1 blue, 10 green\n" +
                "Game 18: 11 green, 11 blue, 5 red; 7 red, 11 green, 13 blue; 5 green, 9 red, 6 blue; 9 red, 16 green, 17 blue\n" +
                "Game 19: 8 red, 3 green, 16 blue; 13 green, 8 blue; 7 red, 8 green, 1 blue; 13 red, 3 blue, 7 green; 6 green, 14 blue, 13 red; 15 blue, 9 green, 13 red\n" +
                "Game 20: 1 red, 7 green, 5 blue; 14 green, 4 blue; 10 green, 11 blue, 2 red; 2 red, 3 blue, 1 green; 1 red, 5 blue, 8 green\n" +
                "Game 21: 10 green, 12 blue, 6 red; 17 blue, 6 red, 6 green; 12 blue, 9 green, 4 red; 5 blue, 3 red, 4 green; 6 green, 7 blue, 5 red\n" +
                "Game 22: 1 blue, 3 red, 16 green; 4 red, 1 blue, 3 green; 12 green, 1 blue, 2 red; 12 red\n" +
                "Game 23: 2 red, 6 blue, 1 green; 11 red, 13 blue, 4 green; 8 red, 3 blue, 6 green; 2 green, 8 blue, 2 red; 7 red, 11 blue, 4 green\n" +
                "Game 24: 4 red, 12 green, 2 blue; 8 blue, 15 red; 1 blue, 10 green, 8 red; 1 green, 2 blue, 6 red; 10 green, 8 blue, 5 red\n" +
                "Game 25: 2 blue, 11 green; 17 green, 1 red, 2 blue; 2 blue, 3 red, 1 green\n" +
                "Game 26: 16 blue, 11 green; 4 green; 9 green, 4 blue; 10 green, 5 blue; 1 red, 5 blue, 9 green; 5 green, 5 blue\n" +
                "Game 27: 10 green, 2 red; 5 blue, 1 red; 6 red, 5 green\n" +
                "Game 28: 3 red, 5 green, 10 blue; 1 red, 5 green, 2 blue; 6 blue, 2 green, 2 red; 6 red, 9 blue, 1 green; 3 red; 3 red, 2 green, 2 blue\n" +
                "Game 29: 8 red, 18 blue, 5 green; 1 blue, 8 red, 2 green; 2 red, 4 green, 18 blue; 6 red, 4 green, 7 blue\n" +
                "Game 30: 1 red, 18 green; 11 green; 4 blue, 5 red, 14 green; 3 green, 8 blue, 2 red\n" +
                "Game 31: 1 red, 5 blue, 17 green; 7 blue; 10 green, 8 blue, 1 red; 11 green, 4 blue\n" +
                "Game 32: 5 blue, 15 red, 12 green; 6 red, 8 green, 8 blue; 2 red, 14 green, 3 blue; 4 blue, 15 green; 7 blue, 12 red, 7 green; 2 blue, 9 red, 7 green\n" +
                "Game 33: 13 red, 2 green; 1 green, 7 red, 15 blue; 1 green, 14 blue, 13 red; 8 red, 2 green; 12 red, 14 blue, 10 green; 8 green, 16 blue, 10 red\n" +
                "Game 34: 11 green, 9 blue, 2 red; 4 red, 1 green, 8 blue; 4 blue, 7 green, 4 red; 7 blue, 1 red, 8 green; 9 blue, 1 red, 4 green; 2 red, 10 green, 4 blue\n" +
                "Game 35: 3 red, 9 blue; 11 blue, 3 red, 12 green; 7 green, 10 blue, 2 red\n" +
                "Game 36: 9 blue, 3 green, 3 red; 5 blue, 1 red, 3 green; 2 green, 6 red; 9 blue, 7 red\n" +
                "Game 37: 1 red, 7 blue; 4 red, 1 green; 1 green, 9 red, 9 blue\n" +
                "Game 38: 1 green, 12 red; 4 green, 12 red, 4 blue; 5 green, 10 red; 6 red, 4 green, 3 blue; 4 green, 10 red; 2 green, 5 blue, 4 red\n" +
                "Game 39: 2 blue; 4 red; 4 red, 5 green, 1 blue\n" +
                "Game 40: 7 red, 2 green, 17 blue; 12 green, 1 red, 7 blue; 9 green, 2 red, 8 blue\n" +
                "Game 41: 18 green, 5 red, 4 blue; 20 green, 17 blue, 5 red; 3 red, 7 blue, 7 green; 4 red, 19 green, 18 blue; 20 blue, 20 green\n" +
                "Game 42: 1 green, 6 blue, 1 red; 5 blue, 1 red, 3 green; 3 green, 7 blue, 1 red\n" +
                "Game 43: 4 blue, 6 green, 13 red; 16 red, 7 blue, 8 green; 4 green, 16 red\n" +
                "Game 44: 5 green, 4 red, 13 blue; 4 red, 12 blue, 3 green; 6 green\n" +
                "Game 45: 1 red, 17 blue, 15 green; 6 red, 3 green, 9 blue; 5 green, 1 blue, 7 red; 6 blue, 4 red, 4 green\n" +
                "Game 46: 1 blue, 11 red, 1 green; 2 red, 2 green, 1 blue; 4 red, 1 green, 1 blue; 2 blue, 7 red, 3 green; 11 red, 3 green\n" +
                "Game 47: 2 red, 1 blue; 1 green, 1 red, 1 blue; 5 green, 1 red\n" +
                "Game 48: 9 blue, 1 red; 1 green, 2 red, 11 blue; 2 red, 6 blue\n" +
                "Game 49: 5 blue, 7 red, 17 green; 5 red, 4 green, 7 blue; 1 red, 3 blue; 4 red, 12 green, 6 blue; 6 green, 4 blue, 3 red\n" +
                "Game 50: 11 blue, 12 green, 1 red; 8 green, 7 red, 9 blue; 13 red, 12 blue, 10 green; 5 green, 10 blue, 3 red\n" +
                "Game 51: 8 blue, 1 red; 5 red, 2 green; 9 blue, 6 red, 4 green; 4 green, 1 red, 13 blue; 15 blue, 3 red, 8 green; 6 red, 1 green, 4 blue\n" +
                "Game 52: 2 blue, 1 red; 1 red, 4 blue, 5 green; 3 red, 14 blue, 2 green\n" +
                "Game 53: 8 blue, 10 green, 11 red; 5 red, 4 blue, 19 green; 8 red, 3 blue; 3 red, 3 blue, 2 green; 4 red, 4 green\n" +
                "Game 54: 3 green, 17 red; 7 green, 13 red, 5 blue; 11 blue, 10 red, 10 green; 3 green, 19 red, 4 blue; 11 green, 6 blue, 19 red; 5 red, 4 blue, 9 green\n" +
                "Game 55: 3 blue, 4 red; 1 red, 1 blue, 2 green; 4 blue, 2 green, 4 red\n" +
                "Game 56: 10 red, 3 green, 5 blue; 2 blue, 2 red; 7 red, 3 blue, 2 green\n" +
                "Game 57: 12 red, 1 blue, 8 green; 1 blue, 3 green, 10 red; 5 green, 8 red\n" +
                "Game 58: 6 red, 4 green, 2 blue; 7 red, 6 blue, 14 green; 5 blue, 6 red, 2 green; 2 red, 4 blue; 7 blue, 12 green; 7 green, 3 blue, 8 red\n" +
                "Game 59: 6 red, 5 blue; 5 blue, 1 green; 1 blue, 6 red; 4 blue, 2 red, 1 green; 3 red, 2 blue; 3 blue, 5 red, 1 green\n" +
                "Game 60: 1 red, 12 green, 2 blue; 4 red, 5 blue; 12 green, 1 red; 5 blue, 13 red, 17 green; 15 green, 1 blue\n" +
                "Game 61: 10 blue, 18 red; 4 blue, 1 green, 14 red; 4 blue, 2 green; 2 green, 6 red, 10 blue\n" +
                "Game 62: 2 green, 13 blue, 8 red; 7 green, 5 red, 8 blue; 5 red, 8 blue; 3 red, 5 green, 4 blue; 15 blue, 5 red, 6 green\n" +
                "Game 63: 6 red, 7 green, 2 blue; 2 red, 6 green; 2 blue, 4 red, 5 green; 1 blue, 2 red, 5 green; 4 red, 8 green; 9 green, 2 red\n" +
                "Game 64: 4 red, 4 blue; 7 blue, 5 red; 8 green, 5 red, 6 blue; 2 red, 3 blue, 1 green; 7 blue, 9 green, 7 red; 11 green, 2 red, 3 blue\n" +
                "Game 65: 1 red, 11 green, 9 blue; 2 red, 5 green, 17 blue; 2 red, 3 blue, 6 green; 2 red, 6 green, 14 blue\n" +
                "Game 66: 7 green, 5 red, 2 blue; 5 red, 7 green, 2 blue; 6 green, 3 blue, 15 red; 8 green, 20 red, 4 blue; 8 red, 8 green, 3 blue; 3 blue, 11 red, 5 green\n" +
                "Game 67: 2 blue, 2 green; 6 blue, 1 green, 3 red; 3 red, 7 green, 4 blue; 1 red, 1 green, 8 blue\n" +
                "Game 68: 1 green, 3 red; 2 green, 1 blue, 5 red; 2 red, 2 green, 1 blue; 2 green, 3 red, 1 blue; 6 red, 1 blue\n" +
                "Game 69: 4 red, 2 green, 3 blue; 14 red; 3 blue; 11 red, 1 green; 13 red, 3 green, 2 blue\n" +
                "Game 70: 1 green, 1 blue, 6 red; 1 green, 4 red, 1 blue; 6 red, 1 blue\n" +
                "Game 71: 1 green, 8 blue, 10 red; 6 green, 3 red, 2 blue; 14 red, 3 green; 9 blue, 2 green, 2 red; 7 blue, 5 red, 1 green; 6 green, 5 blue, 10 red\n" +
                "Game 72: 2 red, 10 blue; 1 red, 7 blue, 4 green; 1 red, 3 green, 6 blue\n" +
                "Game 73: 6 red, 6 blue, 5 green; 1 blue, 11 green, 7 red; 10 red, 7 blue, 2 green\n" +
                "Game 74: 4 green, 2 red, 3 blue; 1 red, 6 green; 2 red, 4 blue; 1 blue; 2 blue, 1 green\n" +
                "Game 75: 10 red, 5 blue, 1 green; 12 blue; 2 green, 11 blue, 9 red; 1 blue, 14 red; 2 red, 2 green, 13 blue\n" +
                "Game 76: 9 green, 1 blue; 8 green, 2 blue, 7 red; 4 blue, 7 green, 4 red\n" +
                "Game 77: 14 red, 3 blue, 10 green; 3 blue, 7 green, 2 red; 5 red, 7 green, 3 blue; 14 red, 8 green, 3 blue; 9 green, 5 red; 2 blue, 7 red, 15 green\n" +
                "Game 78: 5 blue, 9 green, 8 red; 11 green, 9 blue, 4 red; 8 red, 2 blue, 10 green; 3 blue, 7 green\n" +
                "Game 79: 4 red, 6 blue, 10 green; 2 blue, 17 green, 15 red; 15 red, 6 blue, 14 green\n" +
                "Game 80: 2 red, 8 green; 6 blue, 6 green; 1 green, 3 red, 8 blue; 5 green, 4 blue, 3 red; 3 blue, 1 red; 7 green, 8 blue, 3 red\n" +
                "Game 81: 5 blue, 1 red; 10 blue, 7 red, 3 green; 4 green, 1 red, 10 blue; 8 red, 4 blue, 3 green; 11 blue, 9 green, 1 red; 6 red, 10 green\n" +
                "Game 82: 1 green, 2 blue, 1 red; 2 blue, 1 green, 2 red; 2 red, 8 green; 3 red, 3 blue, 5 green\n" +
                "Game 83: 3 blue, 4 green, 5 red; 6 blue, 5 red, 5 green; 4 red, 2 blue, 5 green; 2 green, 6 blue, 5 red; 1 red, 2 green\n" +
                "Game 84: 14 blue, 1 green; 9 green, 3 red, 1 blue; 5 green, 10 blue, 3 red; 9 green; 6 green, 18 blue; 2 red, 8 green\n" +
                "Game 85: 1 blue, 7 red; 12 green, 7 red, 5 blue; 9 blue, 6 green, 7 red; 10 red, 7 green, 1 blue; 3 green, 6 blue, 7 red; 10 red, 16 blue\n" +
                "Game 86: 9 red, 10 blue, 2 green; 2 red, 12 blue, 9 green; 11 green, 2 blue, 3 red\n" +
                "Game 87: 1 blue, 7 red, 9 green; 1 red, 6 blue; 3 blue, 12 green\n" +
                "Game 88: 1 blue, 4 green; 4 red, 13 blue, 1 green; 7 green, 4 blue, 3 red; 2 blue, 4 green, 5 red; 4 red, 7 green, 10 blue; 1 red, 7 green, 13 blue\n" +
                "Game 89: 5 blue, 8 red, 1 green; 7 blue, 2 green, 7 red; 2 green, 8 blue, 11 red\n" +
                "Game 90: 5 blue, 1 green, 11 red; 6 blue, 8 red; 2 red, 3 blue, 4 green; 2 green, 4 blue, 7 red; 3 blue, 8 red; 6 red, 3 blue, 1 green\n" +
                "Game 91: 2 green, 13 red, 9 blue; 12 blue, 6 green; 14 green, 10 blue, 3 red; 13 blue, 7 green, 5 red; 1 green, 9 blue, 14 red; 10 green, 8 blue, 17 red\n" +
                "Game 92: 10 green, 3 red, 17 blue; 13 red, 7 green, 15 blue; 9 blue, 8 red, 4 green; 1 blue, 8 red; 9 red, 1 green, 19 blue\n" +
                "Game 93: 1 blue, 7 green, 4 red; 2 blue, 8 green; 10 red, 10 green, 1 blue; 10 green, 2 blue; 3 red, 3 blue\n" +
                "Game 94: 5 red, 8 green, 14 blue; 4 red, 7 green, 20 blue; 11 blue, 4 red, 13 green; 18 blue, 1 red, 3 green\n" +
                "Game 95: 5 red, 8 green, 11 blue; 12 green, 5 blue; 4 blue, 14 green; 7 green, 9 blue, 5 red; 3 red, 4 green, 7 blue; 3 red, 12 blue, 3 green\n" +
                "Game 96: 10 red, 12 blue, 9 green; 4 green, 8 blue, 4 red; 8 blue, 3 red, 4 green; 6 green, 10 red; 2 blue, 3 green, 15 red; 12 red, 2 green, 2 blue\n" +
                "Game 97: 13 green, 1 blue; 9 green, 1 red, 1 blue; 6 blue, 10 green; 1 red, 6 blue, 11 green\n" +
                "Game 98: 2 blue, 14 green, 2 red; 7 green, 1 blue; 1 blue, 1 red, 3 green; 2 red, 1 blue, 15 green; 1 blue, 2 red, 10 green\n" +
                "Game 99: 3 green, 8 red, 7 blue; 6 red, 13 blue; 12 red, 4 green, 4 blue; 12 red, 8 green, 3 blue; 11 blue, 11 red, 4 green\n" +
                "Game 100: 2 red, 13 blue, 1 green; 1 green, 12 blue; 1 red, 5 blue, 1 green; 3 blue, 3 red";
        int totalCount = 0;
        // Extracting game from the list
        String[] gamesArr = gamesGiven.split("\n");
        for (String gameDetails : gamesArr) {
            //System.out.println(gamesArr[i]);
            String[] gameParts = gameDetails.split(":");
            int gameNum = Integer.parseInt(gameParts[0].substring(4).trim());
            String[] gameSets = gameParts[1].trim().split(";");
//            System.out.println(gameNum);
            boolean isValidSet = true;
            // extracting colours from the sets
            for (String gameSet: gameSets) {
                int redNum = 0;
                int blueNum = 0;
                int greenNum = 0;

                // extracting each color
                String[] colours = gameSet.split(",");
                // counting colours in each set
                for (int k = 0; k < colours.length; k++) {
//                    System.out.println("colours :" + colours[k].trim());
                    String eachColor = colours[k].trim();
                    if(eachColor.contains("red"))
                        redNum +=  Integer.parseInt(eachColor.split("red")[0].trim());
                    if(eachColor.contains("blue"))
                        blueNum +=  Integer.parseInt(eachColor.split("blue")[0].trim());
                    if(eachColor.contains("green"))
                        greenNum +=  Integer.parseInt(eachColor.split("green")[0].trim());
                }//counting colours in each set

                // validating colours in each set
                if(redNum > 12 || greenNum > 13 || blueNum > 14){
                    isValidSet = false;
                    System.out.println("in-valid game num : " + gameNum);
                    break;
                }

            }// extracting colours from the sets
            if (isValidSet){
                totalCount += gameNum;
                System.out.println("valid game num : " + gameNum);
            }
        }// extracting games from the text
        System.out.println("totalCount: " + totalCount);
    }//main

}
