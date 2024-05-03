package com.zzh.Thread;

/**
 * 使用匿名内部类的方式创建线程
 */
public class threadDemo3 {
    public static void main(String[] args) {
        //第一种继承Thread重写run方法
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("你这那帮");
                }
            }
        };
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("666");
                }
            }
        };
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}
