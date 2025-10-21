package org.codesnippet.interviewquestions.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsStream {
    public static void main(String[] args) {
        String sentence = "Java streams are powerful";
        //avaJ smaerts era lufrewop

        String collect = Arrays.stream(sentence.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (rev,ch) -> ch + rev)  //avaj
                )
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
