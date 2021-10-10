package kyu7.highest_and_lowest;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowestCollections {
    public static String highAndLow(String numbers) {
        String[] chars = numbers.split(" ");
        List<Integer> digits = new ArrayList<Integer>(chars.length);
        
        for (String ch : chars) {
            digits.add(Integer.parseInt(ch));
        }

        return String.format("%d %d", Collections.max(digits), Collections.min(digits));
    }

}
