package com.example.tictactoeapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 850);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        // Set fixed screen size
        stage.setMinHeight(700);
        stage.setMaxHeight(700);
        stage.setMinWidth(850);
        stage.setMaxWidth(850);
        stage.setResizable(false);
        */

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}