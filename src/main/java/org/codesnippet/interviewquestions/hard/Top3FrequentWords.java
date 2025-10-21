package org.codesnippet.interviewquestions.hard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Top3FrequentWords {
    public static void main(String[] args) {
        String paragraph = "Java is great great is. Java is object oriented. Java streams are powerful, and Java is fun!";

        Map<String, Long> map = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(map);

        List<Map.Entry<String, Long>> sorted = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();
        System.out.println(sorted);
        List<Long> topFrequency = sorted.stream()
                .map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .toList();
        System.out.println(topFrequency);

        List<Map.Entry<String, Long>> list = sorted.stream()
                .filter(e -> topFrequency.contains(e.getValue()))
                .toList();
        System.out.println(list);

    }
}
