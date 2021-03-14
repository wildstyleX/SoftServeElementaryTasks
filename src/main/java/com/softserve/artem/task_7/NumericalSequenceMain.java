package com.softserve.artem.task_7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumericalSequenceMain {
    public static void main(String[] args) {
        NumericalSequenceScanner scanner = new NumericalSequenceScanner();
        int length = scanner.parseLengthInt("Length");
        int minimalSquare = scanner.parseMinimaSquareInt("Minimal Square");
        NumericalSequence numericalSequence = new NumericalSequence(length, minimalSquare);
        String row = Stream.of(numericalSequence.getNumericalSequence())
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("Your sequence is: " + row + ".");
    }
}
