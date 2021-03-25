package com.softserve.artem.task_8;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Long> getNumbersInRange(long min, long max) {
        List<Long> values = new ArrayList<>();
        long[] loopValues = FibonacciUtil.getRangeOfPositions(min, max);
        for (long i = loopValues[0]; i < loopValues[1]; i++) {
            if ((getNumber(i) >= min) && (getNumber(i) <= max)) {
                values.add(getNumber(i));
            }
        }
        return values;
    }

    public List<Long> getNumbersInLength(long length) {
        List<Long> returnedValues = new ArrayList<>();
        long startPosition = FibonacciUtil.getNumbersPositionByLength(length);
        long endPosition = FibonacciUtil.getNumbersPositionByLength(length + 1);
        for (long i = startPosition; i < endPosition; i++) {
            returnedValues.add(getNumber(i));
        }
        return returnedValues;
    }

    private long getNumber(long n) {
        double a = Math.pow(1 + (Math.pow(5, 0.5)), n);
        double b = Math.pow((1 - Math.pow(5, 0.5)), n);
        double c = Math.pow(2, n) * Math.pow(5, 0.5);

        return Math.round((a - b) / c);
    }
}
