package com.zzh.exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoClassableDemo {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("fos.dat")
        ){
            fos.write(1);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
