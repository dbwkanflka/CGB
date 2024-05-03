package com.zzh.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        //低级流读取文件内容
        FileInputStream fis = new FileInputStream("osw.txt");
        //高级流建立在低级流上
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d;
        while((d = isr.read()) != -1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
