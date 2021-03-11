package com.softserve.artem.task_1;

public class ChessUtil {

    public String getChessBoard(int[] args) {
            int width = args[0];
            int height = args[1];
            ChessBoard board = new ChessBoard(width, height);
            return board.getCurrentBoard();
    }
}