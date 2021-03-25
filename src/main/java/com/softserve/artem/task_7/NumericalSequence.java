package com.softserve.artem.task_7;

import java.util.ArrayList;
import java.util.List;

public class NumericalSequence {
    private final int length;
    private final double minimalSquare;

    public NumericalSequence(int length, double minimalSquare) {
        this.length = length;
        this.minimalSquare = minimalSquare;
    }

    public List<Integer> getNumericalSequence() {
        double minimalSquareRootDouble = Math.sqrt(minimalSquare);
        int minimalSquareRootInt = (int) Math.ceil(minimalSquareRootDouble);
        List<Integer> sequenceList = new ArrayList<>();
        for (int n = 0; n < length; n++) {
            sequenceList.add(minimalSquareRootInt + n);
        }
        return sequenceList;
    }
}
