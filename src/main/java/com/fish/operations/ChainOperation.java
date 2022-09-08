package com.fish.operations;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class ChainOperation {
    public static void main(String[] args) {
        new ChainOperation().processStream();
    }
    public void processStream() {
        Double[] elements = {3.0, 4.5, 6.7, 2.3};
        Stream<Double> stream = Stream.of(elements);
        long count = stream.map(e -> e.intValue())
                .filter(e -> e > 3)
                .count();
        System.out.println(count);
    }
}
