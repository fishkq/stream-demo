package com.fish.operations;

import java.util.stream.Stream;

/**
 * @author fish
 */
public class MatchOperation {
    public static void main(String[] args) {
        MatchOperation matchOperation = new MatchOperation();
        matchOperation.findAnyMatch();
        matchOperation.findAllMatch();
        matchOperation.findNoneMatch();
    }
    public void findAnyMatch() {
        Stream<String> productCategories = Stream.of("washing machine",
                "Television",
                "Laptop",
                "grocery",
                "essentials");
        boolean match = productCategories.anyMatch(s -> s.equals("Laptop"));
        System.out.println(match);

    }

    public void findAllMatch() {
        Stream<Integer> productCategories = Stream.of(4, 5, 7, 9, 10);
        boolean match = productCategories.allMatch(e -> e < 11);
        System.out.println(match);

    }

    public void findNoneMatch() {
        Stream<Integer> productCategories = Stream.of(4, 5, 7, 9, 10);
        boolean match = productCategories.noneMatch(e -> e < 4);
        System.out.println(match);
    }
}
