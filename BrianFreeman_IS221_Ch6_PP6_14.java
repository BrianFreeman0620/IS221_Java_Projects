/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch6_PP6_14.java
 * Lang:    Java
 * Date:    2021-03-10
 * Author:  Brian Freeman
 * Purpose: This program will create 100 random circles of random colors
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-10
 * Desc:    The circles can be drawn and be fully within the scene
 */
package brianfreeman_is221_ch6_pp6;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BrianFreeman_IS221_Ch6_PP6_14 extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stageCircles) throws Exception {
        // groupAllCircles holds all the Circles used in the scene
        // randomColorsAndCircles randomly gives an integer depending on conditions
        // The integers are used for the Circles' details
        Group groupAllCircles = new Group();
        Random randomColorsAndCircles = new Random();
        int intRadius, intXPosition, intYPosition, intRedColor, intGreenColor, intBlueColor;
        
        // Loops 100 times
        for (int intCircleNumber = 1; intCircleNumber <= 100; intCircleNumber++){
            // Creates a new Circle of abitrary values
            Circle circleCurrent = new Circle(1, 1, 1);
            
            // The red, green, and blue values are randomly chosen
            intRedColor = randomColorsAndCircles.nextInt(256); 
            intGreenColor = randomColorsAndCircles.nextInt(256); 
            intBlueColor = randomColorsAndCircles.nextInt(256);
            
            // The radius is randomly chosen from 1-125
            // The positions are such where a Circle cannot be cut off by the window
            intRadius = randomColorsAndCircles.nextInt(125) + 1;
            intXPosition = randomColorsAndCircles.nextInt(500 - (2 * intRadius)) + intRadius + 1;
            intYPosition = randomColorsAndCircles.nextInt(500 - (2 * intRadius)) + intRadius + 1;
            
            // Changes the Circle to the dimensions and colors randomly chosen
            circleCurrent.setRadius(intRadius);
            circleCurrent.setCenterX(intXPosition);
            circleCurrent.setCenterY(intYPosition);
            circleCurrent.setFill(Color.rgb(intRedColor, intGreenColor, intBlueColor));
            
            // Adds the Circle to the group
            groupAllCircles.getChildren().add(circleCurrent);
        }
        Scene sceneCircles = new Scene(groupAllCircles, 500, 500, Color.WHITE);
        
        stageCircles.setTitle("Random Circles Everywhere");
        stageCircles.setScene(sceneCircles);
        stageCircles.show();
    }
    
    
            
}
