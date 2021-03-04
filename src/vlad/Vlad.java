/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlad;

import db.*;
import db.dao.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author IVb
 */
public class Vlad extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Get users");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                try {
                    Test test = new Test();
                    List<User> users= test.getUsers();
                    
                    for (User user : users) {
                        user.print();
                    }
                    
                    User novUser = new User();
                    novUser.FirstName = "Pera";
                    novUser.LastName = "Peric";
                    novUser.Username = "perica2";
                    novUser.Password = "pera123";
                    novUser.Email = "pera@test.com";
                    
            
//                    System.out.println("Snimanje...");
//                    
//                    User x=test.saveUser(novUser);
//                    
//                    System.out.printf("Snimjlen User sa ID: %d\n\n", x.ID );
//                    
//                    for (User user : test.getUsers()) {
//                        System.out.printf("ID: %d\tUsername:%s\tFirstName:%s\n", user.ID, user.Username, user.FirstName);
//                    }
User filterUser = new User();
filterUser.FirstName="Pera";
filterUser.LastName="Peric";

for (User user : test.filter(filterUser)) {
                        user.print();
                   }
                    
                    
                } catch (SQLException ex) {

                    System.out.print(ex);

//Logger.getLogger(Vlad.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
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
