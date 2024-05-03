package com.zzh.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./fos.txt");
        for (int i = 0; i < 26; i++) {
            fos.write(97+i);
        }
        System.out.println("写完成");
        fos.close();
    }
}
