package org.diegopinzon.system;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 *
 * @author Diego Pinzon
 * @date 15/04/2021
 * @time 09:19:01
 *
 */

public class Principal extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("../View/FXMLView.fxml")); 
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculadora");
        stage.show();
    }

}
