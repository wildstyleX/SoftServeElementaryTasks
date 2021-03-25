package com.softserve.artem.task_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ChessBoardValidatorTest {
    private final boolean expectedResult;
    private final boolean actualResult;

    public ChessBoardValidatorTest(boolean expectedResult, boolean actualResult) {
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        ChessBoardValidator validator = new ChessBoardValidator();
        return Arrays.asList(new Object[][]{
                {true, validator.isChessBoardValid(2)},
                {false, validator.isChessBoardValid(1)},
                {true, validator.isChessBoardValid(5)}
        });
    }

    @Test
    public void validChessArgsValidator() {
        //GIVEN
        //WHEN
        //THEN
        assertEquals(expectedResult, actualResult);
    }
}
