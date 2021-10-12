package kyu6.split_strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringSplitRegex {
    public static String[] solution(String s) {
        Pattern pattern = Pattern.compile(".{2}");
        Matcher matcher = pattern.matcher(s + "_");

        return matcher.results().map(c -> c.group()).toArray(String[]::new);
    }
}
