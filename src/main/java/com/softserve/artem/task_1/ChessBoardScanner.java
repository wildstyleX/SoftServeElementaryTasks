package com.softserve.artem.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessBoardScanner {
    static int parseInt(String value) {
        ChessValidator validator = new ChessValidator();
        int number;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input " + value + " :");
            number = scanner.nextInt();
            if (!validator.ChessBoardValuesValidator(number)) {
                number = parseInt(value);
            }
        } catch (InputMismatchException ex) {
            System.err.println("Should be a number");
            number = parseInt(value);
        }
        return number;
    }
}
