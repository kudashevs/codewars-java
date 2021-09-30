package kyu7.vowel_count;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsCountRegex {
    public static int getCount(String str) {
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(str);

        return (int) matcher.results().count();
    }
}