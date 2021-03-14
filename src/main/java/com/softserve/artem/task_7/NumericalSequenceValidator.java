package com.softserve.artem.task_7;

public class NumericalSequenceValidator {
    public boolean sequenceLengthValidator(int number) {
        if (number <= 0) {
            System.err.println("Sequence length must be > 0");
            return false;
        }
        return true;
    }

    public boolean minimalSquareValidator(int number) {
        if (number <= 0) {
            System.err.println("Number row should be > 0");
            return false;
        }
        return true;
    }
}
