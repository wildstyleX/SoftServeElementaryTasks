package com.softserve.artem.task_4;

public class FileMain {
    public static void main(String[] args) {
        args = new String[]{"./src/main/resources/java.txt",
                "Java is a class-based, object-oriented programming language",
                "Developer: Oracle Corporation"};
        switch (args.length) {
            case 2 -> FileUtil.showEntries(args[0], args[1]);
            case 3 -> FileUtil.showReplacement(args[0], args[1], args[2]);
            default -> System.out.println("There must be 2 or 3 parameters");
        }
    }
}
