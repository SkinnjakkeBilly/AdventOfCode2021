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

        public String taskOne(){
            String tmp = "0";
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if(Integer.parseInt(nums[i])>Integer.parseInt(nums[j])){
                        tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
            return nums[nums.length/2];
        }

    }
