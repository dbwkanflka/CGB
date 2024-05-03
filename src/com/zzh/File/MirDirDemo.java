package com.zzh.File;

import java.io.File;

/**
 * 创建目录
 */
public class MirDirDemo {
    public static void main(String[] args) {
        File file = new File("./demo");
        if(file.exists()){
            System.out.println("目录已存在");
        }else{
            file.mkdir();
        }
        File file1 = new File("./a/demo");
        if(file1.exists()){
            System.out.println("目录已存在");
        }else{
            file1.mkdirs();
        }
        if(file.exists()){
            System.out.println("目录已删除");
            file.delete();
        }else{
            System.out.println("目录不存在");
        }
    }
}
