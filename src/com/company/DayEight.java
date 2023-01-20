package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class DayEight {
    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();
    String[] numDef;
    String[] display;

    public DayEight(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath, "DayEightEx");
        RF.ReadString(entries);
        splitLines();

    }

    public int taskOne(){


        return 0;
    }

    private void splitLines() {
        for(int i = 0; i<entries.size(); i++){
            numDef[i] = entries.get(0).substring(0, 58);
            display[i] = entries.get(0).substring(61);

        }
    }

    public String taskTwo() {
        return  "";
    }
}
