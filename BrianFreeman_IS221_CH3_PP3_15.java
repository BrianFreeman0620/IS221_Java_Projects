/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch3_PP3_15.java
 * Lang:    Java
 * Date:    2021-02-17
 * Author:  Brian Freeman
 * Purpose: This code will draw a rectangle with a random color
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-16
 * Desc:    The rectangle can be drawn and randomly color
 */
package brianfreeman_is221_ch3_pp3;

import javafx.application.Application; //Imports needed javafx data for graphics
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import java.util.Random;

public class BrianFreeman_IS221_CH3_PP3_15 extends Application{ 
    //Allows public class to use imported applications

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stgRandom) throws Exception{ 
        Random randomColor = new Random(); //Creates random generator
        int intColor1, intColor2, intColor3; //Declares integers intColor1, intColor2, intColor3
        
        intColor1 = randomColor.nextInt(256); //Choose random integer
        intColor2 = randomColor.nextInt(256);
        intColor3 = randomColor.nextInt(256);
        
        Rectangle rectRandom = new Rectangle(50, 50, 280, 180); //Declares rectangle 
                                    //rectHouse with top-right point 50, 50 with
                                    //width 280 and height 180
        rectRandom.setStroke(Color.BLACK); //Sets color to black
        rectRandom.setStrokeWidth(4); //Makes the border thicker
        rectRandom.setFill(Color.rgb(intColor1, intColor2, intColor3)); //Makes the rectangle with random color
        
        Group groupRandom = new Group(rectRandom); //Adds rectangle to scene object
        Scene sceneRandom = new Scene(groupRandom, 500, 500, Color.WHITE); 
        //Declares scene sceneRanom and its size and color
        
        stgRandom.setTitle("Random Rectangle"); //Creates stageRandom window's name
        stgRandom.setScene(sceneRandom); //Adds sceneRandom to stgRandom
        stgRandom.show(); //Opens stgRandom
    }
    
}
