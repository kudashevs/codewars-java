package kyu6.split_strings;

public class StringSplitSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s.concat("_");
        }

        return s.split("(?<=\\G.{2})");
    }
}
