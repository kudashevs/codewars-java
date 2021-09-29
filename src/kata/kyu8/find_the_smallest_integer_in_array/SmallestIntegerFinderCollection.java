package kyu8.find_the_smallest_integer_in_array;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class SmallestIntegerFinderCollection {
    public static int findSmallestInt(int[] args) {
        List<Integer> list = new ArrayList<Integer>(args.length);
        for (int i : args) {
            list.add(Integer.valueOf(i));
        }

        return Collections.min(list);
    }
}