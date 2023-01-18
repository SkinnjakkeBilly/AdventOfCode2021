package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class DayEight {
    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();
    String[] inputLines;

    public DayEight(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath, "DayEight");
        RF.ReadString(entries);
        Iterator<String> it = entries.iterator();
        inputLines = it.next().split("|");

    }

    public int taskOne(){


        return 0;
    }
}
