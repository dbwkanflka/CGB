package com.zzh.File;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        System.out.println(file.length());
        boolean cw = file.canWrite();
        System.out.println("是否可写"+cw);
        boolean cr = file.canRead();
        System.out.println("是否可读"+cr);
        boolean ih = file.isHidden();
        System.out.println("是否隐藏"+ih);
    }
}
