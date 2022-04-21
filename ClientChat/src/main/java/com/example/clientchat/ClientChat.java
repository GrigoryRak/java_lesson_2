package com.example.clientchat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientChat extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientChat.class.getResource("chat-tepmlate.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Клиент Чат");
        stage.setScene(scene);

        ClientController controller = fxmlLoader.getController();
        controller.userListId.getItems().addAll("User_1", "User_2");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}