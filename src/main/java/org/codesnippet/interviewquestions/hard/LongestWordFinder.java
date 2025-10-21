package org.codesnippet.interviewquestions.hard;

import java.util.*;
import java.util.stream.*;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "The quick, brown fox jumped over the lazy dog!";

        String s = Arrays.stream(
                        sentence.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" ")
                ).max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(s);

    }
}
