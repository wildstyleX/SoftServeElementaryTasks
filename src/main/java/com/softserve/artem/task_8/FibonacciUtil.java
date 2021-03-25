package com.softserve.artem.task_8;

import java.util.List;

public class FibonacciUtil {

    private static int getCountOfDigits(long number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int getNumbersPositionByLength(long length) {
        int returnedValue = 0;
        for (int i = 1; i < length; i++) {
            if (i == 1) {
                returnedValue += 7;
            } else if (i % 4 != 0) {
                returnedValue += 5;
            } else {
                returnedValue += 4;
            }
        }
        return returnedValue;
    }

    public static long[] getRangeOfPositions(long min, long max) {
        long[] returnedValues = new long[2];
        int startPosition = FibonacciUtil.getCountOfDigits(min);
        int endPosition = FibonacciUtil.getCountOfDigits(max);
        returnedValues[0] = FibonacciUtil.getNumbersPositionByLength(startPosition);
        returnedValues[1] = FibonacciUtil.getNumbersPositionByLength(endPosition + 1);
        return returnedValues;
    }

    public static int getChoice() {
        FibonacciScanner scanner = new FibonacciScanner();
        return scanner.parseChoice();
    }

    public static List getList(long length) {
        Fibonacci fibonacci = new Fibonacci();
        return fibonacci.getNumbersInLength(length);
    }

    public static List getList(long[] minAndMax) {
        Fibonacci fibonacci = new Fibonacci();
        return fibonacci.getNumbersInRange(minAndMax[0], minAndMax[1]);
    }
}
