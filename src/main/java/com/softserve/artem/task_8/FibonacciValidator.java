package com.softserve.artem.task_8;

public class FibonacciValidator {
    public boolean validateMinAndMax(long[] values) {
        if ((values[0] < 0) || (values[1] <= 0)) {
            return false;
        }
        return !(values[0] > values[1]);
    }

    public boolean validateLength(long length) {
        return length > 0;
    }
}
