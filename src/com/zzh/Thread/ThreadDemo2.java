package com.zzh.Thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建线程任务
        MyRunable1 r1 = new MyRunable1();
        MyRunable2 r2 = new MyRunable2();
        //创建两条线程分别执行任务
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        //启动线程
        t1.start();
        t2.start();
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