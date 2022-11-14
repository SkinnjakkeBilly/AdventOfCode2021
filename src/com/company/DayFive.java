package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class DayFive {
    ReadFile RF = new ReadFile("DayFiveEx");
    ArrayList<String> entries = new ArrayList<>();


    public DayFive() throws FileNotFoundException {
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

            if (Y1.equals(Y2) || X1.equals(X2)) {//horisontal
                if (Integer.parseInt(X1) > Integer.parseInt(X2)) {
                    String tmp = X2;
                    X2 = X1;
                    X1 = tmp;
                }åæ
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
            } else if (checkDiagonal(X1, X2, Y1, Y2)) {//Diagonal
                int minY = Math.min(Integer.parseInt(Y1), Integer.parseInt(Y2));
                int maxY = Math.max(Integer.parseInt(Y1), Integer.parseInt(Y2));
                int minX = Math.min(Integer.parseInt(X1), Integer.parseInt(X2));
                int maxX = Math.max(Integer.parseInt(X1), Integer.parseInt(X2));

                for (int i = minY; i <= maxY; i++) {
                    for (int j = minX; j <= maxX; j++) {
                        if(checkDiagonal(String.valueOf(j), String.valueOf(minX), String.valueOf(i), String.valueOf(minY))){
                            board[i][j]++;
                        }
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
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

    public boolean checkDiagonal(String x, String x2, String y, String y2) {
        boolean flag = false;
        int X1 = Integer.parseInt(x);
        int X2 = Integer.parseInt(x2);
        int Y1 = Integer.parseInt(y);
        int Y2 = Integer.parseInt(y2);
        /*
        int dx = X1 - X2;
        int dy = Y1 - Y2;
        for (int i = 2; i < coordinates.size(); ++ i) {
            int dx1 = coordinates[0][0] - coordinates[i][0];
            int dy1 = coordinates[0][1] - coordinates[i][1];
            if (dx1 * dy != dy1 * dx) return false;
        }
        */
        //int checkY = Math.abs((Y2-Y1));
        //int checkX = Math.abs((X2-X1));
        int minY = Math.min((Y1), (Y2));
        int maxY = Math.max((Y1),(Y2));
        int minX = Math.min((X1),(X2));
        int maxX = Math.max((X1),(X2));
        if ((maxX-minX)==(maxY-minY)) {
            flag = true;
        }
        /*wqQZS
        if((Y1-Y2)==(X1-X2)){
            flag = true;
        }else if (Math.abs((Y2-Y1))==Math.abs((X1-X2))){
            flag = true;
        }*/


        return flag;


    }
}