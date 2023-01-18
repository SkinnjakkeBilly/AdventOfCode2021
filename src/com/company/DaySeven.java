package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class DaySeven {

    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();
    String[] nums;
    int median;
    int snitt;

    public DaySeven(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath, "DaySeven");
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
        snitt = getSnitt();

        int length;
        int ret = 0;

        for (String num : nums) {
            int crab = Integer.parseInt(num);
            length = Math.abs(crab - snitt);
            ret += ((length * length) + length) / 2;
        }

        return ret;
        //92676748
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
        if (nums.length % 2 != 0) {
            median = nums.length / 2;
        } else {
            median = ((Integer.parseInt(nums[(nums.length-1) / 2])) + (Integer.parseInt(nums[((nums.length+1) / 2)]))) / 2;
        }
        return median;
    }

    public int getSnitt(){
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return (int) Math.ceil((double)sum / nums.length);
    }
}
