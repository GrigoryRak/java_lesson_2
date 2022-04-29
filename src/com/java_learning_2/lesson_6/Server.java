package com.java_learning_2.lesson_6;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 8081;

    public static void main(String args[]) throws IOException {
        new Server().start(PORT);
    }

    public void start(int port) {
        System.out.println("Server started");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection accepted");

            InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStream); // Сохранить в буфере
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true); //Передаем клиенту
            InputStreamReader inputStreamReaderConsole = new InputStreamReader(System.in); // Какие данные вводятся консолью
            BufferedReader bufferedReaderForInputConsole = new BufferedReader(inputStreamReaderConsole); // Поместить данные, введенные консолью, в буфер

            inputStreamMessage(bufferedReader);
            outputStreamMessage(bufferedReaderForInputConsole, printWriter);

        } catch (IOException e) {
            System.err.println("Port connection error " + PORT);
            e.printStackTrace();
        }

    }

    private void inputStreamMessage(BufferedReader bufferedReader) {
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (bufferedReader.ready()) {
                        String message = bufferedReader.readLine();
                        System.out.println("Client: " + message);
                        if (message.equalsIgnoreCase("/end")) {
                            System.out.println("Client initialize connections suicide ...");
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("The network connection was closed ");
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
                            System.out.println("Server initialize connections suicide ...");
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

