package com.zzh.IO;

import java.io.*;

public class ISDemo {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[1024*10];//10kb的缓冲区
        int len;

        FileInputStream fis = new FileInputStream("fos");
        FileOutputStream fos = new FileOutputStream("fos_cp");
        while((len = fis.read(data)) != -1){
            fos.write(data,0,len);
        }
        fos.close();
        fis.close();


    }
}
