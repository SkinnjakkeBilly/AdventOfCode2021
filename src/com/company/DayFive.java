package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class DayFive {
    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();


    public DayFive(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath,"DayFive");
        RF.ReadString(entries);
    }

    public int taskOne() {

        ArrayList<String[]> coordinates = new ArrayList<String[]>();
        int overlap = 0;
        int[][] board = new int[1000][1000];

        for (int i = 0; i < entries.size(); i++) {
            String[] splitCoord;
            splitCoord = entries.get(i).split(" -> ");
            String[] splitFirst = splitCoord[0].split(",");
            String[] splitSecond = splitCoord[1].split(",");
            coordinates.add(splitCoord);

        }

        for (int c = 0; c < coordinates.size(); c++) {
            String X1 = coordinates.get(c)[0].split(",")[0];
            String X2 = coordinates.get(c)[1].split(",")[0];
            String Y1 = coordinates.get(c)[0].split(",")[1];
            String Y2 = coordinates.get(c)[1].split(",")[1];

            if (Y1.equals(Y2) || X1.equals(X2)) {//horisontal
                if (Integer.parseInt(X1) > Integer.parseInt(X2)) {
                    String tmp = X2;
                    X2 = X1;
                    X1 = tmp;
                }
                if (Integer.parseInt(Y1) > Integer.parseInt(Y2)) {
                    String tmp = Y2;
                    Y2 = Y1;
                    Y1 = tmp;
                }
                for (int i = Integer.parseInt(Y1); i <= Integer.parseInt(Y2); i++) {
                    for (int j = Integer.parseInt(X1); j <= Integer.parseInt(X2); j++) {
                        board[i][j]++;

                    }
                }
            }
        }
        //Print ut brettet:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] > 1) {
                    overlap++;

                }

            }

        }
        return overlap;
    }

    public int taskTwo() {
        ArrayList<String[]> coordinates = new ArrayList<String[]>();
        int overlap = 0;
        int[][] board = new int[1000][1000];

        for (int i = 0; i < entries.size(); i++) {
            String[] splitCoord;
            splitCoord = entries.get(i).split(" -> ");
            String[] splitFirst = splitCoord[0].split(",");
            String[] splitSecond = splitCoord[1].split(",");
            coordinates.add(splitCoord);

        }

        for (int c = 0; c < coordinates.size(); c++) {
            String X1 = coordinates.get(c)[0].split(",")[0];
            String X2 = coordinates.get(c)[1].split(",")[0];
            String Y1 = coordinates.get(c)[0].split(",")[1];
            String Y2 = coordinates.get(c)[1].split(",")[1];
            int yOne = Integer.parseInt(Y1);
            int yTwo = Integer.parseInt(Y2);
            int xOne = Integer.parseInt(X1);
            int xTwo = Integer.parseInt(X2);

            if (xOne < xTwo && yOne < yTwo) {
                while (xOne <= xTwo && yOne <= yTwo) {
                    board[yOne][xOne] += 1;
                    xOne++;
                    yOne++;
                }
            } else if (xOne < xTwo && yOne > yTwo) {
                while (xOne <= xTwo && yOne >= yTwo) {
                    board[yOne][xOne] += 1;
                    xOne++;
                    yOne--;
                }
            } else if (xOne > xTwo && yOne < yTwo) {
                while (xOne >= xTwo && yOne <= yTwo) {
                    board[yOne][xOne] += 1;
                    xOne--;
                    yOne++;
                }
            } else if (xOne > xTwo && yOne > yTwo) {
                while (xOne >= xTwo && yOne >= yTwo) {
                    board[yOne][xOne] += 1;
                    xOne--;
                    yOne--;
                }
            }

            if (Y1.equals(Y2) || X1.equals(X2)) {//horisontal
                if (Integer.parseInt(X1) > Integer.parseInt(X2)) {
                    String tmp = X2;
                    X2 = X1;
                    X1 = tmp;
                }
                if (Integer.parseInt(Y1) > Integer.parseInt(Y2)) {
                    String tmp = Y2;
                    Y2 = Y1;
                    Y1 = tmp;
                }
                for (int i = Integer.parseInt(Y1); i <= Integer.parseInt(Y2); i++) {
                    for (int j = Integer.parseInt(X1); j <= Integer.parseInt(X2); j++) {
                        board[i][j]++;

                    }
                }
            }
        }

        //Print ut brettet:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 1) {
                    overlap++;
                }
            }
        }
        return overlap;
    }

}