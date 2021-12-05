package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DayFive {
    ReadFile RF = new ReadFile("DayFour");
    ArrayList<String> entries = new ArrayList<>();

    public DayFive() throws FileNotFoundException {
        RF.ReadString(entries);
    }
    public int taskOne() {
        return 0;
    }
    public int taskTwo(){
        return 0;
    }
}
