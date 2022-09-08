package com.fish.createstream;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * @author fish
 */
public class StreamFromArray {
    public static void main(String[] args) {
        new StreamFromArray().createStreamFromArray();
    }

    public void createStreamFromArray() {
        double[] elements = {3.0, 4.5, 6.7, 2.3};

        DoubleStream stream = Arrays.stream(elements);

        stream.forEach(System.out::println);
    }
}
