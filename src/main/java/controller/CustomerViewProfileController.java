package controller;

import dao.CustomerDao;
import entity.CustomerEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerViewProfileController {
    public AnchorPane pane;
    public TextField idText;
    public TextField nicText;
    public TextField nameText;
    public TextField addressText;
    public TextField mobilenoText;

    public void gotoDashBoard(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("DashBoard");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void searchCustomer(){
        CustomerDao dao=new CustomerDao();
        int id=Integer.parseInt(idText.getText());
        CustomerEntity entity=dao.searchCustomer(id);
        if (entity!=null){
            nicText.setText(String.valueOf(entity.getNic()));
            nameText.setText(entity.getName());
            addressText.setText(entity.getAddress());
            mobilenoText.setText(String.valueOf(entity.getMobileno()));
        }
    }
}
