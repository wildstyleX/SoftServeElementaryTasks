package com.softserve.artem.task_1;

public class ChessBoard {
    private int width;
    private int height;

    public ChessBoard() {
    }

    public ChessBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String getCurrentChessBoard() {
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
