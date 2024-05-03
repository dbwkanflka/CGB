package com.zzh.exception;

public class ExceptionAPIDemo {
    public static void main(String[] args) {
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            e.printStackTrace();
            String s = e.getMessage();
            System.out.println(s);
            System.out.println("程序结束了");
            throw new RuntimeException(e);
        }
    }
}
