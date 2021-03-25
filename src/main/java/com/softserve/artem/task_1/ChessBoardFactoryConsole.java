package com.softserve.artem.task_1;

public class ChessBoardFactoryConsole {
    public static ChessBoard createChessBoard() {
        ChessBoardScanner scanner = new ChessBoardScanner();
        int width = scanner.parseInt("width");
        int height = scanner.parseInt("height");
        return new ChessBoard(width, height);
    }
}
