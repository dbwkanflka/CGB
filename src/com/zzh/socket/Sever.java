package com.zzh.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 */
public class Sever {
    private ServerSocket serverSocket;
    /**
     * 构造方法
     */
    public Sever(){
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 开始方法
     */
    public void start(){
        try {
            System.out.println("等待端连接");
            Socket socket =  serverSocket.accept();
            System.out.println("一个客户端进行连接");
            //通过socket获取输入流对象
            InputStream input = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("客户端说"+br.readLine());
            /*
            *重复读取输入流内容
            *BufferedReader读取时连接的是socket获取的输入流，
            * 当计算机还处于连接状态时，但没有暂时没有发送内容，readLine方法会处于阻塞状态
            * 要么等到客户端发送信息，要么返回值为null(客户端执行了socket.close())方法
            * */
            String line;
            while((line = br.readLine())!=null){
                System.out.println("客户端说"+line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Sever sever = new Sever();
        sever.start();
    }
}
