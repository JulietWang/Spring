package com.wzl.exer.create;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Map;

/**
 * 〈功能简述〉
 * 〈集合属性的注入〉
 *
 * @author wangzl
 * @create 2019/3/25 0025
 */
public class CollectionBean {

    private List<String> hobby;
    private Set<Integer> numbers;
    private Map<String,String> map;
    private Properties properties;

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
