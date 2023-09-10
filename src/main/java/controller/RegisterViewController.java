package controller;

import dao.UserDao;
import dto.UserDto;
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
public class RegisterViewController {
    public AnchorPane pane;
    public TextField nameText;
    public TextField addressText;
    public TextField gmailText;
    public TextField usernameText;
    public PasswordField passwordText;
    private javax.swing.JOptionPane JOptionPane;
    public void goBackMain(ActionEvent event) throws IOException {
       Parent root= FXMLLoader.load(getClass().getResource("/view/Main-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(root,380,460));
        stage.setTitle("Log in");
        stage.show();
    }

    public void clear(){
        nameText.setText("");
        addressText.setText("");
        gmailText.setText("");
        usernameText.setText("");
        passwordText.setText("");
    }
    public void userCreateAcount(ActionEvent event) {
try {
    UserDao dao = new UserDao();
    UserEntity entity = new UserEntity(nameText.getText(),
            addressText.getText(),
            gmailText.getText(),
            usernameText.getText(),
            passwordText.getText());
    dao.userCreateAcount(entity);
   JOptionPane.showMessageDialog(null,"Success");
    clear();
}catch (Exception e){
    JOptionPane.showMessageDialog(null,"Error");
      }
    }
}
