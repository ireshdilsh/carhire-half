package controller;

import dao.UserDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserViewController {

    public AnchorPane pane;

    public void gotoProfile(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("/view/User-Profile-View.fxml"));
       Stage stage= (Stage) this.pane.getScene().getWindow();
       stage.setTitle("Profile");
       stage.setScene(new Scene(root,493,559));
       stage.show();
    }

    public void deleteUser(ActionEvent event) throws IOException{
        Parent parent=FXMLLoader.load(getClass().getResource("/view/User-Delete-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(parent,400,400));
        stage.setTitle("Delete");
        stage.show();
    }

    public void UpdateUser(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/User-Update_view.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Upadte");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
