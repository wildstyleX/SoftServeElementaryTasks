package com.softserve.artem.task_8;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {
    private List<Long> expectedResultInRange;
    private List<Long> actualResultInRange;
    private List<Long> expectedResultInLength;
    private List<Long> actualResultInLength;

    public FibonacciTest(List<Long> expectedResultInRange, List<Long> actualResultInRange,
                         List<Long> expectedResultInLength, List<Long> actualResultInLength) {
        this.expectedResultInRange = expectedResultInRange;
        this.actualResultInRange = actualResultInRange;
        this.expectedResultInLength = expectedResultInLength;
        this.actualResultInLength = actualResultInLength;
    }

    @Parameterized.Parameters
    public static Collection input() {
        Fibonacci fibonacci = new Fibonacci();
        return Arrays.asList(new Object[][]{
                {List.of(0L, 1L, 1L, 2L, 3L, 5L, 8L), fibonacci.getNumbersInRange(0L, 10L),
                        List.of(0L, 1L, 1L, 2L, 3L, 5L, 8L), fibonacci.getNumbersInLength(1)},
                {List.of(13L, 21L, 34L, 55L, 89L), fibonacci.getNumbersInRange(10L, 100L),
                        List.of(144L, 233L, 377L, 610L, 987L), fibonacci.getNumbersInLength(3)},
                {List.of(1597L, 2584L, 4181L, 6765L), fibonacci.getNumbersInRange(1000L, 10000L),
                        List.of(10946L, 17711L, 28657L, 46368L, 75025L), fibonacci.getNumbersInLength(5)}
        });
    }

    @After
    public void tearDown() throws Exception {
        expectedResultInRange = null;
        actualResultInRange = null;
        expectedResultInLength = null;
        actualResultInLength = null;
    }

    @Test
    public void getNumbersInRange() {
        //GIVEN
        //WHEN
        //THEN
        assertEquals(expectedResultInRange, actualResultInRange);
    }

    @Test
    public void getNumbersInLength() {
        //GIVEN
        //WHEN
        //THEN
        assertEquals(expectedResultInLength, actualResultInLength);
    }
}
