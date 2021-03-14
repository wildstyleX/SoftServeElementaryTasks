package com.softserve.artem.task_7;

import java.util.ArrayList;
import java.util.List;

public class NumericalSequence {
    private int length;
    private double minimalSquare;

    public NumericalSequence() {
        length = 0;
        minimalSquare = 0;
    }

    public NumericalSequence(int length, double minimalSquare) {
        this.length = length;
        this.minimalSquare = minimalSquare;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getMinimalSquare() {
        return minimalSquare;
    }

    public void setMinimalSquare(double minimalSquare) {
        this.minimalSquare = minimalSquare;
    }

    public List<Integer> getNumericalSequence() {
        if ((length == 0) && (minimalSquare == 0)) {
            return null;
        }
        double minimalSquareRootDouble = Math.sqrt(minimalSquare);
        if (minimalSquareRootDouble % 1 != 0 ){
            minimalSquareRootDouble++;
        }
        int minimalSquareRootInt = (int) minimalSquareRootDouble;
        List<Integer> sequenceList = new ArrayList<>();
        for (int n = 0; n < length; n++) {
            sequenceList.add(minimalSquareRootInt + n);
        }
        return sequenceList;
    }
}
