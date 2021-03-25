package com.softserve.artem.task_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static org.junit.Assert.assertEquals;

public class FileStringFinderTest {

    private Path tempFile, wordFile;
    private FileStringFinder finder;

    @Before
    public void setUp() throws Exception {
        wordFile = Paths.get("./src/main/resources/java.txt");
        tempFile = Files.createTempFile("temp-", ".tmp");
        finder = new FileStringFinder(tempFile.toString());
        Files.copy(wordFile, tempFile, StandardCopyOption.REPLACE_EXISTING);
    }
    @After
    public void tearDown() throws Exception {
        Files.delete(tempFile);
        tempFile = null;
        wordFile = null;
        finder = null;
    }

    @Test
    public void getEntries() throws IOException {

        String oldString = "Java is a class-based, object-oriented programming language";

        long expectedResult = 1;
        long actualResult = finder.getEntries(oldString);

        assertEquals(expectedResult, actualResult);
    }
}
