package com.zzh.File;
import java.io.File;
import java.io.FileFilter;



public class FileFilterDemo {
    public static void main(String[] args) {
        File file = new File("./src/com/zzh/demo1");
        //设置过滤器
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("D");
            }
        };
        if(file.isDirectory()){
            File[] dir = file.listFiles(filter);
            for (int i = 0; i < dir.length; i++) {
                System.out.println(dir[i].getName());
            }
        }

    }
}
