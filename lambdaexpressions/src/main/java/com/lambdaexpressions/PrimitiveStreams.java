package com.lambdaexpressions;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams
{

    public static void main(String[] args)
    {
        //Print values from 1 to 3
        IntStream.range(1, 4).forEach(System.out::println);
        //IntFunction,IntPredicate

        // find the average of the numbers squared
        Arrays.stream(new int[] { 1, 2, 3, 4 }).map(n -> n * n).average().ifPresent(System.out::println);

        // map doubles to ints
        Stream.of(1.5, 2.3, 3.7).mapToInt(Double::intValue).forEach(System.out::println);

    }

}
