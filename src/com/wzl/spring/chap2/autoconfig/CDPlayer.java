package com.wzl.spring.chap2.autoconfig;

import org.springframework.stereotype.Component;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/14 0014
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.paly();
    }
}
