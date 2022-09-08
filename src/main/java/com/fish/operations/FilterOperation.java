package com.fish.operations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class FilterOperation {
    public static void main(String[] args) {
        FilterOperation filterOperation = new FilterOperation();
        filterOperation.processStream();
        filterOperation.findFromStream();
    }
    public void processStream() {
        Double[] elements = {3.0, 4.5, 6.7, 2.3};
        Stream<Double> stream = Stream.of(elements);
        stream.filter(e -> e > 3).forEach(System.out::println);
    }

    public void findFromStream() {
        Stream<String> productCategories = Stream.of("washing machine",
                "Television",
                "Laptop",
                "grocery",
                "essentials");
        Optional<String> category = productCategories.findFirst();
        if (category.isPresent()) {
            System.out.println(category.get());
        }
    }
}
