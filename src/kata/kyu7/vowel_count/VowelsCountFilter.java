package kyu7.vowel_count;

public class VowelsCountFilter {
    public static int getCount(String str) {
        return (int)str.chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }
}