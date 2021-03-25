package com.softserve.artem.task_7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumericalSequenceUtil {
    public static void showNumericalSequence(NumericalSequence numericalSequence){
        String row = Stream.of(numericalSequence.getNumericalSequence())
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("Your sequence is: " + row);
    }
}
