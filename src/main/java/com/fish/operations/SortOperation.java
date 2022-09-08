package com.fish.operations;

import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class SortOperation {
    public static void main(String[] args) {
        SortOperation sortOperation = new SortOperation();
        sortOperation.sortElements();
        sortOperation.sortElementsWithComparator();
    }
    public void sortElements() {
        Stream<Integer> productCategories = Stream.of(4, 15, 8, 7, 9, 10);
        Stream<Integer> sortedStream = productCategories.sorted();
        sortedStream.forEach(System.out::println);
    }

    public void sortElementsWithComparator() {
        Stream<Integer> productCategories = Stream.of(4, 15, 8, 7, 9, 10);
        Stream<Integer> sortedStream = productCategories.sorted((o1, o2) -> o2 - o1);
        sortedStream.forEach(System.out::println);
    }
}
