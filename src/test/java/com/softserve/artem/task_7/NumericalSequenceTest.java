package com.softserve.artem.task_7;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class NumericalSequenceTest {

    private String expectedResult;
    private NumericalSequence sequence;

    public NumericalSequenceTest(String expectedResult, NumericalSequence sequence) {
        this.expectedResult = expectedResult;
        this.sequence = sequence;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"[0, 1, 2, 3, 4]", new NumericalSequence(5, 0)},
                {"[4, 5, 6, 7, 8, 9, 10, 11]", new NumericalSequence(8, 10)},
                {"[6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]", new NumericalSequence(12, 35)},
                {"[43, 44, 45, 46, 47, 48, 49]", new NumericalSequence(7, 1832)},
                {"[136, 137, 138, 139]", new NumericalSequence(4, 18239)}
        });
    }

    @After
    public void tearDown() throws Exception {
        expectedResult = null;
        sequence = null;
    }

    @Test
    public void getNumericSequence() {
        String actualResult = Stream.of(sequence.getNumericalSequence())
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        assertEquals(expectedResult, actualResult);
    }
}
