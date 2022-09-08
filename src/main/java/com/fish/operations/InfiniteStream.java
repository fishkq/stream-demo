package com.fish.operations;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class InfiniteStream {
    public static void main(String[] args) {
        InfiniteStream infiniteStream = new InfiniteStream();
        infiniteStream.generateStreamingData();
        infiniteStream.iterateStreamingData();
    }
    public void generateStreamingData() {
        Stream.generate(() -> UUID.randomUUID().toString())
                .limit(10)
                .forEach(System.out::println);
    }

    public void iterateStreamingData() {
        Stream.iterate(2.0, element -> Math.pow(element, 2.0))
                .limit(5)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
