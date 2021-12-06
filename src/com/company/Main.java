package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws Exception {

        DayOne dayOne = new DayOne();
        DayTwo dayTwo = new DayTwo();
        DayThree dayThree = new DayThree();
        DayFour dayFour = new DayFour();
        DayFive dayFive = new DayFive();
        System.out.println("Day one. Task one: " + dayOne.taskOne());
        System.out.println("Day one. Task two: " + dayOne.taskTwo());
        System.out.println();
        System.out.println("Day two. Task one: " + dayTwo.taskOne());
        System.out.println("Day Two. Task Two: " + dayTwo.taskTwo());
        System.out.println();
        System.out.println("Day Three Task One: " + dayThree.taskOne());
        System.out.println("Day Three Task Two: " + dayThree.taskTwo());
        System.out.println();
        System.out.println("Day Four Task One: " + dayFour.taskOne());
        System.out.println("Day Four Task Two: " + dayFour.taskTwo());
        System.out.println();
        System.out.println("Day Five Task One: " + dayFive.taskOne());
        System.out.println("Day Five Task Two: " + dayFive.taskTwo());

    }
}
