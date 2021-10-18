package kyu6.which_are_in;

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1).filter((v) -> {
            for (String hay : array2) {
                if (hay.contains(v)) {
                    return true;
                }
            }

            return false;
        }).sorted().toArray(String[]::new);
    }
}
