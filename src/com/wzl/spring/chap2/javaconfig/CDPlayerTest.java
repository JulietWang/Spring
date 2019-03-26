package com.wzl.spring.chap2.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/14 0014
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdshouldnotbenull(){
        cd.paly();
        //控制台输出异常
        //意味着Spring不能够发现CompactDisc类，
    }

}
