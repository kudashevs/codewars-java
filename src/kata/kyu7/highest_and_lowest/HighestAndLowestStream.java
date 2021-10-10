package kyu7.highest_and_lowest;

import java.util.stream.Stream;
import java.util.IntSummaryStatistics;

public class HighestAndLowestStream {
    public static String highAndLow(String numbers) {
        IntSummaryStatistics stats = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    
        return String.format("%d %d", stats.getMax(), stats.getMin());
    }

}
