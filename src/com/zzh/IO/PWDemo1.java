package com.zzh.IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向文件pw.txt中写入内容
        PrintWriter pw = new PrintWriter("pw.txt", "UTF_8");
        /*写入一行数据，自动换行*/
        pw.println("dnhoanlm");
        pw.println("dbafsnlkan");
        pw.close();
    }
}
