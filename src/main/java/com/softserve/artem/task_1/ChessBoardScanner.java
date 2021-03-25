package com.softserve.artem.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessBoardScanner {
    public int parseInt(String value) {
        ChessBoardValidator validator = new ChessBoardValidator();
        int number;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input " + value + ":");
            number = scanner.nextInt();
            if (!validator.isChessBoardValid(number)) {
                System.err.println("Chess board's width and height must be 2 or more");
                number = parseInt(value);
            }
        } catch (InputMismatchException ex) {
            System.err.println("The value must be an integer");
            number = parseInt(value);
        }
        return number;
    }
}
