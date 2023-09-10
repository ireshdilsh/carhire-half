package controller;

import dao.UserDao;
import entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;


public class UserDeleteViewController {

    public TextField idText;
    public AnchorPane pane;

    public void deleteUser(ActionEvent event) throws IOException {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("User Delete");
        alert.setContentText("Do You Want To Delete Your Account ? ");
        if (alert.showAndWait().get()== ButtonType.OK){
        UserDao dao=new UserDao();
        int id=Integer.parseInt(idText.getText());
        UserEntity userEntity=dao.deleteUser(id);
        idText.setText("");
        gotoLogin();}
    }
    public void gotoLogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Main-View.fxml"));
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(root, 380, 460));
        stage.setTitle("Log in");
        stage.show();

    }
    public void gotoDashBoard(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("DashBoard");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
