package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class DaySeven {

        ReadFile RF = new ReadFile("DaySeven");
        ArrayList<String> entries = new ArrayList<>();
        String[] nums;

        public DaySeven() throws FileNotFoundException {
            RF.ReadString(entries);
            Iterator<String> it = entries.iterator();
            nums = it.next().split(",");
        }

        public int taskOne() {
            String tmp = "0";

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (Integer.parseInt(nums[i]) > Integer.parseInt(nums[j])) {
                        tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
            int median = 0;
            if(nums.length%2!=0){
                median = nums.length/2;

            }else{
                median = ((Integer.parseInt(nums[(nums.length-1)/2])) + (Integer.parseInt(nums[(nums.length+1)/2]))) / 2;
            }

            int totCost = 0;
            for (int i = 0; i < nums.length; i++) {
             int crab = Integer.parseInt(nums[i]);
             totCost += Math.abs(crab-median);
            }


            return totCost;
        }
    }
