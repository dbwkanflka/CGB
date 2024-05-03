package com.zzh.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.txt");
        for (int i = 0; i < 26; i++) {
            System.out.println(fis.read());
        }
        fis.close();
    }
}
