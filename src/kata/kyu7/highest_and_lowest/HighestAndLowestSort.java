package kyu7.highest_and_lowest;

import java.util.Arrays;

public class HighestAndLowestSort {
    public static String highAndLow(String numbers) {
        String[] chars = numbers.split(" ");
        Integer[] digits = new Integer[chars.length];

        for (int i = 0; i < chars.length; i++) {
            digits[i] = Integer.parseInt(chars[i]);   
        }

        Arrays.sort(digits);

        return String.format("%d %d", digits[digits.length - 1], digits[0]);
    }
}
