package com.mycompany.finalfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        

        var label = new Label("Account"):
        TextField account = new TextField();
        Text account= new Text("Enter Account Name");
        GridPane accGrid = new GridPane();
        GridPane.add(account,0,0);
        GridPane.add(accGrid,0,1);
        //TODO add a way to create accounts
        
        
        GridPane rbGrid = new GridPane();
        //Shows all your recipes with buttons to open them
        
        GridPane recGrid = new GridPane();
        //shows all the information about the recipe
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}