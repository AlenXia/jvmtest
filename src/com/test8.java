package com;

import java.util.ArrayList;

/**
 * @author xzy
 * @date 2022/9/28 19:43
 */
public class test8 {
    private static final int _512KB = 512 * 1024;
    private static final int _1MB = 1024 * 1024;
    private static final int _6MB = 6 * 1024 * 1024;
    private static final int _7MB = 7 * 1024 * 1024;
    private static final int _8MB = 8 * 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
//        ArrayList<byte[]> list = new ArrayList<>();
//        list.add(new byte[_7MB]);
//        list.add(new byte[_512KB]);
//        list.add(new byte[_512KB]);
        /**
         * 一个8MB会直接放入老年堆
         * 两个8MB会直接报错：OutOfMemoryError: Java heap space
         */
//        list.add(new byte[_8MB]);
//        list.add(new byte[_8MB]);

        new Thread(()->{
            ArrayList<byte[]> list = new ArrayList<>();
            list.add(new byte[_8MB]);
            list.add(new byte[_8MB]);
        }).start();

        System.out.println("Sleep......");
        Thread.sleep(100L);
    }
}
