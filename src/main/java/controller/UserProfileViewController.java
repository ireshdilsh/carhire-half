package controller;

import dao.UserDao;
import entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserProfileViewController {

    public TextField nameText;
    public TextField usernameText;
    public TextField addressText;
    public TextField gmailText;
    public PasswordField passwordText;
    public TextField idText;
    public AnchorPane pane;
    private javax.swing.JOptionPane JOptionPane;

   public void searchUser(ActionEvent event) {

        UserDao dao=new UserDao();
        int id=Integer.parseInt(idText.getText());
        UserEntity entity=dao.searchUser(id);
        if (entity!=null){
            nameText.setText(entity.getName());
            addressText.setText(entity.getAddress());
            gmailText.setText(entity.getEmail());
            usernameText.setText(entity.getUsername());
            passwordText.setText(entity.getPassword());
        }else {
           JOptionPane.showMessageDialog(null,"User Not Found");
           clear();
        }
    }
    public void clear(){
        nameText.setText("");
        addressText.setText("");
        gmailText.setText("");
        usernameText.setText("");
        passwordText.setText("");
    }

    public void backtoDashboard(ActionEvent event) throws IOException{
       Parent root=FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
       Stage stage= (Stage) this.pane.getScene().getWindow();
       stage.setScene(new Scene(root));
       stage.setTitle("DashBoard");
       stage.show();
    }
}



