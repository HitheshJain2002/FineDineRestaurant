package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button cancelButton;

    public void setCancelButton(ActionEvent e) {
        Stage stage =(Stage) cancelButton.getScene().getWindow();
    }

}