package kyu6.stop_gninnips_my_sdrow;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWordsMap {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).map((v) -> 
            (v.length() > 4) ? reverse(v) : v
        ).collect(Collectors.joining(" "));
    }

    protected static String reverse(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }
}
