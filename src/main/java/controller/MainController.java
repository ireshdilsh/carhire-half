package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private AnchorPane Pane;
    public void gotoRegister(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("/view/Register-View.fxml"));
        Stage stage= (Stage) this.Pane.getScene().getWindow();
        stage.setScene(new Scene(root,600,600));
        stage.setTitle("Register");
        stage.show();
    }

    public void gotoDashboard(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.Pane.getScene().getWindow();
        stage.setScene(new Scene(root,950,600));
        stage.setTitle("Welcome");
        stage.show();
    }
}
