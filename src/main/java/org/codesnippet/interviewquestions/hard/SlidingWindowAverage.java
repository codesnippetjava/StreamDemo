package org.codesnippet.interviewquestions.hard;

import java.util.*;
import java.util.stream.*;

public class SlidingWindowAverage {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);
      // Output: [9.0, 13.0, 18.0, 27.0]
        int window = 3;
        List<Double> list = IntStream.range(0, (input.size() - (window - 1)))
                .mapToObj(i -> input.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)
                ).toList();
        System.out.println(list);


    }
}
