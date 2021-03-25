package com.softserve.artem.task_4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileParser {
    private final Path filePath;

    protected FileParser(String path) {
        filePath = Paths.get(path);
    }

    public Path getFilePath() {
        return filePath;
    }
}
