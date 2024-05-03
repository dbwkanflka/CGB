package com.zzh.IO;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        //读取数据
        FileInputStream fis = new FileInputStream("fos.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        //写数据
        FileOutputStream fos = new FileOutputStream("note.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len = 0;
        while( (len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();

    }
}
