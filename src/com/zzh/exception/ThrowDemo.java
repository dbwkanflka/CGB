package com.zzh.exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
