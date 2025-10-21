package org.codesnippet.interviewquestions.hard;

import org.codesnippet.interviewquestions.intermediate.dto.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"John", "IT", 60000),
                new Employee(2,"Alice", "HR", 55000),
                new Employee(3,"Bob", "IT", 75000),
                new Employee(4,"Carol", "HR", 70000),
                new Employee(5,"David", "Finance", 65000),
                new Employee(6,"Eve", "IT", 80000),
                new Employee(7,"Frank", "Finance", 64000),
                new Employee(8,"Ala", "Operations", 44000)
        );

        Optional<Map.Entry<Character, Long>> max = employees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(max);

    }
}
