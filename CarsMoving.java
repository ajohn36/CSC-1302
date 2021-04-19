import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.util.Duration;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

/**Programmer:Annab Johnson
   Program:PE 11.19 Moving Cars
   Date:12/03/20
   Program Purpose:This program animates cars moving across a pane in opposite directions.Cars are positioned at varying places on the x & y axis, so as to prevent collision*/
public class CarsMoving extends Application
{
   public void start(Stage stage1)
   {
      //Introduction dialog box 
      JOptionPane.showMessageDialog(null,
                      "Name:Annab Johnson"+ "\nDate:12/03/20 \n" + "Program:PE 11.19 Moving Cars" 
                      + "\nProgram purpose:This program animates cars in motion across a pane in opposite directions."
                      +"\nPress OK to see these cars in motion.", "Cars in motion", JOptionPane.INFORMATION_MESSAGE);
     
      Group root = new  Group();
      Scene scene1 = new Scene(root, 2000, 800);
     
      ImageView car1 = new ImageView("car6.png");
      ImageView car2 = new ImageView("car3.png");
      ImageView car3 = new ImageView("car5.png");
      ImageView car4 = new ImageView("car4.png");
      
      //set layout for car1
      car1.setLayoutX(800);
      car1.setLayoutY(500);
      car1.setFitWidth(350);
      car1.setPreserveRatio(true);
      car1.setSmooth(true);
     
      //set Layout for car2
      car2.setLayoutX(900);
      car2.setLayoutY(550);
      car2.setFitWidth(350);
      car2.setPreserveRatio(true);
      car2.setSmooth(true);
      
      //set Layout for car3
      car3.setLayoutX(200);
      car3.setLayoutY(400);
      car3.setFitWidth(350);
      car3.setPreserveRatio(true);
      car3.setSmooth(true);
      
      //set Layout for car4
      car4.setLayoutX(300);
      car4.setLayoutY(600);
      car4.setFitWidth(350);
      car4.setPreserveRatio(true);
      car4.setSmooth(true);
      
      //Timeline setup   
      Timeline tm1= new Timeline();
      Timeline tm2 = new Timeline();
      Timeline tm3 = new Timeline();
      Timeline tm4 = new Timeline();
      
      tm1.setCycleCount(Timeline.INDEFINITE);
      tm2.setCycleCount(Timeline.INDEFINITE);
      tm3.setCycleCount(Timeline.INDEFINITE);
      tm4.setCycleCount(Timeline.INDEFINITE);
      
      //set animation for car1 
      KeyFrame moveCar1 = new KeyFrame(Duration.millis(2500),
         new KeyValue(car1.translateXProperty(), -1050));
      tm1.getKeyFrames().add(moveCar1);
      tm1.play();
      
      //set animation for car2
      KeyFrame moveCar2 = new KeyFrame(Duration.millis(2500),
         new KeyValue(car2.translateXProperty(), -1050));
      tm2.getKeyFrames().add(moveCar2);
      tm2.play();
      
      //set animation for car3 
      KeyFrame moveCar3 = new KeyFrame(Duration.millis(2500),
         new KeyValue(car3.translateXProperty(), 1050));
      tm3.getKeyFrames().add(moveCar3);
      tm3.play();
      
      //set animation for car4
      KeyFrame moveCar4 = new KeyFrame(Duration.millis(2500),
         new KeyValue(car4.translateXProperty(), 1050));
      tm4.getKeyFrames().add(moveCar4);
      tm4.play();
      root.getChildren().addAll(car1, car2, car3, car4);
       
      stage1.setScene(scene1);
      stage1.setTitle("Cars in Motion");
      stage1.show();
   }
}
