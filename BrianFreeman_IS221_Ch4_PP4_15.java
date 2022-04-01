/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch4_PP4_15.java
 * Lang:    Java
 * Date:    2021-02-25
 * Author:  Brian Freeman
 * Purpose: This code will change the radius of a circle given a user's input
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-25
 * Desc:    The window and text field have been created
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-26
 * Desc:    The window and text field have been created
 */
package brianfreeman_is221_ch4_pp4;

// Imports needed functions for main, start, and processCircle
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BrianFreeman_IS221_Ch4_PP4_15 extends Application{ 
    
    // Declares int intCircleRadius, Label labelCircle, TextField textFieldCircle, 
    // Circle circleInput, FlowPane paneCircle, and Stage stageCircle
    int intCircleRadius;
    Label labelCircle;
    TextField textFieldCircle;
    Circle circleInput;
    FlowPane paneCircle;
    Stage stageCircle;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    
    public void start(Stage stageCircle) {
        
        labelCircle = new Label("Choose a radius for the circle");
        
        textFieldCircle = new TextField();
        textFieldCircle.setOnAction(this::processCircle);
        textFieldCircle.setStyle("-fx-background-color: lightblue");
        
        // Combines labelCircle and textFieldCircle to be used in the Scene
        paneCircle = new FlowPane(textFieldCircle, labelCircle);
        paneCircle.setAlignment(Pos.CENTER);
        paneCircle.setHgap(40);
        paneCircle.setStyle("-fx-background-color: lime");
        
        Scene sceneCircle = new Scene(paneCircle, 400, 400);
        
        // sceneCircle is added to stageCircl
        stageCircle.setTitle("Circle Creator");
        stageCircle.setScene(sceneCircle);
        stageCircle.show();
    }    
    // processCircle opens a new window with a black Circle of given radius
    public void processCircle(ActionEvent even){
            
        // Gets the text from the TextField and saves as intCircleRadius
        intCircleRadius = Integer.parseInt(textFieldCircle.getText());
        circleInput = new Circle(200, 200, intCircleRadius); 
        circleInput.setStroke(Color.BLACK); 
        circleInput.setFill(Color.BLACK);
        
        // The new scene is the same size as the previous window
        Group groupCircle = new Group(circleInput);
        Scene sceneCircle2 = new Scene(groupCircle, 400, 400);
        
        // stageCircle2 is a seperate window and can be opened multiple times
        Stage stageCircle2 = new Stage();
        stageCircle2.setTitle("Circle Created");
        stageCircle2.setScene(sceneCircle2);
        stageCircle2.show();
        
    } 
}
