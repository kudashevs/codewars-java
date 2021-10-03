package kyu7.mumbling;

public class AccumulArrayLoop {
    public static String accum(String s) {
        String[] parts = s.split("");
        String[] words = new String[parts.length];
        
        int i = 0;
        for (String ch: parts) {
            words[i] = ch.toUpperCase() + ch.toLowerCase().repeat(i);
            i++;
        }

        return String.join("-", words);
    }
}