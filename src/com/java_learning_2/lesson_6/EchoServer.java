package com.java_learning_2.lesson_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    private static final int PORT = 8081;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер начал работу");
            Socket clientSoсket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream inputStream = new DataInputStream(clientSoсket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSoсket.getOutputStream());
            processClientConnection(inputStream, outputStream);
        } catch (IOException e) {
            System.err.println("Ошибка соединения по порту " + PORT);
            e.printStackTrace();
        }
    }

    private static void processClientConnection(DataInputStream inputStream, DataOutputStream outputStream) {
        while (true) {
            try {
                String message = inputStream.readUTF();
                if (message.startsWith("/end")) {
                    break;
                }
                outputStream.writeUTF("Echo: " + message);
            } catch (IOException e) {
                System.out.println("The network connection was closed");
                break;
            }
        }
    }

}
