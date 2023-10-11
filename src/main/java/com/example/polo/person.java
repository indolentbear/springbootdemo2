package com.example.polo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @AUTHER XXY
 * @DATE 2023/10/11
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class person {
    private String name;
    private int age;
    private String gender;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
//    private pet pet;

    public person() {
    }

    public person(String name, int age, String gender, Date birth, Map<String, Object> maps, List<Object> lists) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.maps = maps;
        this.lists = lists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirth() {
        return birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }
}
