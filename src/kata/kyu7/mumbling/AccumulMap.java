package kyu7.mumbling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccumulMap {
    public static String accum(String s) {
        List<String> chars = Arrays.asList(s.split(""));

        return IntStream.range(0, chars.size())
                .mapToObj(i -> chars.get(i).toUpperCase() + chars.get(i).toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));
    }
}