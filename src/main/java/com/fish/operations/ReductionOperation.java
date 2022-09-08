package com.fish.operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class ReductionOperation {
    public static void main(String[] args) {
        ReductionOperation reductionOperation = new ReductionOperation();
        reductionOperation.joinString(",");
        reductionOperation.collectFromStream();
        reductionOperation.aggregateElements();
    }

    public void joinString(final String separator) {
        String[] strings = {"a", "b", "c", "d", "e"};
        Optional<String> joined = Arrays.stream(strings).reduce((s, s2) -> !"".equals(s) ? s + separator + s2 : s2);
        if (joined.isPresent()) {
            System.out.println(joined.get());
        }
    }

    public void collectFromStream() {

        List<String> productCategories = Stream.of(
                "washing machine",
                "Television",
                "Laptop",
                "grocery",
                "essentials")
                .collect(Collectors.toList());

        productCategories.forEach(System.out::println);
    }

    public void aggregateElements() {
        int[] numbers = {5, 2, 8, 4, 55, 9};
        int sum = Arrays.stream(numbers).sum();
        OptionalInt max = Arrays.stream(numbers).max();
        OptionalInt min = Arrays.stream(numbers).min();
        long count = Arrays.stream(numbers).count();
        OptionalDouble average = Arrays.stream(numbers).average();
        System.out.println(sum);
        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());
        System.out.println(count);
        System.out.println(average.getAsDouble());
    }

}
