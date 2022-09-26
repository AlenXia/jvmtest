package com;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出演示
 * @author xzy
 * @date 2022/9/26 15:06
 */
public class test6 {
    static int _100Mb=1024*1024*100;
    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();
        int i=0;
        try{
            while (true){
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100Mb);
                list.add(byteBuffer);
                i++;
            }
        }finally {
            System.out.println(i);
        }
    }
}
