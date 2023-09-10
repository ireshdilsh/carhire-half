package controller;

import dao.CustomerDao;
import entity.CustomerEntity;
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

public class CustomerDeleteViewController {
    public AnchorPane pane;
    public TextField customeridText;
    private javax.swing.JOptionPane JOptionPane;
    public void customerDelete(ActionEvent event) throws IOException{
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Customer");
        alert.setHeaderText("If you delete Your Account ? Create New One.");
        alert.setContentText("Do You Want to Delete our Account ?");
        if (alert.showAndWait().get()== ButtonType.OK) {
            CustomerDao dao = new CustomerDao();
            int id = Integer.parseInt(customeridText.getText());
            CustomerEntity entity = dao.customerDelete(id);
            JOptionPane.showMessageDialog(null,"Success Delete");
          gotoRegister();
        }    }


    public void backDashBoard(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("DashBoard");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void gotoRegister() throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("DashBoard");
        stage.show();
    }
}
