package kyu7.highest_and_lowest;

public class HighestAndLowestLoop {
    public static String highAndLow(String numbers) {
        String[] chars = numbers.split(" ");
        Integer[] digits = new Integer[chars.length];

        for (int i = 0; i < chars.length; i++) {
            digits[i] = Integer.parseInt(chars[i]);
        }

        return findMaxMin(digits);
    }

    protected static String findMaxMin(Integer[] numbers) {
        int max, min;
        max = min = numbers[0];

        for (Integer v : numbers) {
            if (v < min) {
                min = v;
            }

            if (v > max) {
                max = v;
            }
        }

        return String.valueOf(max) + " " + String.valueOf(min);
    }
}
