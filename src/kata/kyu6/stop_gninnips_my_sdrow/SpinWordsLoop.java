package kyu6.stop_gninnips_my_sdrow;

import java.util.List;
import java.util.Arrays;

public class SpinWordsLoop {
    public String spinWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        String result = "";
        
        for (String word : words) {
           if(word.length() > 4) {
               result += reverse(word);
           } else {
               result += word;
           }

           result += " ";
        }
        
        return result.trim();
    }

    protected static String reverse(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }
}
