package kyu8.find_the_smallest_integer_in_array;

public class SmallestIntegerFinderLoop {
    public static int findSmallestInt(int[] args) {
        int min = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }

        return min;
    }
}