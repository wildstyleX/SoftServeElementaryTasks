package com.softserve.artem.task_8;

import java.util.ArrayList;
import java.util.List;

public class FibonacciMain {
    public static void main(String[] args) {
        FibonacciScanner scanner = new FibonacciScanner();
        List list = new ArrayList<>();
        switch (FibonacciUtil.getChoice()) {
            case 1 -> list = (FibonacciUtil.getList(scanner.parseLength("number of digits")));
            case 2 -> list = (FibonacciUtil.getList(scanner.parseMinAndMax("minimal Fibonacci number, then input maximal Fibonacci number")));
            default -> System.err.println("Incorrect option");
        }
        list.forEach(System.out::println);
    }
}
