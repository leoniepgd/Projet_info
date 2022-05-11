package com.mycompany.projet_info;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX Projet_Info
 */
public class Projet_Info extends Application {

    @Override
     public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("NOEUD");
        Scene scene = new Scene(new VBoxExemple());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
  
    public static void main(String[] args) {
        launch();
    }
}