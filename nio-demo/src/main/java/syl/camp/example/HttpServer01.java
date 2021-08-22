package syl.camp.example;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:
 * 【课程示例】 单线程的 Socket
 *
 * @author sunyl
 * @date 2021/8/14 8:06 下午
 * @see syl.camp.example
 */
@Slf4j
public class HttpServer01 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8801);
        while (true) {
            try {
                log.info("Current Thread Name is :{}", Thread.currentThread().getName());
                Socket socket = serverSocket.accept();
                service(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void service(Socket socket) {
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "Hello,nio1";

            // HTTP/1.1 中规定，如果一个请求中包含 message-body，则必须包含 Content-Length，所以如果将下行代码注掉，在浏览器中访问会报错
            // > If a request contains a message-body and a Content-Length is not given,
            // the server SHOULD respond with 400 (bad request) if it cannot determine the length of the message,
            // or with 411 (length required) if it wishes to insist on receiving a valid Content-Length.
            // 附原文链接：https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html
            printWriter.println("Content-Length:" + body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            printWriter.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
