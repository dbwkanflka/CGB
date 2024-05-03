package com.zzh.IO;
/*

 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "lbs";
        int age = 20;
        String gender = "女";
        String[] other_info = {"在太原师范学院上学","马上就毕业"};
        Person person = new Person(name, age, gender, other_info);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        System.out.println("写出完毕");
        oos.close();
    }
}
