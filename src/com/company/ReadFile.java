package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    /**TODO:
     * - Gjør slik at entries[] leser lengde ut fra fil-lengde, og ikke trenger å hardkodes.
     * */

     String filePath = "";

   Scanner in;

    public ReadFile(String fileName) throws FileNotFoundException {
        filePath = "//Users//bendikbreidablikk//Projects//AdventOfCode2021//Input//"+fileName+".txt";
        //static String filePath = "C:\\Kildekode\\AdventOfCode2021\\Input\\"+fileName+".txt";
        in = new Scanner(new File(filePath));
    }

    public ArrayList<String> ReadString(ArrayList<String> entries){
        int i = 0;
        while(in.hasNext()){
            //System.out.println(in.nextLine());
            entries.add(in.nextLine());

            i++;
        }
        return entries;
    }
    public ArrayList<Integer> ReadInt(ArrayList<Integer> entries){
        int i = 0;
        while(in.hasNext()){
            //System.out.println(in.nextLine());
            entries.add(Integer.parseInt(in.nextLine()));
            i++;
        }
        return entries;
    }

}
