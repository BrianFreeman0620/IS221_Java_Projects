/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch5_PP5_18.java
 * Lang:    Java
 * Date:    2021-03-05
 * Author:  Brian Freeman
 * Purpose: This code will change the lights on a stoplight
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-05
 * Desc:    The radio function has been added to change the stoplight
 */
package brian_freeman_is221_ch5_pp5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

// This class creates the pane used in the pane function
class StopLightPane extends HBox{
    // Declares the circles used in the pane
    // The buttons are directly related to the circles
    private Circle circleGo, circleStop, circleCaution;
    private RadioButton buttonGo, buttonStop, buttonCaution;
    
    public StopLightPane() {
       circleGo = new Circle();
       circleStop = new Circle();
       circleCaution = new Circle();
       
       circleGo.setRadius(20);
       circleStop.setRadius(20);
       circleCaution.setRadius(20);
       
       // Only the middle circle is "turned on"
       circleGo.setFill(Color.BLACK);
       circleStop.setFill(Color.BLACK);
       circleCaution.setFill(Color.YELLOW);
       
       // A VBox is created to place one circle above another
       VBox vboxStopLight = new VBox(circleGo, circleCaution, circleStop);
       vboxStopLight.setAlignment(Pos.CENTER);
       vboxStopLight.setSpacing(10);
       
       // PrefSize is set to allow the text for the radio to be readable
       vboxStopLight.setPrefSize(100,100);
       
       ToggleGroup groupStopLight = new ToggleGroup();
       
       // Each button is given text to associate it with a circle
       buttonGo = new RadioButton("GO");
       buttonGo.setToggleGroup(groupStopLight);
       buttonGo.setOnAction(this::processStopLight);
       
       buttonStop = new RadioButton("STOP");
       buttonStop.setToggleGroup(groupStopLight);
       buttonStop.setOnAction(this::processStopLight);
       
       buttonCaution = new RadioButton("CAUTION");
       buttonCaution.setSelected(true);
       buttonCaution.setToggleGroup(groupStopLight);
       buttonCaution.setOnAction(this::processStopLight);
       
       // A second VBox is created to stack the buttons similar to the circles
       VBox vboxStopLightButtons = new VBox(buttonGo, buttonCaution, buttonStop);
       vboxStopLightButtons.setAlignment(Pos.CENTER_LEFT);
       vboxStopLightButtons.setSpacing(10);
       
       // The two VBox are added to the StopLightPain class
       setSpacing(50);
       getChildren().addAll(vboxStopLightButtons, vboxStopLight);
       
    }
    
    // processStopLight is a class used to connect the radio to the circle's colors
    public void processStopLight(ActionEvent event){
        // Each if statement checks the button pressed and set the appropriate
        // color for the selected button
        // The other two circles are filled in black to appear turned off
        if (buttonGo.isSelected()){
            circleGo.setFill(Color.GREEN);
            circleCaution.setFill(Color.BLACK);
            circleStop.setFill(Color.BLACK);
        }
        else{
            if (buttonStop.isSelected()){
                circleGo.setFill(Color.BLACK);
                circleCaution.setFill(Color.BLACK);
                circleStop.setFill(Color.RED);
            }
            else{
                if (buttonCaution.isSelected()){
                    circleGo.setFill(Color.BLACK);
                    circleCaution.setFill(Color.YELLOW);
                    circleStop.setFill(Color.BLACK);
                }
            }
        }
    }
    
}

// The main class takes the previous two classes to open a scene
public class Brian_Freeman_IS221_Ch5_PP5_18 extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stageStopLight){
        // Using the StopLightPane class created earlier, the background color 
        // is set to cyan
        StopLightPane paneStopLight = new StopLightPane();
        paneStopLight.setAlignment(Pos.CENTER);
        paneStopLight.setStyle("-fx-background-color: cyan");
        
        Scene sceneStopLight = new Scene(paneStopLight, 300, 300);
        
        // The stage is opened and can be interacted with
        stageStopLight.setTitle("Stop Light");
        stageStopLight.setScene(sceneStopLight);
        stageStopLight.show();
    }
}
