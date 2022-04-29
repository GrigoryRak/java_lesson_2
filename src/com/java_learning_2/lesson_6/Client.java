package com.java_learning_2.lesson_6;

import java.io.*;
import java.net.Socket;

public class Client {

    private static final int PORT = 8081;
    private static final String HOST = "127.0.0.1";

    public static void main(String[] args) throws IOException {
        new Client().start(HOST, PORT);
    }

    public void start(String host, int port) {
        try (Socket socket = new Socket(host, port);
             InputStreamReader inputStream = new InputStreamReader(socket.getInputStream());
             BufferedReader bufferedReader = new BufferedReader(inputStream); // Сохранить в буфере
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true); //Передаем клиенту
             InputStreamReader inputStreamReaderConsole = new InputStreamReader(System.in); // Какие данные вводятся консолью
             BufferedReader bufferedReaderForInputConsole = new BufferedReader(inputStreamReaderConsole); // Поместить данные, введенные консолью, в буфер
        ) {
            System.out.println("Client started");

            while(!socket.isClosed()){
                inputStreamMessage(bufferedReader);
                outputStreamMessage(bufferedReaderForInputConsole, printWriter);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void inputStreamMessage(BufferedReader bufferedReader) {
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (bufferedReader.ready()) {
                        String message = bufferedReader.readLine();
                        System.out.println("Server: " + message);
                        if (message.equalsIgnoreCase("/end")) {
                            System.out.println("Server initialize connections suicide ...");
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("The network connection was closed");
                    System.exit(0);
                }
            }
        }).start();
    }

    private void outputStreamMessage(BufferedReader bufferedReaderForInputConsole, PrintWriter printWriter) {
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (bufferedReaderForInputConsole.ready()) {
                        String message = bufferedReaderForInputConsole.readLine();
                        if (message.equalsIgnoreCase("/end")) {
                            System.out.println("Client initialize connections suicide ...");
                            System.exit(0);
                        }
                        printWriter.println(message);
                    }
                } catch (IOException e) {
                    System.out.println("The network connection was closed");
                    System.exit(0);
                }
            }
        }).start();
    }


}
