/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch6_PP6_20.java
 * Lang:    Java
 * Date:    2021-03-11
 * Author:  Brian Freeman
 * Purpose: This program will create a pinwheel
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-11
 * Desc:    The elipses are looped to look like a pinwheel
 */
package brianfreeman_is221_ch6_pp6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BrianFreeman_IS221_Ch6_PP6_20 extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stageEllipse) throws Exception {
        // Initializes group used to hold the ellipses
        Group groupPinwheelEllipse = new Group();
        
        // Loops 9 times
        for (int intEllipseNumber = 0; intEllipseNumber <= 8; intEllipseNumber++){
            // Creates a new Ellipse with radii 100 and 10 and center point (250,250)
            Ellipse ellipseCurrent = new Ellipse();
            ellipseCurrent.setRadiusX(200);
            ellipseCurrent.setRadiusY(20);
            ellipseCurrent.setCenterX(250);
            ellipseCurrent.setCenterY(250);
            
            // The colors are dependent on which Ellipse number it is
            // Red starts at 256 and decreases by 32
            // Green starts at 0 and increases to the next power of 2 minus 1
            // Blue starts at 0 and increases by 32
            // The switch is to stop the numbers from being -1 or 256, which is
            // out of range for rgb
            switch (intEllipseNumber){
                case 0:
                    ellipseCurrent.setFill(Color.rgb((256 - 32 * intEllipseNumber - 1),
                        ( (int) Math.pow(2, intEllipseNumber) - 1),(32 * intEllipseNumber)));
                    break;
                case 8:
                    ellipseCurrent.setFill(Color.rgb((256 - 32 * intEllipseNumber),
                        ( (int) Math.pow(2, intEllipseNumber) - 1),(32 * intEllipseNumber) - 1));
                    break;
                default:
                     ellipseCurrent.setFill(Color.rgb((256 - 32 * intEllipseNumber - 1),
                        ( (int) Math.pow(2, intEllipseNumber) - 1),(32 * intEllipseNumber) - 1));
                    break;
            }
            // The Ellipse is rotated 40 degrees from the previous to make
            // sure all Ellipses can be seen
            ellipseCurrent.setRotate(intEllipseNumber * 40);
            
            // Adds the Ellipse to the group
            groupPinwheelEllipse.getChildren().add(ellipseCurrent);
        }
        Scene sceneEllipses = new Scene(groupPinwheelEllipse, 500, 500, Color.WHITE);
        
        stageEllipse.setTitle("Pinwheel");
        stageEllipse.setScene(sceneEllipses);
        stageEllipse.show();
    }
    
    
            
}
