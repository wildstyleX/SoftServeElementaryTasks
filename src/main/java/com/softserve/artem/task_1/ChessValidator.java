package com.softserve.artem.task_1;

public class ChessValidator {
    public boolean ChessBoardValuesValidator(int number) {
        try {
            if (number < 2) {
                throw new ChessBoardException("Chess board's width and height should be 2 or more");
            }
        } catch (ChessBoardException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }
}