package com.wzl.service;

import com.wzl.dao.Car;
import com.wzl.dao.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
@Configuration
public class BeanConfig {

    @Bean(name = "car")
    public Car initCar(){
        Car car = new Car();
        car.setName("宝马");
        car.setPrice("50万");
        return car;
    }

    @Bean(name = "product1")
    public Product showProduct(){
        Product p = new Product();
        p.setPname("空调");
        p.setPnum("34");
        return p;
    }

}
