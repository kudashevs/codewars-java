package kyu8.reversed_words;

public class ReverseWordsLoop {
    public static String reverseWords(String str) {
        String output, tmp;
        output = tmp = "";
        int length = str.length() - 1;

        while (true) {
            if (str.charAt(length) == ' ') {
                output = output + " " + tmp;
                tmp = "";
            } else {
                tmp = str.charAt(length) + tmp;
            }

            if (length == 0) {
                output = output + " " + tmp;
                break;
            }

            length--;
        }

        return output.trim();
    }
}