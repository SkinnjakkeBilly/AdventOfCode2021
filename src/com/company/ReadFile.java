package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    String filePath = "";
    Scanner in;

    public ReadFile(String filePath, String fileName) throws FileNotFoundException {

        filePath = filePath+fileName+".txt";
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
