package com.zzh.IO;

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前代码输入到控制台中
        FileInputStream fis = new FileInputStream("./src/com/zzh/IO/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String s;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }


        br.close();
    }
}
