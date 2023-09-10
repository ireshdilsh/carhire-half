package controller;

import dao.CustomerDao;
import entity.CustomerEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class CustomerRegisterView {
    public TextField nameText;
    public TextField addressText;
    public TextField nicText;
    public TextField mobilenoText;
    public AnchorPane pane;

    public void customerRegister(ActionEvent event) {
        try{
            CustomerDao dao=new CustomerDao();

           CustomerEntity entity=new CustomerEntity(Integer.parseInt(nicText.getText()),
                                                    nameText.getText(),
                                                    addressText.getText(),
                                                    Integer.parseInt(mobilenoText.getText()));
           dao.customerRegister(entity);
        clear();
        }catch (Exception e)
        {}
    }
public void clear(){
        nameText.setText("");
        addressText.setText("");
        mobilenoText.setText("");
        nicText.setText("");
}
    public void gotoUserView(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Dashboard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
