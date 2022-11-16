package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DaySeven {

        ReadFile RF = new ReadFile("DaySeven");
        ArrayList<String> entries = new ArrayList<>();

        public DaySeven() throws FileNotFoundException {
            RF.ReadString(entries);
        }

        public int taskOne(){

            return 0;
        }

    }
