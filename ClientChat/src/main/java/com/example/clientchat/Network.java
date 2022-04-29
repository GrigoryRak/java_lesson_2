package com.example.clientchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.function.Consumer;

public class Network {
    public static final String SERVER_HOST = "127.0.0.1";
    public static final int SERVER_PORT = 8081;

    private String host;
    private int port;

    private Socket socket;
    private DataInputStream socketInput;
    private DataOutputStream socketOutput;

    public Network(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Network() {
        this(SERVER_HOST, SERVER_PORT);
    }

    public boolean connect() {
        try {
            socket = new Socket(SERVER_HOST, SERVER_PORT);
            socketOutput = new DataOutputStream(socket.getOutputStream());
            socketInput = new DataInputStream(socket.getInputStream());
            System.out.println("Client connected to socket.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void sendMessage(String message) throws IOException {
        try {
            socketOutput.writeUTF(message);
        } catch (IOException e) {
            System.err.println("Failed to send message to server. Method sendMessage");
            throw e;
        }
    }

    public void waitMessages(Consumer<String> messageHandler) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        String messages = socketInput.readUTF();
                        if (messages.equals("/end")){
                            break;
                        }
                        messageHandler.accept(messages);
                    } catch (IOException e) {
                        System.err.println("Failed to get message from server. Method waitMessages");
                        break;
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public void close(){
        try {
            socketInput.close();
        } catch (Exception e){
            System.err.println("Failed to close socketInput connection");
        }
        try {
            socketOutput.close();
        } catch (Exception e){
            System.err.println("Failed to close socketOutput connection");
        }
        try {
            socket.close();
        } catch (Exception e) {
            System.err.println("Failed to close network connection");
        }
    }

}
