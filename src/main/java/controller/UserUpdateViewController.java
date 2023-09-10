package controller;

import dao.CustomerDao;
import dao.UserDao;
import entity.CustomerEntity;
import entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserUpdateViewController {
    public AnchorPane pane;
    public TextField nameText;
    public TextField emailText;
    public TextField usernameText;
    public TextField passwordText;
    public TextField idText;
    public TextField addressText;

    private javax.swing.JOptionPane JOptionPane;

    public void gotoDashBoard(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("DashBoard");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void searchButtonUser(ActionEvent event) {
        UserDao dao=new UserDao();
        int id=Integer.parseInt(idText.getText());
        UserEntity entity=dao.searchButtonUser(id);
        if(entity!=null){
nameText.setText(entity.getName());
addressText.setText(entity.getAddress());
emailText.setText(entity.getEmail());
usernameText.setText(entity.getUsername());
passwordText.setText(entity.getPassword());
        }else {
            JOptionPane.showMessageDialog(null,"No user Found");
        }
    }

    public void updateUserDetails(ActionEvent event) {
        UserDao dao=new UserDao();

    }
}
