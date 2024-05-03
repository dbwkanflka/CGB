package com.zzh.Thread;

public class ThreadDemo2 {
    public static void main(String[] args) {

    }
}
class MyRunable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我在跳");
        }
    }
}
class MyRunable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我在跑");
        }
    }
}