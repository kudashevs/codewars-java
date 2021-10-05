package kyu8.square_n_sum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquareSum {
    public static int squareSum(int[] n)
    { 
        IntStream numbers = Arrays.stream(n);

        return numbers.reduce(0, (acc, v) -> acc += v * v);
    } 
}
