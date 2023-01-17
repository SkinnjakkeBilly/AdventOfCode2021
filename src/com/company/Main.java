package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        DayOne dayOne = new DayOne(args[0]);
        System.out.println("Day one. Task one: " + dayOne.taskOne());
        DayTwo dayTwo = new DayTwo(args[0]);
        DayThree dayThree = new DayThree(args[0]);
        DayFour dayFour = new DayFour(args[0]);
        DayFive dayFive = new DayFive(args[0]);
        DaySix daySix = new DaySix(args[0]);
        DaySeven daySeven = new DaySeven(args[0]);
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
        System.out.println();
        System.out.println("Day Six Both: " + daySix.bothTasks());
        System.out.println();
        System.out.println("Day Seven Task One: " + daySeven.taskOne());
        System.out.println("Day Seven Task Two: " + daySeven.taskTwo());


    }
}
