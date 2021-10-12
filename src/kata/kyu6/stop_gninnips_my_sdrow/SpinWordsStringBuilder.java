package kyu6.stop_gninnips_my_sdrow;

public class SpinWordsStringBuilder {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        
        return String.join(" ", words);
    }
}