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
            System.err.println("Value must be an integer");
            number = parseLengthInt(value);
        }
        return number;
    }

        public int parseLengthInt(String value) {
            int number = parseInt(value);
            if (!validator.sequenceLengthValidator(number)) {
                number = parseLengthInt(value);
            }
            return number;
        }

        public int parseMinimaSquareInt (String value){
            int number = parseInt(value);
            if (!validator.minimalSquareValidator(number)) {
                number = parseMinimaSquareInt(value);
            }
            return number;
        }
    }
