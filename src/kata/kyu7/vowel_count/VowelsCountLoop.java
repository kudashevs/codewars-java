package kyu7.vowel_count;

public class VowelsCountLoop {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowels = "aeiou";
        
        for(String ch: str.split("")) {
            if (vowels.contains(ch)) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}