package com.wzl.spring.chap2.javaconfig;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/15 0015
 */
public class Song1 implements CompactDisc {

    private String title = "Love Yourself";
    private String artist = "Eric Nam";

    public void paly() {
        System.out.println("Playing " + title + "by" + artist);
    }
}
