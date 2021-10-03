package kyu7.mumbling;

public class AccumulStringLoop {
    public static String accum(String s) {
        String result = s.substring(0, 1).toUpperCase();

        for (int i = 1; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i)).toLowerCase();
            result = result + "-" + ch.toUpperCase() + ch.repeat(i);
        }

        return result;
    }
}