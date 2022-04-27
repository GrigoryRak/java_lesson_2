package com.java_learning_2.lesson_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//https://russianblogs.com/article/1472244703/

public class EchoServer {

    private static final int PORT = 8081;

    public static void main(String[] args) {
        System.out.println("Server started");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket clientSoсket = serverSocket.accept();
            System.out.println("Connection accepted");
            DataOutputStream outputStream = new DataOutputStream(clientSoсket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(clientSoсket.getInputStream());
            processClientConnection(inputStream, outputStream);
            inputStream.close();
            outputStream.close();
            clientSoсket.close();
            System.out.println("Closing connections & channels - DONE.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Port connection error " + PORT);
            e.printStackTrace();
        }
    }

    private static void processClientConnection(DataInputStream inputStream, DataOutputStream outputStream) throws IOException, InterruptedException {
        sendMessageForClient(outputStream);
        while (true) {
            try {
                String message = inputStream.readUTF();
                System.out.println("Message from client: " + message);
                if (message.equalsIgnoreCase("/end")) {
                    System.out.println("Client initialize connections suicide ...");
                    outputStream.writeUTF("Server reply - " + message + " - OK");
                    break;
                }
                outputStream.writeUTF("Echo: " + message);
            } catch (IOException e) {
                System.out.println("The network connection was closed");
                break;
            }
        }

    }

    public static void sendMessageForClient(DataOutputStream outputStream) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread(() -> {
                try {
                    System.out.print("Enter message for client: ");
                    String messageForClient = scanner.nextLine();
                    if (!messageForClient.isEmpty()) {
                        outputStream.writeUTF("Message from Server: " + messageForClient);
                        outputStream.flush();
                    }
                } catch (IOException e) {
                    System.err.println("Failed to send message to client.");
                }
        });
        thread.start();
        thread.join();
    }
}

