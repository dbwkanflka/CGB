package com.zzh.exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public void dosome() throws IOException, AWTException{}
    class subClass extends ThrowsDemo{
   //     public void dosome() throws IOException, AWTException{}
        //public void dosome() throws IOException{}部分异常
        //public void dosome() 不抛出异常
   public void dosome() throws FileNotFoundException {}//允许抛出子类异常
    }
}
