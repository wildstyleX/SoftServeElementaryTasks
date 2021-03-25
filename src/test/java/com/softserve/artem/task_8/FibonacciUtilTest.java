package com.softserve.artem.task_8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciUtilTest {
    private final int expectedResult;
    private final int actualResult;

    public FibonacciUtilTest(int expectedResult, int actualResult) {
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {7, FibonacciUtil.getNumbersPositionByLength(2)},
                {12, FibonacciUtil.getNumbersPositionByLength(3)},
                {17, FibonacciUtil.getNumbersPositionByLength(4)}
        });
    }

    @Test
    public void getNumbersPositionByLength() {
        //GIVEN
        //WHEN
        //THEN
        assertEquals(expectedResult, actualResult);
    }
}
