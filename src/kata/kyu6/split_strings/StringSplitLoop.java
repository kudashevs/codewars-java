package kyu6.split_strings;

import java.util.ArrayList;
import java.util.List;

public class StringSplitLoop {
    public static String[] solution(String s) {
        List<String> res = new ArrayList<String>();

        String[] chars = s.split("");
        String part = "";

        for (int i = 0; i < chars.length; i++) {
            part += chars[i];

            if (i % 2 != 0) {
                res.add(part);
                part = "";
            }
        }

        if (part.length() > 0) {
            res.add(part + "_");
        }

        return res.toArray(new String[0]);
    }
}
