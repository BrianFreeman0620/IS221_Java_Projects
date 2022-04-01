/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch3_PP3_11.java
 * Lang:    Java
 * Date:    2021-02-17
 * Author:  Brian Freeman
 * Purpose: This code will draw the olympic logo in a new window
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-16
 * Desc:    The circles have been drawn and colored
 */
package brianfreeman_is221_ch3_pp3;

import javafx.application.Application; //Imports needed javafx data for graphics
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class BrianFreeman_IS221_CH3_PP3_11 extends Application{ 
    //Allows public class to use imported applications

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stgOlympicStage) throws Exception{ 
        Circle circleBlue = new Circle(60, 60, 50); //Declares circle circleBlue
                                                    //with center 60, 60 and
                                                    //radius 50
        circleBlue.setStroke(Color.BLUE); //Sets color to blue
        circleBlue.setStrokeWidth(8); //Increases border width to 8
        circleBlue.setFill(null); //Makes center of circle hollow
        
        Circle circleBlack = new Circle(180, 60, 50); //Declares circle circleBlack
                                                      //with center 180, 60 and
                                                      //radius 50
        circleBlack.setStroke(Color.BLACK); //Sets color to black
        circleBlack.setStrokeWidth(8); //Increases border width to 8
        circleBlack.setFill(null); //Makes center of circle hollow
        
        Circle circleRed = new Circle(300, 60, 50); //Declares circle circleRed
                                                    //with center 300, 60 and
                                                    //radius 50
        circleRed.setStroke(Color.RED); //Sets color to red
        circleRed.setStrokeWidth(8); //Increases border width to 8
        circleRed.setFill(null); //Makes center of circle hollow
        
        Circle circleYellow = new Circle(120, 110, 50); //Declares circle circleYellow
                                                        //with center 120, 110 and
                                                        //radius 50
        circleYellow.setStroke(Color.YELLOW); //Sets color to yellow
        circleYellow.setStrokeWidth(8); //Increases border width to 8
        circleYellow.setFill(null); //Makes center of circle hollow
        
        Circle circleGreen = new Circle(240, 110, 50); //Declares circle circleGreen
                                                       //with center 240, 110 and
                                                       //radius 50
        circleGreen.setStroke(Color.GREEN); //Sets color to green
        circleGreen.setStrokeWidth(8); //Increases border width to 8
        circleGreen.setFill(null); //Makes center of circle hollow
        
        Group groupOlympics = new Group(circleBlue, circleBlack, circleRed, circleYellow,
        circleGreen); //Adds circles to scene object
        Scene sceneOlypmics = new Scene(groupOlympics, 360, 170, Color.WHITE); 
        //Declares scene sceneOlympics and its size and color
        
        stgOlympicStage.setTitle("Olypmic Games"); //Creates stageOlympicStage 
                                                   //window's name
        stgOlympicStage.setScene(sceneOlypmics); //Adds sceneOlypmics to 
                                                 //stgOlympicStage
        stgOlympicStage.show(); //Opens sceneOlympics
    }
    
}
