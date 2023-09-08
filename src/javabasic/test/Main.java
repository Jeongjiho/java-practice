package javabasic.test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < parts.length; i++) {
            String str = my_strings[i];
            int[] part = parts[i];
            sb.append(str.substring(part[0], part[1] + 1));
        }

        System.out.println(sb.toString());

    }

}