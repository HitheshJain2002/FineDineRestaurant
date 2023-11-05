package com.example.loginpage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.stage.StageStyle;



import java.io.IOException;

public class HelloApplication extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(new Scene(root, 520, 400));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
