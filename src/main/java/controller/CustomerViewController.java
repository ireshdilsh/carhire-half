package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerViewController {
    public AnchorPane pane;
    public void addCustmerButton(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Customer-Register-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Customer Registration");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void deleteCustomer(ActionEvent event) throws IOException{
         Parent root=FXMLLoader.load(getClass().getResource("/view/Customer-Delete-View.fxml"));
         Stage stage= (Stage) this.pane.getScene().getWindow();
         stage.setTitle("Delete");
         stage.setScene(new Scene(root));
         stage.show();
    }

    public void viewCustomerProfile(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Customer-View-Profile.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
