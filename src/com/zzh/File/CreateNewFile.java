package com.zzh.File;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        if(file.exists()){
            System.out.println("文件已存在");
        }else{
            file.createNewFile();
        }
        if (file.exists()){
            System.out.println("文件已删除");
            file.delete();
        }else{
            System.out.println("文件不存在");
        }
    }
}
