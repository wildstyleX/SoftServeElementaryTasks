package com.softserve.artem.task_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericalSequenceScanner {
    private final NumericalSequenceValidator validator;

    public NumericalSequenceScanner() {
        validator = new NumericalSequenceValidator();
    }

    private int parseInt(String value) {
        int number;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input " + value + ":");
            number = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("Entered value must be integer");
            number = parseInt(value);
        }
        return number;
    }

    public int parseLengthInt(String value) {
        int number = parseInt(value);
        if (!validator.isSequenceLengthValid(number)) {
            System.err.println("Sequence length must be > 0");
            number = parseLengthInt(value);
        }
        return number;
    }

    public int parseMinimalSquareInt(String value){
        int number = parseInt(value);
        if (!validator.isMinimalSquareValid(number)) {
            System.err.println("Minimal square must be >= 0");
            number = parseMinimalSquareInt(value);
        }
        return number;
    }
}
