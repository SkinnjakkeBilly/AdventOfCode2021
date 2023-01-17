package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class DaySeven {

    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();
    String[] nums;
    int median;

    public DaySeven(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath, "DaySevenEx");
        RF.ReadString(entries);
        Iterator<String> it = entries.iterator();
        nums = it.next().split(",");
        sortCrabs();
    }

    public int taskOne() {
        median = getMedian();
        int totCost = 0;

        for (int i = 0; i < nums.length; i++) {
            int crab = Integer.parseInt(nums[i]);
            totCost += Math.abs(crab - median);
        }
        return totCost;
    }

    public int taskTwo() {
        //BRUK SNITTET ISTEDEN. EG ER DUM :(
        median = getMedian();
        int length;
        int ret = 0;

        for (int i = 0; i < nums.length; i++) {

            int crab = Integer.parseInt(nums[i]);
            length = Math.abs(crab - median);
            /*
            For-løkken under kan byttes ut med den litt vakrere og mer effektive:
            ret+=((length*length)+length)/2;
            ...
            Hadde man bare husket nok formler fra Høgskolen :P
            Jeg lar den stå for å se om jeg kan få det til å funke med min opprinnelige magefølelse.
             */
            for(int j = 1; j<=length; j++){
                ret+= j;
            }
            //93030609
        }
        return ret;
    }

    private void sortCrabs() {
        String tmp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i]) > Integer.parseInt(nums[j])) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    private int getMedian() {
        int median;
        if (nums.length % 2 != 0) {
            median = nums.length / 2;

        } else {
            //FUNKER IKKE! brukte bare median = nums.length / 2 i steden;
            median = ((Integer.parseInt(nums[(nums.length-1) / 2])) + (Integer.parseInt(nums[((nums.length+1) / 2)]))) / 2;
        }
        return median;
    }
}
