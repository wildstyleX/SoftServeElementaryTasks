package com.softserve.artem.task_1;

public class ChessBoard {
    private final int width;
    private final int height;

    public ChessBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toStringChessBoard() {
        String returnedChessBoard = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                returnedChessBoard += ((j + i) % 2 == 0) ? "*" : " ";
            }
            returnedChessBoard += "\n";
        }
        return returnedChessBoard;
    }
}
