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


    public String getCurrentBoard() {
        String returnedBoard = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                returnedBoard += ((j + i) % 2 == 0) ? "*" : " ";
            }
            returnedBoard += "\n";
        }
        return returnedBoard;
    }
}
