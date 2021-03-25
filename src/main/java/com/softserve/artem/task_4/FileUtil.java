package com.softserve.artem.task_4;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class FileUtil {
    public static void showEntries(String path, String entries) {
        FileStringFinder finder = new FileStringFinder(path);
        try {
            System.out.println("We got entries = " + finder.getEntries(entries));
        } catch (NoSuchFileException g) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Java has nio problems");
        }
    }

    public static void showReplacement(String path, String src, String replace) {
        FileStringReplacer replacer = new FileStringReplacer(path);
        try {
            replacer.replace(src, replace);
            System.out.println("Replace has been done");
        } catch (NoSuchFileException g) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Java has nio problems");
        }
    }
}
