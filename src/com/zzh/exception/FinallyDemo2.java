package com.zzh.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
异常处理机制中IO的使用
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        //用于将fos变为全局变量
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.dat");
            fos.write(1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //规定
            try {
                /*确保fos是流才能被关闭，否则会报错*/
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
