package com.softserve.artem.task_1;

public class ChessMain {
    public static void main(String[] args) {
        int width = ChessBoardScanner.parseInt("Width");
        int height = ChessBoardScanner.parseInt("Height");
        showBoard(new int[]{width, height});
    }

    private static void showBoard(int[] args) {
        ChessUtil util = new ChessUtil();
        System.out.println(util.getChessBoard(args));
    }
}
