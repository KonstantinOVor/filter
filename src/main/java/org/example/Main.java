package org.example;

import java.util.Arrays;

public class Main {
    private final static Integer[] arr = {1, 2, 3, 4, 5};
    private final static Filter filter = new MultiplierFilterImpl();

    public static void main(String[] args) {
        Arrays.stream(ArrayFilter.filter(arr, filter))
                .forEach(System.out::println);
    }
}