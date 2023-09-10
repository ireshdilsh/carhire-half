import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import util.SessionFactoryConfiguration;

public class Main extends Application {
   @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Main-View.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Log in");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
