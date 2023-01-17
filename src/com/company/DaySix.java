package com.company;

import java.io.FileNotFoundException;
import java.util.*;

public class DaySix {
    ReadFile RF;
    ArrayList<String> entries = new ArrayList<>();
    String[] nums;
    ArrayList<Integer> ints = new ArrayList<>();
    int[] fish;

    ArrayList<Integer> toAdd = new ArrayList<Integer>();

    //HashMap<Integer, Integer> fish = new HashMap<>();

    public DaySix(String filePath) throws FileNotFoundException {
        RF = new ReadFile(filePath,"DaySix");
        RF.ReadString(entries);
        Iterator<String> it = entries.iterator();
        nums = it.next().split(",");
        fish = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            fish[i] = Integer.parseInt(nums[i]);

        }

    }

    public long bothTasks() {

        long[] gens = new long[9];
        Arrays.fill(gens, 0);
        for (int age : fish) {
            gens[age]++;
        }

        for (int day = 0; day < 256; day++) {
            long parents = gens[0];
            for (int n = 1; n < gens.length; n++) {
                gens[n - 1] = gens[n];
            }
            gens[6] += parents;
            gens[8] = parents;
            if (day == 80) {
                long total1 = Arrays.stream(gens).sum();
                System.out.println("Part 1: " + total1);
            }
        }
        long total2 = Arrays.stream(gens).sum();
        return total2;
    }
}
