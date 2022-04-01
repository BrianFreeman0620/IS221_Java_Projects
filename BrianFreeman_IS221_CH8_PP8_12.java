/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_CH8_PP8_12.java
 * Lang:    Java
 * Date:    2021-03-31
 * Author:  Brian Freeman
 * Purpose: This program will create a star in a new window
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-31
 * Desc:    The star class has been created and can have its attributes changed
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-04-01
 * Desc:    Reworked the star points and scaling to look better
--------------------------------------------------------------------------------
*/
package brianfreeman_is221_ch8_pp8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import java.util.Random;

public class BrianFreeman_IS221_CH8_PP8_12 extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stgFiveStars) throws Exception{
        
        // Initializes the Group that will display the Stars
        // The Random will randomly choose size, position, and color
        Group root = new Group();
        Random randStarValue = new Random();
        
        // Creates an array of 5 Star objects
        Star[] arrayFiveStars = {new Star(), new Star(), new Star(), new Star(), new Star()};
        
        // loops through the five Stars and randomly changes their attributes
        for(int intStarIndex = 0; intStarIndex < 5; intStarIndex ++){
            
            // The Star randomly changes size from 1-4 times smaller than the current size
            double doubNewSize = 5 / (double) (randStarValue.nextInt(16) + 5);
            
            // The Star's new size is applied
            arrayFiveStars[intStarIndex].Scale(doubNewSize);
            
            // To make sure the shape is within the window, the center can only
            // be random integers within a certain bound
            double doubMoveCenterX = randStarValue.nextInt(500 - 
                    2 * (int) arrayFiveStars[intStarIndex].doubHalfWidth) 
                    +  (int) arrayFiveStars[intStarIndex].doubHalfWidth;
            double doubMoveCenterY = randStarValue.nextInt(500 - 
                    2 * (int) arrayFiveStars[intStarIndex].doubHalfHeight) 
                    +  (int) arrayFiveStars[intStarIndex].doubHalfHeight;
            
            // Randomly generates the red, green, and blue integer values
            int intRedStar = randStarValue.nextInt(255);
            int intGreenStar = randStarValue.nextInt(255);
            int intBlueStar = randStarValue.nextInt(255);
            
            // The new center and color are applied to the Star and added to the Group
            arrayFiveStars[intStarIndex].ChangeCenter(doubMoveCenterX, doubMoveCenterY);
            arrayFiveStars[intStarIndex].Recolor(Color.rgb(intRedStar, intGreenStar, intBlueStar));
            root.getChildren().add(arrayFiveStars[intStarIndex].Draw());
        }
        
        Scene sceneStars = new Scene(root, 500, 500, Color.WHITE);
        
        stgFiveStars.setTitle("Five Random Stars");
        stgFiveStars.setScene(sceneStars);
        stgFiveStars.show();
        
    }
 
    static class Star{
        
        // Initializes doubXCenter and doubYCenter, the values of the center of the star
        // doubHalfHeight is half the distance from top point and bottom point's y value
        // doubHalfWidth is half the distance from the right point and left point's x value
        // The initial points will be referred to later, so arrayStarPoints is
        // initialized here 
        double doubXCenter, doubYCenter, doubHalfHeight, doubHalfWidth;
        double[] arrayStarPoints = {301, 44, 324, 98, 400, 99, 340, 131,
            361, 185, 301, 155, 239, 186, 261, 130, 201, 99, 277, 98};
        Polygon polyStarShape;
        
        public Star(){
            
            // Declares the center of the star at (301, 100)
            doubXCenter = 301;
            doubYCenter = 115;
            
            // Declares half the height and width to be 70 and 100 repectively
            doubHalfHeight = 71;
            doubHalfWidth = 100;
            
            // The shape is saved as polyStarShape
            polyStarShape = new Polygon(arrayStarPoints);
            
        }
        
        public Polygon Draw(){
            
            return polyStarShape;
        }
        
        public void ChangeCenter(double newX, double newY){
            
            // Finds the difference between new center and current center
            double doubXDifference = newX - doubXCenter;
            double doubYDifference = newY - doubYCenter;
            
            for(int intArrayIndex = 0; intArrayIndex < arrayStarPoints.length; intArrayIndex ++){
                
                // If the value is an x value, applies the difference in x values
                // to the value to move the center accordingly
                if(intArrayIndex % 2 == 0){
                    
                    arrayStarPoints[intArrayIndex] += doubXDifference;
                }
                
                // If the value is a y value, applies the difference in y values
                // to the value to move the center accordingly
                else{
                    
                    arrayStarPoints[intArrayIndex] += doubYDifference;
                }
            }
            
            // The new points replace the current ones to redraw the Star
            // The new center is saved for changing the center later
            polyStarShape = new Polygon(arrayStarPoints);
            doubXCenter = newX;
            doubYCenter = newY;
        }
        
        public void Scale(double doubLengthRatio){
            
            // Uses the ratio to change the dimensions of the star
            for(int intArrayIndex = 0; intArrayIndex < arrayStarPoints.length; intArrayIndex ++){
                
                // Scales the points by the ratio
                arrayStarPoints[intArrayIndex] *= doubLengthRatio;
            }
            
            // The new Star is stored
            polyStarShape = new Polygon(arrayStarPoints);
            
            // The center points are changed to reflect the new shape
            doubXCenter *= doubLengthRatio;
            doubYCenter *= doubLengthRatio;
            
            // The half height and width are changed using the new end points
            doubHalfHeight = (arrayStarPoints[13] - arrayStarPoints[1]) / 2;
            doubHalfWidth = (arrayStarPoints[4] - arrayStarPoints[16]) / 2;
        }
        
        public void Recolor(Color colorStar){
            
            // Changes the color of the Star to colorStar
            polyStarShape.setFill(colorStar);
        }
    }
}
