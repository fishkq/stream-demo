package com.fish.createstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class StreamFromCollection {
    public static void main(String[] args) {
        new StreamFromCollection().createStreamFromCollection();
    }
    public void createStreamFromCollection() {
        Double[] elements = {3.0, 4.5, 6.7, 2.3};
//        Stream<Double> stream = Arrays.stream(elements);

        List<Double> elementsInCollection = Arrays.asList(elements);
        Stream<Double> stream = elementsInCollection.stream();

        stream.forEach(System.out::println);

        Stream<Double> parallelStream = elementsInCollection.parallelStream();
        parallelStream.forEach(System.out::println);
    }
}
