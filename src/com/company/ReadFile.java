package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    /**TODO:
     * - Gjør slik at filepath settes ut fra hvilken klasse som leser. pæss det som parameter, eller les hvem som kaller?
     * - Gjør slik at entries[] leser lengde ut fra fil-lengde, og ikke trenger å hardkodes.
     * */

    //static String filePath = "//Users//bendikbreidablikk//IdeaProjects//AdventOfCode2020//Assets//DayThreeInput.txt";
    static String filePath = "C:\\Kildekode\\AdventOfCode2021\\Input\\DayTwo.txt";
    Scanner in = new Scanner(new File(filePath));

    public ReadFile() throws FileNotFoundException {
    }

    public String[] ReadList(String entries[]){
        int i = 0;
        while(in.hasNext()){
            //System.out.println(in.nextLine());
            entries[i] = in.nextLine();
            i++;
        }
        return entries;
    }
    public int[] ReadList(int entries[]){
        int i = 0;
        while(in.hasNext()){
            //System.out.println(in.nextLine());
            entries[i] = in.nextInt();
            i++;
        }
        return entries;
    }
}
