package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        DayOne dayOne = new DayOne();
        DayTwo dayTwo = new DayTwo();
        System.out.println("Day one. Task one: " + dayOne.TaskOne());
        System.out.println("Day one. Task two: " + dayOne.TaskTwo());
        System.out.println("Day two. Task one: " + dayTwo.TaskOne());
        System.out.println("Day Two. Task Two: " + dayTwo.TaskTwo());
    }
}
