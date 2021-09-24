package kyu8.reversed_words;

public class ReverseWords {
    public static String reverseWords(String str) {
        String output = "";

        for (String part : str.split(" ")) {
            output = part + " " + output;
        }

        return output.trim();
    }
}