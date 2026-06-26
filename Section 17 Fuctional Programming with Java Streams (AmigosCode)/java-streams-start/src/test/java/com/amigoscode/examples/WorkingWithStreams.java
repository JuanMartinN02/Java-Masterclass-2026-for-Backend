package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void steams() {

        List<String> names = List.of("Amigoscode", "Alex", "Zara");

        Object[] array = names.stream().sorted().toArray();

        System.out.println(Arrays.toString(array));
    }
}
