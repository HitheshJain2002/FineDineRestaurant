module com.example.loginpage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.loginpage to javafx.fxml;
    exports com.example.loginpage;
}