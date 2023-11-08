package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String verifyLogin="Select count(1) from useraccounts where username='"+usernameTextField.getText()+"' and  password='"+passwordPasswordField.getText()+"'";
try{
    Statement statement;
    statement = connectDB.createStatement();
    ResultSet queryResult= statement.executeQuery(verifyLogin);
    while (queryResult.next()){
        if(queryResult.getInt(1)==1){
            loginMessageLabel.setText("Welcome!");
        }
        else{
            loginMessageLabel.setText("Invalid Login.please Try again");
        }
    }
}
catch (SQLException e) {
    throw new RuntimeException(e);
}
    }
    public void setCancelButton(ActionEvent e) {
        Stage stage =(Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtononAction(ActionEvent e) {
//    loginMessageLabel.setText("Try to login!");
        if(usernameTextField.getText().isBlank()==false &&passwordPasswordField.getText().isBlank()==false)
            validateLogin();
        else{
    loginMessageLabel.setText("Enter Vaild Details");
}
    }




}