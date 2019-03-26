package com.wzl.spring.chap2.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/14 0014
 */
@Configuration
@ComponentScan
//为了指定不同的基础包，你所需要做的就是在@ComponentScan的value属性中指明包的名称：
//1:@ComponentScan("com.wzl.spring.learn.chap2)
//2:@ComponentScan(basePackages = {"com.wzl.spring.learn.chap2",""}) 类型不安全（not type-safe）,重构代码的话，那么所指定的基础包可能就会出现错误了
//@ComponentScan还提供了另外一种方法，那就是将其指定为包中所包含的类或接口：
//@ComponentScan(basePackageClasses = {"CDPlay.class","DVDPlay.class"}) 这些类所在的包将会作为组件扫描的基础包。
public class CDPlayerConfig {
    //@ComponentScan默认会扫描与配置类相同的包。
    //为CDPlayerConfig类位于soundsystem包中，因此Spring将会扫描这个包以及这个包下的所有子包，
    // 查找带有@Component注解的类。这样的话就能找到LoveYourself，在Spring中自动为其创建一个bean。
}
