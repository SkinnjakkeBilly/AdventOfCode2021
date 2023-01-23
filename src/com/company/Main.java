package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        //Bruker args til å slippe å bytte mellom filsti for mac og windows
        DayOne dayOne = new DayOne(args[0]);
        DayTwo dayTwo = new DayTwo(args[0]);
        DayThree dayThree = new DayThree(args[0]);
        DayFour dayFour = new DayFour(args[0]);
        DayFive dayFive = new DayFive(args[0]);
        DaySix daySix = new DaySix(args[0]);
        DaySeven daySeven = new DaySeven(args[0]);
        DayEight dayEight = new DayEight(args[0]);
        System.out.println("Day one, task one: " + dayOne.taskOne());
        System.out.println("Day one, task two: " + dayOne.taskTwo());
        System.out.println();
        System.out.println("Day two, task one: " + dayTwo.taskOne());
        System.out.println("Day two, task Two: " + dayTwo.taskTwo());
        System.out.println();
        System.out.println("Day three, task One: " + dayThree.taskOne());
        System.out.println("Day three, task Two: " + dayThree.taskTwo());
        System.out.println();
        System.out.println("Day four, task One: " + dayFour.taskOne());
        System.out.println("Day four, task Two: " + dayFour.taskTwo());
        System.out.println();
        System.out.println("Day five, task One: " + dayFive.taskOne());
        System.out.println("Day five, task Two: " + dayFive.taskTwo());
        System.out.println();
        //Day six task one skrives fra DaySix.java
        System.out.println("Day six, task Two: " + daySix.bothTasks());
        System.out.println();
        System.out.println("Day seven, task One: " + daySeven.taskOne());
        System.out.println("Day seven, task Two: " + daySeven.taskTwo());
        System.out.println();
        System.out.println("Day eight, task One: " + dayEight.taskOne());
        System.out.println("Day eight, task Two: " + dayEight.taskTwo());


    }
}
