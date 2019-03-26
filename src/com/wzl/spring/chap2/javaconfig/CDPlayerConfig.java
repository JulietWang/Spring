package com.wzl.spring.chap2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈功能简述〉
 * 〈声明简单的bean〉
 *
 * @author wangzl
 * @create 2019/3/14 0014
 */
@Configuration
public class CDPlayerConfig {

    /**
     * @Bean注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean。
     * 可以根据name属性指定其他的名字（song） @Bean(name="sjdycl")
     */
    @Bean
    public CompactDisc compactDisc(){
        return new Song();
    }

/*    @Bean
    public CompactDisc randomSongCD(){
        int i = (int) Math.floor((Math.random()*2));
        if(i == 0){
            return new Song();
        }else{
            return new Song1();
        }
    }*/

    /**
     * 在这里并没有使用默认的构造器构建实例，而是调用了需要传入CompactDisc对象的构造器来创建CDPlayer实例。
     * 看起来，CompactDisc是通过调用compactDisc()得到的，但情况并非完全如此。
     * compactDisc()方法上添加了@Bean注解，Spring将会拦截所有对它的调用，并确保直接
     * 返回该方法所创建的bean，而不是每次都对其进行实际的调用。
     * @return
     */
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(compactDisc());
    }

    /**
     * 默认情况下，Spring中的bean都是单例的，我们并没有必要为第二个CDPlayer bean
     * 创建完全相同的compactDisc实例。所以，Spring会拦截对compactDisc()的调用并确保返
     * 回的是Spring所创建的bean，也就是Spring本身在调用compactDisc()时所创建的
     * CompactDiscbean。
     * @return
     */
    @Bean
    public CDPlayer otherCdPlayer(){
        return new CDPlayer(compactDisc());
    }

    /**
     * 在这里，cdPlayer()方法请求一个CompactDisc作为参数。当Spring调用cdPlayer()
     * 创建CDPlayerbean的时候，它会自动装配一个CompactDisc到配置方法之中。然后，方
     * 法体就可以按照合适的方式来使用它。借助这种技术，cdPlayer()方法也能够
     * 将CompactDisc注入到CDPlayer的构造器中，而且不用明确引用CompactDisc的@Bean
     * 方法。
     * 通过这种方式引用其他的bean通常是最佳的选择，因为它不会要求将CompactDisc声明到
     * 同一个配置类之中。在这里甚至没有要求CompactDisc必须要在JavaConfig中声明，实际上
     * 它可以通过组件扫描功能自动发现或者通过XML来进行配置。你可以将配置分散到多个配置
     * 类、XML文件以及自动扫描和装配bean之中，只要功能完整健全即可。不管CompactDisc
     * 是采用什么方式创建出来的，Spring都会将其传入到配置方法中，并用来创建CDPlayer
     * bean。
     * @param compactDisc
     * @return
     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
