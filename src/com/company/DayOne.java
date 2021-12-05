package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DayOne {
    ReadFile RF = new ReadFile("DayOne");
    //int[] entries = new int[2000];
    ArrayList<Integer> entries = new ArrayList<>();
    public DayOne() throws FileNotFoundException {

    }
    public int taskOne(){
        RF.ReadInt(entries);
        int increased = 0;
        for(int i = 1; i<entries.size(); i++){
            if(entries.get(i) > entries.get(i - 1)){
                increased++;
            }
        }
        return increased;
    }
    public int taskTwo(){
        RF.ReadInt(entries);
        int increased = 0;
        for(int i = 1; i<entries.size()-2; i++){
            int a = entries.get(i - 1) + entries.get(i) + entries.get(i + 1);
            int b = entries.get(i) + entries.get(i + 1) + entries.get(i + 2);
            if(a<b){
                increased++;
            }
        }

    return increased;
    }

}
