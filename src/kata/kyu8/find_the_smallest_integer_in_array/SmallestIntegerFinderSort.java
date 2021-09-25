package kyu8.find_the_smallest_integer_in_array;

import java.util.Arrays;

public class SmallestIntegerFinderSort {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);

        return args[0];
    }
}