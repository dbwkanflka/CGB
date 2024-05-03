package com.zzh.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
            FileOutputStream fos = new FileOutputStream("fos.txt",true);
            String line = "super idol的笑容都没你的天";
            byte[] data = line.getBytes(StandardCharsets.UTF_8);
            line = "把炸毁";
            fos.write(data);
            data = line.getBytes(StandardCharsets.UTF_8);
            fos.write(data);



        fos.close();

    }
}
