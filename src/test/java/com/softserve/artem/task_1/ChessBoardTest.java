package com.softserve.artem.task_1;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ChessBoardTest {
    private String expectedResult;
    private ChessBoard actualBoard;

    public ChessBoardTest(String expectedResult, ChessBoard actualBoard) {
        this.expectedResult = expectedResult;
        this.actualBoard = actualBoard;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"* \n" + " *\n", new ChessBoard(2, 2)},
                {"* *\n" + " * \n" + "* *\n" + " * \n", new ChessBoard(3, 4)},
                {"* * \n" + " * *\n" + "* * \n" + " * *\n" + "* * \n", new ChessBoard(4, 5)}
        });
    }

    @After
    public void tearDown() throws Exception {
        expectedResult = null;
        actualBoard = null;
    }

    @Test
    public void toStringChessBoard() {
        //GIVEN
        //WHEN
        String actualResult = this.actualBoard.toStringChessBoard();
        //THEN
        assertEquals(expectedResult, actualResult);
    }
}
