package com.softserve.artem.task_4;

import java.io.IOException;
import java.nio.file.Files;

public class FileStringFinder extends FileParser {

    public FileStringFinder(String path) {
        super(path);
    }

    public long getEntries(String entry) throws IOException {
        return Files.lines(super.getFilePath())
                .filter(x -> x.matches(entry))
                .count();
    }
}
