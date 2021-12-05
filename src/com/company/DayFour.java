package com.company;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Stjelt fra redditbruker u/anothergopher
 */
public class DayFour {
    ReadFile RF = new ReadFile("DayFour");
    ArrayList<String> entries = new ArrayList<>();
    String[] nums;
    Pattern rowBingo = Pattern.compile("(00\\s*){5}\\n");
    Pattern colBingo = Pattern.compile("(\\b00(\\s+\\d+){4}\\s+){4}00");
    List<String> boards = new LinkedList<>();

    public DayFour() throws FileNotFoundException {

        RF.ReadString(entries);
        Iterator<String> it = entries.iterator();
        nums = it.next().split(",");
        while (it.hasNext()) {
            it.next();
            boards.add(it.next() + "\n" + it.next() + "\n" + it.next() + "\n" + it.next() + "\n" + it.next() + "\n");
        }
    }
    public int taskOne() {
        for (String num : nums) {
            for (ListIterator<String> iterator = boards.listIterator(); iterator.hasNext(); ) {
                String board = iterator.next();
                String newBoard = board.replaceFirst("\\b" + num + "\\b", "00");
                iterator.set(newBoard);
                if (colBingo.matcher(newBoard).find() || rowBingo.matcher(newBoard).find()) {
                    return score(num, newBoard);
                }
            }
        }
       return 0;
    }

    public int taskTwo() {
        for (String num : nums) {
            for (ListIterator<String> iterator = boards.listIterator(); iterator.hasNext(); ) {
                String board = iterator.next();
                String newBoard = board.replaceFirst("\\b" + num + "\\b", "00");
                iterator.set(newBoard);
                if (colBingo.matcher(newBoard).find() || rowBingo.matcher(newBoard).find()) {
                    iterator.remove();
                    if (boards.isEmpty()) {
                        return score(num, newBoard);
                    }
                }
            }
        }
       return 0;
    }
    int score(String call, String newBoard) {
        return Integer.parseInt(call) * Arrays.stream(newBoard.trim().split("\\s+")).mapToInt(Integer::parseInt).sum();
    }
}


