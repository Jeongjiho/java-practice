package javabasic.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<StringBuffer> stringBuffers = new ArrayList<>();
        List<StringBuffer> stringBuffers1 = new ArrayList<>();

        StringBuffer sb = new StringBuffer();

        sb.append("1");

        stringBuffers.add(sb);
        stringBuffers1.add(sb);

        System.out.println("==========================TEST1==========================");
        System.out.println(stringBuffers.get(0));
        System.out.println(stringBuffers1.get(0));

        sb.append("2");

        System.out.println("==========================TEST2==========================");
        System.out.println(stringBuffers.get(0));
        System.out.println(stringBuffers1.get(0));

    }

}