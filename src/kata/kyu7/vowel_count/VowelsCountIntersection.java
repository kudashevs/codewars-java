package kyu7.vowel_count;

import java.util.ArrayList;
import java.util.Arrays;

public class VowelsCountIntersection {
    public static int getCount(String str) {
        ArrayList<String> chars = new ArrayList<String>(Arrays.asList(str.split("")));
        ArrayList<String> vowels = new ArrayList<String>(Arrays.asList("aeiou".split("")));
        
        chars.retainAll(vowels);
        
        return chars.size();
    }
}