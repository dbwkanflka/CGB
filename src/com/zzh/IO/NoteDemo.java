package com.zzh.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("./note.txt");
        while(input(fos)){}
        System.out.println("程序退出");
        fos.close();
        FileInputStream fis = new FileInputStream("./note.txt");
        byte[] data = new byte[1024*10];
        int len = fis.read(data);
        String s = new String(data,StandardCharsets.UTF_8);
        System.out.println(s);
        String s1 = new String(data,0,len,StandardCharsets.UTF_8);
        System.out.println(s1);
    }

    /**
     * 将输入的文字写入文件中
     * @param fos 写入的文件
     * @return
     * @throws IOException
     */
    public static boolean  input(FileOutputStream fos) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入文字:");
        String s = sc.nextLine();
        if(s.equals("exit")){
            return false;
        }
        byte[] data = s.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        return true;
    }
}
