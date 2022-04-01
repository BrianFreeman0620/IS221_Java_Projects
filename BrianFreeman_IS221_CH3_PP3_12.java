/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch3_PP3_12.java
 * Lang:    Java
 * Date:    2021-02-17
 * Author:  Brian Freeman
 * Purpose: This code will draw a house and clouds
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-16
 * Desc:    The house and the clouds have been drawn
 */
package brianfreeman_is221_ch3_pp3;

import javafx.application.Application; //Imports needed javafx data for graphics
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class BrianFreeman_IS221_CH3_PP3_12 extends Application{ 
    //Allows public class to use imported applications

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stgHouse) throws Exception{ 
        Rectangle rectHouse = new Rectangle(50, 200, 400, 300); //Declares rectangle 
                                    //rectHouse with top-right point 50, 200 with
                                    //width 400 and height 300
        rectHouse.setStroke(Color.TAN); //Sets color to tan
        rectHouse.setFill(Color.TAN); //Makes the rectangle solid
        
        Rectangle rectHouseDoor = new Rectangle(310, 350, 75, 150); //Declares rectangle
                                    //rectHouseDoor with top-right point 310, 350 with
                                    //width 75 and height 150
        rectHouseDoor.setStroke(Color.DARKRED); //Sets color to dark red
        rectHouseDoor.setFill(Color.DARKRED); //Makes the rectangle solid
        
        Circle circleHouseDoorknob = new Circle(365, 430, 10); //Declares circle 
                                    //circleHouseDoorknob with center 365, 430 and
                                    //radius 10
        circleHouseDoorknob.setStroke(Color.BLACK); //Sets color to black
        circleHouseDoorknob.setFill(Color.BLACK); //Makes the circle solid
        
        Circle circleSmoke1 = new Circle(190, 100, 40); //Declares circle circleSmoke1
                                                        //with center 190, 100 and
                                                        //radius 40
        circleSmoke1.setStroke(Color.WHITE); //Sets color to white
        circleSmoke1.setFill(Color.WHITE); //Makes the circle solid
        
        Circle circleSmoke2 = new Circle(150, 60, 40); //Declares circle circleSmoke2
                                                        //with center 150, 60 and
                                                        //radius 40
        circleSmoke2.setStroke(Color.WHITE); //Sets color to white
        circleSmoke2.setFill(Color.WHITE); //Makes the circle solid
        
        Circle circleSmoke3 = new Circle(90, 60, 40); //Declares circle circleSmoke3
                                                        //with center 90, 60 and
                                                        //radius 40
        circleSmoke3.setStroke(Color.WHITE); //Sets color to white
        circleSmoke3.setFill(Color.WHITE); //Makes the circle solid
        
        Rectangle rectHouseChimney = new Rectangle(150, 100, 80, 100); //Declares rectangle
                                    //rectHouseDoor with top-right point 150, 100 with
                                    //width 75 and height 100
        rectHouseChimney.setStroke(Color.DARKRED); //Sets color to dark red
        rectHouseChimney.setFill(Color.DARKRED); //Makes the rectangle solid
        
        Circle circleCloud = new Circle(350, 100, 40); //Declares circle circleCloud
                                    //with center 325, 100 and radius 40
        circleCloud.setStroke(Color.WHITE); //Sets color to white
        circleCloud.setFill(Color.WHITE); //Makes the circle solid
        
        Ellipse ellipseCloud = new Ellipse(350, 120, 80, 30); //Declares ellipse ellipseCloud
                                    //with center 350, 120 and radii 80 and 30
        ellipseCloud.setStroke(Color.WHITE); //Sets color to white
        ellipseCloud.setFill(Color.WHITE); //Makes the ellipse solid
        
        Group groupHouse = new Group(rectHouse, rectHouseDoor, circleHouseDoorknob,
        circleSmoke1, circleSmoke2, circleSmoke3, rectHouseChimney, circleCloud,
        ellipseCloud); //Adds shapes to scene object
        Scene sceneHouse = new Scene(groupHouse, 500, 500, Color.LIGHTGRAY); 
        //Declares scene sceneOlympics and its size and color
        
        stgHouse.setTitle("House"); //Creates stageHouse window's name
        stgHouse.setScene(sceneHouse); //Adds sceneHouse to stgHouse
        stgHouse.show(); //Opens stgHouse
    }
    
}
