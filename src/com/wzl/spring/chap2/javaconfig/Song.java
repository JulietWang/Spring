package com.wzl.spring.chap2.javaconfig;


/**
 * 〈功能简述〉
 *
 * @author wangzl
 * @create 2019/3/15 0015
 */
public class Song implements CompactDisc {

    private String title = "明天，我要去见你";
    private String artist = "世界第一初恋ed";

    public void paly() {
        System.out.println("Playing " + title + "by" + artist);
    }
}
