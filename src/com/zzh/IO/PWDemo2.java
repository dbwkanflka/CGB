package com.zzh.IO;
/*
建议记事本工具
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //低级流
        FileOutputStream fos = new FileOutputStream("note.txt",true);
        //转换流
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //字符流
        BufferedWriter bw = new BufferedWriter(osw);
        //行写
        PrintWriter pw = new PrintWriter(bw,true);
        /*输入工具*/
        Scanner sc = new Scanner(System.in);
        String s;
        while(!(s = inputContain(sc)).equals("exit") ){
            pw.println(s);
            pw.flush();
        }
        pw.close();
    }
    static String inputContain(Scanner sc){
        System.out.print("请输入内容:");
        String s = sc.nextLine();
        return s;
    }
}
