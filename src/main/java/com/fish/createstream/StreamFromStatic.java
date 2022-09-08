package com.fish.createstream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class StreamFromStatic {
    public static void main(String[] args) {
        new StreamFromStatic().createStreamsFromStatic();
    }
    public void createStreamsFromStatic() {
        Stream<Integer> stream = Stream.of(3, 4, 6, 2);
        stream.forEach(System.out::println);

        IntStream integerStream = IntStream.of(3, 4, 6, 2);
        integerStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(3l, 4l, 6l, 2l);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(3.0, 4.5, 6.7, 2.3);
        doubleStream.forEach(System.out::println);


    }
}
