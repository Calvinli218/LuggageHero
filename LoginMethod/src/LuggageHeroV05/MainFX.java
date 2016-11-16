/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuggageHeroV05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import LuggageHeroV05.Methods.*;
import LuggageHeroV05.Classes.LostLuggage;
import LuggageHeroV05.Classes.FoundLuggage;
import LuggageHeroV05.Classes.User;




/**
 *
 * @author Gebruiker1
 */
public class MainFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Log in");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String email = "jurmen1992@gmail.com";
                String wachtwoord = "wachtwoord";
                User user = new User();
                Login.Login(user, email, wachtwoord);
                System.out.println(user.firstName);
                System.out.println(user.lastName);
                System.out.println(user.function);
                System.out.println(user.email);
                System.out.println(user.telephone);
                System.out.println(user.employeeNumber);
                System.out.println(user.birthdate);
                
                // Overerving uitleg
                FoundLuggage F = new FoundLuggage();
                LostLuggage L = new LostLuggage();
                
            }
                
                
                    
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
