package kyu6.stop_gninnips_my_sdrow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpinWordsRegex {
    public String spinWords(String sentence) {
        Pattern pattern = Pattern.compile("\\w{5,}");
        Matcher matcher = pattern.matcher(sentence);

        return matcher.replaceAll(m -> new StringBuilder(m.group(0)).reverse().toString());
    }
}