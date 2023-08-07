package javabasic.jvolatile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JThread {

    private volatile boolean isStop = false;

    public void run() throws InterruptedException {
        thread1();
        mainThread();
    }

    private void thread1() {
        new Thread(() -> {
            int num = 0;
            while (!isStop) {
                ++num;
            }
            System.out.println("종료");
        }).start();
    }

    private void mainThread() throws InterruptedException {
        Thread.sleep(1000);
        isStop = true;
    }

    public static void main(String[] args) throws InterruptedException {
        new JThread().run();
    }
}
