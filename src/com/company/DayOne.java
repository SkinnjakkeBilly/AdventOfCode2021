package com.company;

import java.io.FileNotFoundException;

public class DayOne {
    ReadFile RF = new ReadFile();
    int[] entries = new int[2000];
    public DayOne() throws FileNotFoundException {

    }
    public int TaskOne(){
        RF.ReadList(entries);
        int increased = 0;
        for(int i = 1; i<entries.length; i++){
            if(entries[i]>entries[i-1]){
                increased++;
            }
        }
        return increased;
    }
    public int TaskTwo(){
        RF.ReadList(entries);
        int increased = 0;
        for(int i = 1; i<entries.length-2; i++){
            int a = entries[i-1]+entries[i]+entries[i+1];
            int b = entries[i]+entries[i+1]+entries[i+2];
            if(a<b){
                increased++;
            }
        }

    return increased;
    }

}
