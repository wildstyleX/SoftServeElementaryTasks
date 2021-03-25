package com.softserve.artem.task_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciScanner {
    private final FibonacciValidator validator;

    public FibonacciScanner() {
        validator = new FibonacciValidator();
    }

    private long parseLong(String value) {
        long number;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input " + value + ":");
            number = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("Must be a number");
            number = parseLong(value);
        }
        return number;
    }

    public int parseChoice() {
        return (int) parseLong("1 - for length option; 2 - for range option");
    }

    public long[] parseMinAndMax(String value) {
        long[] numbers = new long[2];
        numbers[0] = parseLong(value);
        numbers[1] = parseLong(value);
        if (!validator.validateMinAndMax(numbers)) {
            System.err.println("Enter correct values");
            numbers = parseMinAndMax(value);
        }
        return numbers;
    }

    public long parseLength(String value) {
        long number = parseLong(value);
        if (!validator.validateLength(number)) {
            System.err.println("Length must be > 0");
            number = parseLength(value);
        }
        return number;
    }
}
