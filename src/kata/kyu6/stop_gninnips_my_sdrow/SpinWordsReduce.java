package kyu6.stop_gninnips_my_sdrow;

import java.util.Arrays;

public class SpinWordsReduce {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).reduce("", (acc,  v) -> 
            acc + ((v.length() > 4) ? reverse(v) : v) + " "
        ).trim();
    }

    protected static String reverse(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }
}
