package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

public class DashboardViewController {

    public BorderPane pane;
    public AnchorPane apane;

    public void gotoUserView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/User-View.fxml"));
        pane.setCenter(root);
    }

    public void gotoCusomerView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Customer-View.fxml"));
        pane.setCenter(root);
    }

    public void gotoMainView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Main-View.fxml"));
        Stage stage= (Stage) this.apane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Log in");
        stage.show();
    }

    public void gotoRentView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Rent-View.fxml"));
        pane.setCenter(root);
    }

    public void gotoCarView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Car-View.fxml"));
        pane.setCenter(root);
    }

    public void gotoCarCatagoryView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Car-Catagories-View.fxml"));
        pane.setCenter(root);
    }
}
