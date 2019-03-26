package com.wzl.spring.chap2.autoconfig;

import org.springframework.stereotype.Component;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/14 0014
 */
//这个bean所给定的ID为sgtPeppers，也就是将类名的第一个字母变为小写 即loveYourself
//@Component
//如想为这个bean设置不同的ID，将期望的ID作为值传递给@Component注解
@Component("LoveYourself")
public class LoveYourself implements CompactDisc {

    private String title = "Love Yourself";
    private String artist = "Eric Nam";

    @Override
    public void paly() {
        System.out.println("Playing " + title + "by" + artist);
    }
}
