package kyu6.which_are_in;

import java.util.Arrays;

public class WhichAreInConcat {
    public static String[] inArray(String[] array1, String[] array2) {
        String str = String.join(" ", array2);

        return Arrays.stream(array1).filter((v) -> {
            return str.contains(v);
        }).sorted().toArray(String[]::new);
    }
}
