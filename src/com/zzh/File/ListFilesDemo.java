package com.zzh.File;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        FileFilter filter = new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.contains("o");
            }
        };
        if(dir.isDirectory()){
            File[] subs = dir.listFiles(filter);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}