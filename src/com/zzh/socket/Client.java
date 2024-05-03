package com.zzh.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天客户端
 */
public class Client {
    private  Socket socket;
    /**
    定义构造方法
     */
    public Client() {
        try {
            System.out.println("正在连接服务器");
            socket = new Socket("localhost", 8088);
            System.out.println("与服务端建立联系");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
    开始工作方法
     */
    public void start(){
        try {
            //获取输出流，低级流连接两台计算机
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("请输入:");
                String line = sc.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                /*
                * socket提供了close方法，可以与远端链接的计算机断开，
                * 该方法调用时，而会自动关闭其他输入输出流
                * */
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
