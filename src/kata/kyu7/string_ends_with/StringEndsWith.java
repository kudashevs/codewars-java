package kyu7.string_ends_with;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        int stringLength = str.length();
        int endingLength = ending.length();
 
        return stringLength >= endingLength && str.substring(stringLength - endingLength, stringLength).equals(ending);
    }
}
