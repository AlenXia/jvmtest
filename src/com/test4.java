package com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author xzy
 * @date 2022/9/25 20:04
 */
public class test4 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2; // new StringBuilder.append(s1).append(s2).toString()
        String s5 = "a" + "b";
        System.out.println(s3 == s4); // false
        System.out.println(s5 == s3); // true
    }
}
