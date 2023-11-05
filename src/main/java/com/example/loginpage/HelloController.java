package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;

public class HelloController {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;


    public  void validateLogin(){
        DatabaseConnection connectnow=new DatabaseConnection();
        Connection  connectDB=connectnow.getConnection();
        String verifyLogin="Select count(1) from useraccounts Where username=\"hit\" and password=\"qwerty\"";

    }
    public void setCancelButton(ActionEvent e) {
        Stage stage =(Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtononAction(ActionEvent e) {
if(usernameTextField.getText().isBlank()==true &&passwordPasswordField.getText().isBlank()==true){
//    loginMessageLabel.setText("Try to login!");
    validateLogin();
}else{
    loginMessageLabel.setText("Enter Vaild Details");
}
    }




}