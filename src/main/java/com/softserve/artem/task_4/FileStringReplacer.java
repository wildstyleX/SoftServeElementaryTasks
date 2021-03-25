package com.softserve.artem.task_4;

import java.io.IOException;
import java.nio.file.Files;

public class FileStringReplacer extends FileParser {

    public FileStringReplacer(String path) {
        super(path);
    }

    public void replace(String src, String replacement) throws IOException {
        Files.write(super.getFilePath(),
                new String(Files.readAllBytes(super.getFilePath()))
                        .replace(src, replacement)
                        .getBytes());
    }
}
