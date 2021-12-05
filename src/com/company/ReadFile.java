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
        //filePath = "C:\\Kildekode\\AdventOfCode2021\\Input\\"+fileName+".txt";
        in = new Scanner(new File(filePath), "UTF-8");
    }

    public ArrayList<String> ReadString(ArrayList<String> entries){
        while(in.hasNext()){
            entries.add(in.nextLine());
        }
        return entries;
    }
    public ArrayList<Integer> ReadInt(ArrayList<Integer> entries){
        while(in.hasNext()){
            entries.add(Integer.parseInt(in.nextLine()));
        }
        return entries;
    }

}
