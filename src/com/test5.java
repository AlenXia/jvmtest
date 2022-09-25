package com;

/**
 * @author xzy
 * @date 2022/9/25 20:31
 */
public class test5 {
    public static void main(String[] args) {
        String s = new String("a") + new String("b");

        String s2 = s.intern();

        System.out.println(s == "ab");
        System.out.println(s2 == "ab");
    }


}
