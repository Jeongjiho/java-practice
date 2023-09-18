package javabasic.test;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(IntStream.range(0, seoul.length)
                .filter(i -> "Kim".equals(seoul[i]))
                .findFirst()
                .orElse(-1));
    }

}