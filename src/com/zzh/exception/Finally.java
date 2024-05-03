package com.zzh.exception;

public class Finally {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try{
            String s = "abc";
            System.out.println(s.length());
            //无论return是否执行，finally都会执行
            return;
        }catch (Exception e){
            System.out.println("程序出错");
        }finally {
            System.out.println("finally的代码执行");
        }
        System.out.println("程序结束");
    }
}
