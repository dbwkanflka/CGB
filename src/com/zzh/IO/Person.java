package com.zzh.IO;

import java.io.InvalidClassException;
import java.io.Serializable;
import java.util.Arrays;

/*
对象流序列化和反序列化操作
 */
public class Person implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gander;
    private String[] other_info;
    /*
    无参构造器
     */
    public Person(){}

    /*
    含参构造器
     */
    public Person(String name, int age, String gander, String[] other_info) {
        this.name = name;
        this.age = age;
        this.gander = gander;
        this.other_info = other_info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String[] getOther_info() {
        return other_info;
    }

    public void setOther_info(String[] other_info) {
        this.other_info = other_info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                ", other_info=" + Arrays.toString(other_info) +
                '}';
    }
}
