package com.company;

import java.util.ArrayList;
import java.io.FileNotFoundException;

public class DayTwo {
    ReadFile RF = new ReadFile("DayTwo");
    //String[] entries = new String[1000];
    ArrayList<String> entries = new ArrayList<>();
    public DayTwo() throws FileNotFoundException {

    }
    public int TaskOne(){
        RF.ReadString(entries);
        int hor = 0;
        int depth = 0;
        for(String entry: entries){
            String[] split = entry.split(" ");
            switch(split[0]){
                case "forward":
                    hor += Integer.parseInt(split[1]);
                    break;
                case "down":
                    depth += Integer.parseInt(split[1]);
                    break;
                case "up":
                    depth -= Integer.parseInt(split[1]);
            }
        }
        return hor*depth;
    }

    public int TaskTwo(){
        RF.ReadString(entries);
        int aim = 0;
        int hor = 0;
        int depth = 0;
        for(String entry: entries){
            String[] split = entry.split(" ");
            switch(split[0]){

                case "down":
                    aim += Integer.parseInt(split[1]);
                    break;
                case "up":
                    aim -= Integer.parseInt(split[1]);
                    break;
                case "forward":
                    hor += Integer.parseInt(split[1]);
                    depth += aim*Integer.parseInt(split[1]);
                    break;
            }

    }
        return hor*depth;
    }
}

