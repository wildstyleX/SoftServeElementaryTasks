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

public class FileStringReplacerTest {
    private Path tempFile, wordFile;
    private FileStringReplacer parser;

    @Before
    public void setUp() throws Exception {
        wordFile = Paths.get("./src/main/resources/java.txt");
        tempFile = Files.createTempFile("temp-", ".tmp");
        parser = new FileStringReplacer(tempFile.toString());
        Files.copy(wordFile, tempFile, StandardCopyOption.REPLACE_EXISTING);
    }

    @After
    public void tearDown() throws Exception {
        Files.delete(tempFile);
        tempFile = null;
        wordFile = null;
        parser = null;
    }

    @Test
    public void replace() throws IOException {
        String oldString = "Java is a class-based, object-oriented programming language";
        String expectedResult = "Developer: Oracle Corporation";

        parser.replace(oldString, "Developer: Oracle Corporation");

        String actualResult = Files.readString(tempFile);
        assertEquals(expectedResult, actualResult);
    }
}
