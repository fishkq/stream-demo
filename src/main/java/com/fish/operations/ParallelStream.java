package com.fish.operations;

import java.util.Arrays;
import java.util.List;

/**
 * @author fish
 */
public class ParallelStream {
    public static void main(String[] args) {
        new ParallelStream().processParallelStream();
    }
    public void processParallelStream() {
        List<String> list = Arrays.asList("washing machine",
                "Television",
                "Laptop",
                "grocery");
        list.parallelStream().forEach(System.out::println);
    }
}
