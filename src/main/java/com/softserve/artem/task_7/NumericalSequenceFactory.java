package com.softserve.artem.task_7;

public class NumericalSequenceFactory {

    public static NumericalSequence createNumericalSequence(){
        NumericalSequenceScanner scanner = new NumericalSequenceScanner();
        int length = scanner.parseLengthInt("length");
        int minimalSquare = scanner.parseMinimalSquareInt("minimal square");
        return new NumericalSequence(length,minimalSquare);
    }
}
