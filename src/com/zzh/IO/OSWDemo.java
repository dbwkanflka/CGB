package com.zzh.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        //建立在低级流上
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line = "dnuoanfdafs";
        /*可以直接写字符串*/
        osw.write(line);
        osw.close();
    }
}
