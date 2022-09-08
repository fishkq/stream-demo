package com.fish.operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class MapOperation {
    public static void main(String[] args) {
        MapOperation operation = new MapOperation();
        operation.mapStream();
        operation.flatmapStream();
    }

    public void mapStream() {
        Stream<String> productCategories = Stream.of("washing machine",
                "Television",
                "Laptop",
                "grocery",
                "essentials");
        List<String> categoryCodes = productCategories.map(element -> {
            String code = null;
            switch (element) {
                case "washing machine":
                    code = "1";
                    break;
                case "Television":
                    code = "2";
                    break;
                case "Laptop":
                    code = "3";
                    break;
                case "grocery":
                    code = "4";
                    break;
                case "essentials":
                    code = "5";
                    break;
                case "default":
                    code = "6";
            }
            return code;
        }).collect(Collectors.toList());

        categoryCodes.forEach(System.out::println);
    }

    public void flatmapStream() {
        List<List<String>> productByCategories = Arrays.asList(Arrays.asList("washing machine", "Television"),
                Arrays.asList("Laptop", "Camera", "Watch"),
                Arrays.asList("grocery", "essentials"));

        List<String> products = productByCategories.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(products);

    }
}
