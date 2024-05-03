package com.zzh.exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序执行");
        try{
            String s = "";
            /*
            * JVM执行到这里时，就会实例化一个对应的异常实例对象，并将程序执行过程设置进去
            * 然后抛出异常
            */
            System.out.println(s.length());
            System.out.println(s.charAt(0));
        }
        /*
        两种异常处理解决方法不一样
        catch (NullPointerException e){
            *//*try出现空指针后的解决方案*//*
            System.out.println("出现了空指针");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了越界异常");
        }*/
        catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("两种解决方法同意");
        }
        System.out.println("程序结束");
    }
}
