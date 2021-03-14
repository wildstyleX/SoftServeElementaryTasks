package com.softserve.artem.task_1;

public class ChessBoardMain {
    public static void main(String[] args) {
        ChessBoardScanner scanner = new ChessBoardScanner();
        int width = scanner.parseInt("Width");
        int height = scanner.parseInt("Height");
        showBoard(width,height);
    }

    private static void showBoard(int width, int height) {
        ChessBoard chessboard = new ChessBoard(width, height);
        System.out.println(chessboard.getCurrentChessBoard());
    }
}
