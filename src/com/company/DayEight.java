package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DayEight {
    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();
    String[] numDef;
    String[] display;

    public DayEight(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath, "DayEight");
        RF.ReadString(entries);
        splitLines();

    }

    public int taskOne(){
        int counter = 0;
        for (int i = 0; i<display.length; i++){
            String[] displayNums = display[i].split(" ");
            for(String dn : displayNums){
                if(dn.length()==3 || dn.length()== 4 || dn.length()== 2|| dn.length()== 7){
                    counter++;
                }
            }
        }
        return counter;
    }

    public String taskTwo() {

        for (int i = 0; i < entries.size(); i++) {
            HashMap<Character, Integer> numOccur = new HashMap<Character, Integer>();

            String[] displayNums = display[i].split(" ");
            String[] segments = numDef[i].split(" ");
            char s1, s2, s3, s4, s5, s6, s7;
            for (int j = 0; j < numDef[i].length(); j++) {
                numOccur.merge(numDef[i].charAt(j), 1, Integer::sum );

            }
            return "";
        }
    }
    private void splitLines() {
        numDef = new String[entries.size()];
        display = new String[entries.size()];
        for(int i = 0; i<entries.size(); i++){
            numDef[i] = entries.get(i).substring(0, 58);
            display[i] = entries.get(i).substring(61);

        }
    }


}
