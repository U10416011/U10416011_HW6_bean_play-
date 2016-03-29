import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.WritableObjectValue;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;



public class BeanMachinePane  extends Application { 
	double X = 0, Y = 0;
	public void start(Stage primaryStage) {
		//create a pane
		Pane pane = new Pane();
			    
	    
		//create 28 circle as dots
		Circle Dot1 = new Circle();
		Dot1.setLayoutX(275);
		Dot1.setLayoutY(100);
		Dot1.setRadius(5);
		Dot1.setStroke(Color.BLACK);
		Dot1.setFill(Color.BLACK);
		pane.getChildren().add(Dot1);
		
		Circle Dot2 = new Circle();
		Dot2.setLayoutX(250);
		Dot2.setLayoutY(130);
		Dot2.setRadius(5);
		Dot2.setStroke(Color.BLACK);
		Dot2.setFill(Color.BLACK);
		pane.getChildren().add(Dot2);
		
		Circle Dot3 = new Circle();
		Dot3.setLayoutX(300);
		Dot3.setLayoutY(130);
		Dot3.setRadius(5);
		Dot3.setStroke(Color.BLACK);
		Dot3.setFill(Color.BLACK);
		pane.getChildren().add(Dot3);
		
		Circle Dot4 = new Circle();
		Dot4.setLayoutX(275);
		Dot4.setLayoutY(160);
		Dot4.setRadius(5);
		Dot4.setStroke(Color.BLACK);
		Dot4.setFill(Color.BLACK);
		pane.getChildren().add(Dot4);
		
		Circle Dot5 = new Circle();
		Dot5.setLayoutX(325);
		Dot5.setLayoutY(160);
		Dot5.setRadius(5);
		Dot5.setStroke(Color.BLACK);
		Dot5.setFill(Color.BLACK);
		pane.getChildren().add(Dot5);
		
		Circle Dot6 = new Circle();
		Dot6.setLayoutX(225);
		Dot6.setLayoutY(160);
		Dot6.setRadius(5);
		Dot6.setStroke(Color.BLACK);
		Dot6.setFill(Color.BLACK);
		pane.getChildren().add(Dot6);
		
		Circle Dot7 = new Circle();
		Dot7.setLayoutX(200);
		Dot7.setLayoutY(190);
		Dot7.setRadius(5);
		Dot7.setStroke(Color.BLACK);
		Dot7.setFill(Color.BLACK);
		pane.getChildren().add(Dot7);
		
		Circle Dot8 = new Circle();
		Dot8.setLayoutX(350);
		Dot8.setLayoutY(190);
		Dot8.setRadius(5);
		Dot8.setStroke(Color.BLACK);
		Dot8.setFill(Color.BLACK);
		pane.getChildren().add(Dot8);
		
		Circle Dot9 = new Circle();
		Dot9.setLayoutX(250);
		Dot9.setLayoutY(190);
		Dot9.setRadius(5);
		Dot9.setStroke(Color.BLACK);
		Dot9.setFill(Color.BLACK);
		pane.getChildren().add(Dot9);
		
		Circle Dot10 = new Circle();
		Dot10.setLayoutX(300);
		Dot10.setLayoutY(190);
		Dot10.setRadius(5);
		Dot10.setStroke(Color.BLACK);
		Dot10.setFill(Color.BLACK);
		pane.getChildren().add(Dot10);
		
		Circle Dot11 = new Circle();
		Dot11.setLayoutX(375);
		Dot11.setLayoutY(220);
		Dot11.setRadius(5);
		Dot11.setStroke(Color.BLACK);
		Dot11.setFill(Color.BLACK);
		pane.getChildren().add(Dot11);
		
		Circle Dot12 = new Circle();
		Dot12.setLayoutX(175);
		Dot12.setLayoutY(220);
		Dot12.setRadius(5);
		Dot12.setStroke(Color.BLACK);
		Dot12.setFill(Color.BLACK);
		pane.getChildren().add(Dot12);
		
		Circle Dot13 = new Circle();
		Dot13.setLayoutX(225);
		Dot13.setLayoutY(220);
		Dot13.setRadius(5);
		Dot13.setStroke(Color.BLACK);
		Dot13.setFill(Color.BLACK);
		pane.getChildren().add(Dot13);
		
		Circle Dot14 = new Circle();
		Dot14.setLayoutX(275);
		Dot14.setLayoutY(220);
		Dot14.setRadius(5);
		Dot14.setStroke(Color.BLACK);
		Dot14.setFill(Color.BLACK);
		pane.getChildren().add(Dot14);
		
		Circle Dot15 = new Circle();
		Dot15.setLayoutX(325);
		Dot15.setLayoutY(220);
		Dot15.setRadius(5);
		Dot15.setStroke(Color.BLACK);
		Dot15.setFill(Color.BLACK);
		pane.getChildren().add(Dot15);
		
		Circle Dot16 = new Circle();
		Dot16.setLayoutX(400);
		Dot16.setLayoutY(250);
		Dot16.setRadius(5);
		Dot16.setStroke(Color.BLACK);
		Dot16.setFill(Color.BLACK);
		pane.getChildren().add(Dot16);
		
		Circle Dot17 = new Circle();
		Dot17.setLayoutX(150);
		Dot17.setLayoutY(250);
		Dot17.setRadius(5);
		Dot17.setStroke(Color.BLACK);
		Dot17.setFill(Color.BLACK);
		pane.getChildren().add(Dot17);
		
		Circle Dot18 = new Circle();
		Dot18.setLayoutX(200);
		Dot18.setLayoutY(250);
		Dot18.setRadius(5);
		Dot18.setStroke(Color.BLACK);
		Dot18.setFill(Color.BLACK);
		pane.getChildren().add(Dot18);
		
		Circle Dot19 = new Circle();
		Dot19.setLayoutX(250);
		Dot19.setLayoutY(250);
		Dot19.setRadius(5);
		Dot19.setStroke(Color.BLACK);
		Dot19.setFill(Color.BLACK);
		pane.getChildren().add(Dot19);
		
		Circle Dot20 = new Circle();
		Dot20.setLayoutX(300);
		Dot20.setLayoutY(250);
		Dot20.setRadius(5);
		Dot20.setStroke(Color.BLACK);
		Dot20.setFill(Color.BLACK);
		pane.getChildren().add(Dot20);
		
		Circle Dot21 = new Circle();
		Dot21.setLayoutX(350);
		Dot21.setLayoutY(250);
		Dot21.setRadius(5);
		Dot21.setStroke(Color.BLACK);
		Dot21.setFill(Color.BLACK);
		pane.getChildren().add(Dot21);
		
		Circle Dot22 = new Circle();
		Dot22.setLayoutX(425);
		Dot22.setLayoutY(280);
		Dot22.setRadius(5);
		Dot22.setStroke(Color.BLACK);
		Dot22.setFill(Color.BLACK);
		pane.getChildren().add(Dot22);
		
		Circle Dot23 = new Circle();
		Dot23.setLayoutX(125);
		Dot23.setLayoutY(280);
		Dot23.setRadius(5);
		Dot23.setStroke(Color.BLACK);
		Dot23.setFill(Color.BLACK);
		pane.getChildren().add(Dot23);
		
		Circle Dot24 = new Circle();
		Dot24.setLayoutX(175);
		Dot24.setLayoutY(280);
		Dot24.setRadius(5);
		Dot24.setStroke(Color.BLACK);
		Dot24.setFill(Color.BLACK);
		pane.getChildren().add(Dot24);
		
		Circle Dot25 = new Circle();
		Dot25.setLayoutX(225);
		Dot25.setLayoutY(280);
		Dot25.setRadius(5);
		Dot25.setStroke(Color.BLACK);
		Dot25.setFill(Color.BLACK);
		pane.getChildren().add(Dot25);
		
		Circle Dot26 = new Circle();
		Dot26.setLayoutX(275);
		Dot26.setLayoutY(280);
		Dot26.setRadius(5);
		Dot26.setStroke(Color.BLACK);
		Dot26.setFill(Color.BLACK);
		pane.getChildren().add(Dot26);
		
		Circle Dot27 = new Circle();
		Dot27.setLayoutX(325);
		Dot27.setLayoutY(280);
		Dot27.setRadius(5);
		Dot27.setStroke(Color.BLACK);
		Dot27.setFill(Color.BLACK);
		pane.getChildren().add(Dot27);
		
		Circle Dot28 = new Circle();
		Dot28.setLayoutX(375);
		Dot28.setLayoutY(280);
		Dot28.setRadius(5);
		Dot28.setStroke(Color.BLACK);
		Dot28.setFill(Color.BLACK);
		pane.getChildren().add(Dot28);
		
		Circle bottom1 = new Circle();
		bottom1.setLayoutX(100);
		bottom1.setLayoutY(350);
		bottom1.setRadius(0.1);
		bottom1.setStroke(Color.WHITE);
		bottom1.setFill(Color.WHITE);
		pane.getChildren().add(bottom1);
		
		Circle bottom2 = new Circle();
		bottom2.setLayoutX(150);
		bottom2.setLayoutY(350);
		bottom2.setRadius(0.1);
		bottom2.setStroke(Color.WHITE);
		bottom2.setFill(Color.WHITE);
		pane.getChildren().add(bottom2);
		
		Circle bottom3 = new Circle();
		bottom3.setLayoutX(200);
		bottom3.setLayoutY(350);
		bottom3.setRadius(0.1);
		bottom3.setStroke(Color.WHITE);
		bottom3.setFill(Color.WHITE);
		pane.getChildren().add(bottom3);
		
		Circle bottom4 = new Circle();
		bottom4.setLayoutX(250);
		bottom4.setLayoutY(350);
		bottom4.setRadius(0.1);
		bottom4.setStroke(Color.WHITE);
		bottom4.setFill(Color.WHITE);
		pane.getChildren().add(bottom4);
		
		Circle bottom5 = new Circle();
		bottom5.setLayoutX(300);
		bottom5.setLayoutY(350);
		bottom5.setRadius(0.1);
		bottom5.setStroke(Color.WHITE);
		bottom5.setFill(Color.WHITE);
		pane.getChildren().add(bottom5);
		
		Circle bottom6 = new Circle();
		bottom6.setLayoutX(350);
		bottom6.setLayoutY(350);
		bottom6.setRadius(0.1);
		bottom6.setStroke(Color.WHITE);
		bottom6.setFill(Color.WHITE);
		pane.getChildren().add(bottom6);
		
		Circle bottom7 = new Circle();
		bottom7.setLayoutX(400);
		bottom7.setLayoutY(350);
		bottom7.setRadius(0.1);
		bottom7.setStroke(Color.WHITE);
		bottom7.setFill(Color.WHITE);
		pane.getChildren().add(bottom7);
		
		Circle bottom8 = new Circle();
		bottom8.setLayoutX(450);
		bottom8.setLayoutY(350);
		bottom8.setRadius(0.1);
		bottom8.setStroke(Color.WHITE);
		bottom8.setFill(Color.WHITE);
		pane.getChildren().add(bottom8);
		
		//create line as side
		Line Line1 = new Line();
		Line1.setStartX(300);
		Line1.setStartY(65);
		Line1.setEndX(475);
		Line1.setEndY(280);
		pane.getChildren().addAll(Line1);
		
		Line Line2 = new Line();
		Line2.setStartX(475);
		Line2.setStartY(350);
		Line2.setEndX(75);
		Line2.setEndY(350);
		pane.getChildren().addAll(Line2);
		
		Line Line3 = new Line();
		Line3.setStartX(250);
		Line3.setStartY(65);
		Line3.setEndX(75);
		Line3.setEndY(280);
		pane.getChildren().addAll(Line3);
		
		Line Line4 = new Line();
		Line4.setStartX(475);
		Line4.setStartY(280);
		Line4.setEndX(475);
		Line4.setEndY(350);
		pane.getChildren().addAll(Line4);
		
		Line Line5 = new Line();
		Line5.setStartX(75);
		Line5.setStartY(350);
		Line5.setEndX(75);
		Line5.setEndY(280);
		pane.getChildren().addAll(Line5);
		
		Line Line6 = new Line();
		Line6.setStartX(300);
		Line6.setStartY(65);
		Line6.setEndX(300);
		Line6.setEndY(40);
		pane.getChildren().addAll(Line6);
		
		Line Line7 = new Line();
		Line7.setStartX(250);
		Line7.setStartY(65);
		Line7.setEndX(250);
		Line7.setEndY(40);
		pane.getChildren().addAll(Line7);
		
		Line Line8 = new Line();
		Line8.setStartX(125);
		Line8.setStartY(280);
		Line8.setEndX(125);
		Line8.setEndY(350);
		pane.getChildren().addAll(Line8);
		
		Line Line9 = new Line();
		Line9.setStartX(175);
		Line9.setStartY(280);
		Line9.setEndX(175);
		Line9.setEndY(350);
		pane.getChildren().addAll(Line9);
		
		Line Line10 = new Line();
		Line10.setStartX(225);
		Line10.setStartY(280);
		Line10.setEndX(225);
		Line10.setEndY(350);
		pane.getChildren().addAll(Line10);
		
		Line Line11 = new Line();
		Line11.setStartX(275);
		Line11.setStartY(280);
		Line11.setEndX(275);
		Line11.setEndY(350);
		pane.getChildren().addAll(Line11);
		
		Line Line12 = new Line();
		Line12.setStartX(325);
		Line12.setStartY(280);
		Line12.setEndX(325);
		Line12.setEndY(350);
		pane.getChildren().addAll(Line12);
		
		Line Line13 = new Line();
		Line13.setStartX(425);
		Line13.setStartY(280);
		Line13.setEndX(425);
		Line13.setEndY(350);
		pane.getChildren().addAll(Line13);
		
		Line Line14 = new Line();
		Line14.setStartX(375);
		Line14.setStartY(280);
		Line14.setEndX(375);
		Line14.setEndY(350);
		pane.getChildren().addAll(Line14);
			        
		//create a scene
		Scene scene = new Scene(pane,600,500);
		//add action
		scene.setOnMouseClicked(e ->{
			X = 275;
			Y = 50;
			Circle Ball = new Circle();
			pane.getChildren().add(Ball);
			Ball.setCenterX(X);
			Ball.setCenterY(Y);
			Ball.setRadius(6);
			//random color
			Color color = new Color(Math.random(),Math.random(), Math.random(), 0.8);
			Ball.setFill(color);
			int d = new Random().nextInt(128)+1;
			switch(d){//random path
				case 1:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot17,Dot23,bottom1);
					break;
				case 2:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot17,Dot23,bottom2);
					break;
				case 3:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot17,Dot24,bottom2);
					break;
				case 4:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot17,Dot24,bottom3);
					break;
				case 5:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot18,Dot24,bottom2);
					break;
				case 6:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot18,Dot24,bottom3);
					break;
				case 7:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot18,Dot25,bottom3);
					break;
				case 8:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot12,Dot18,Dot25,bottom4);
					break;
				case 9:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot13,Dot18,Dot24,bottom2);
					break;
				case 10:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot13,Dot18,Dot24,bottom3);
					break;
				case 11:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot13,Dot19,Dot25,bottom3);
					break;
				case 12:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot13,Dot19,Dot25,bottom4);
					break;
				case 13:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot13,Dot19,Dot26,bottom4);
					break;
				case 14:
					Routine(Ball,Dot1,Dot2,Dot6,Dot7,Dot13,Dot19,Dot26,bottom5);
					break;
				case 15:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot13,Dot18,Dot24,bottom2);
					break;
				case 16:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot13,Dot18,Dot24,bottom3);
					break;
				case 17:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot13,Dot19,Dot25,bottom3);
					break;
				case 18:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot13,Dot19,Dot25,bottom4);
					break;
				case 19:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot13,Dot19,Dot26,bottom4);
					break;
				case 20:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot13,Dot19,Dot26,bottom5);
					break;
				case 21:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot19,Dot25,bottom3);
					break;
				case 22:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot19,Dot25,bottom4);
					break;
				case 23:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot19,Dot26,bottom4);
					break;
				case 24:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot19,Dot26,bottom5);
					break;
				case 25:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot20,Dot26,bottom4);
					break;
				case 26:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot20,Dot26,bottom5);
					break;
				case 27:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot20,Dot27,bottom5);
					break;
				case 28:
					Routine(Ball,Dot1,Dot2,Dot6,Dot9,Dot14,Dot20,Dot27,bottom6);
					break;
				case 29:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot13,Dot18,Dot24,bottom2);
					break;
				case 30:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot13,Dot18,Dot24,bottom3);
					break;
				case 31:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot13,Dot19,Dot25,bottom3);
					break;
				case 32:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot13,Dot19,Dot25,bottom4);
					break;
				case 33:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot13,Dot19,Dot26,bottom4);
					break;
				case 34:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot13,Dot19,Dot26,bottom5);
					break;
				case 35:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot25,bottom3);
					break;
				case 36:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot25,bottom4);
					break;
				case 37:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot26,bottom4);
					break;
				case 38:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot26,bottom5);
					break;
				case 39:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot26,bottom4);
					break;
				case 40:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot26,bottom5);
					break;
				case 41:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot27,bottom5);
					break;
				case 42:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot27,bottom6);
					break;
				case 43:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot19,Dot25,bottom3);
					break;
				case 44:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot19,Dot25,bottom4);
					break;
				case 45:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot19,Dot26,bottom4);
					break;
				case 46:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot19,Dot26,bottom5);
					break;
				case 47:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot20,Dot26,bottom4);
					break;
				case 48:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot20,Dot26,bottom5);
					break;
				case 49:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot20,Dot27,bottom5);
					break;
				case 50:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot14,Dot20,Dot27,bottom6);
					break;
				case 51:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot20,Dot26,bottom4);
					break;
				case 52:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot20,Dot26,bottom5);
					break;
				case 53:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot20,Dot27,bottom5);
					break;
				case 54:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot20,Dot27,bottom6);
					break;
				case 55:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot21,Dot27,bottom5);
					break;
				case 56:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot21,Dot27,bottom6);
					break;
				case 57:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot21,Dot28,bottom6);
					break;
				case 58:
					Routine(Ball,Dot1,Dot2,Dot4,Dot10,Dot15,Dot21,Dot28,bottom7);
					break;
				case 59:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot13,Dot18,Dot24,bottom2);
					break;
				case 60:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot13,Dot18,Dot24,bottom3);
					break;
				case 61:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot13,Dot19,Dot25,bottom3);
					break;
				case 62:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot13,Dot19,Dot25,bottom4);
					break;
				case 63:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot13,Dot19,Dot26,bottom4);
					break;
				case 64:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot13,Dot19,Dot26,bottom5);
					break;
				case 65:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot19,Dot25,bottom3);
					break;
				case 66:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot19,Dot25,bottom4);
					break;
				case 67:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot19,Dot26,bottom4);
					break;
				case 68:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot19,Dot26,bottom5);
					break;
				case 69:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot20,Dot26,bottom4);
					break;
				case 70:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot20,Dot26,bottom5);
					break;
				case 71:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot20,Dot27,bottom5);
					break;
				case 72:
					Routine(Ball,Dot1,Dot3,Dot4,Dot9,Dot14,Dot20,Dot27,bottom6);
					break;
				case 73:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot19,Dot25,bottom3);
					break;
				case 74:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot19,Dot25,bottom4);
					break;
				case 75:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot19,Dot26,bottom4);
					break;
				case 76:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot19,Dot26,bottom5);
					break;
				case 77:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot20,Dot26,bottom4);
					break;
				case 78:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot20,Dot26,bottom5);
					break;
				case 79:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot20,Dot27,bottom5);
					break;
				case 80:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot14,Dot20,Dot27,bottom6);
					break;
				case 81:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot20,Dot26,bottom4);
					break;
				case 82:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot20,Dot26,bottom5);
					break;
				case 83:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot20,Dot27,bottom5);
					break;
				case 84:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot20,Dot27,bottom6);
					break;
				case 85:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot21,Dot27,bottom5);
					break;
				case 86:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot21,Dot27,bottom6);
					break;
				case 87:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot21,Dot28,bottom6);
					break;
				case 88:
					Routine(Ball,Dot1,Dot3,Dot4,Dot10,Dot15,Dot21,Dot28,bottom7);
					break;
				case 89:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot19,Dot25,bottom3);
					break;
				case 90:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot19,Dot25,bottom4);
					break;
				case 91:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot19,Dot26,bottom4);
					break;
				case 92:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot19,Dot26,bottom5);
					break;
				case 93:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot20,Dot26,bottom4);
					break;
				case 94:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot20,Dot26,bottom5);
					break;
				case 95:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot20,Dot27,bottom5);
					break;
				case 96:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot14,Dot20,Dot27,bottom6);
					break;
				case 97:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot20,Dot26,bottom4);
					break;
				case 98:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot20,Dot26,bottom5);
					break;
				case 99:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot20,Dot27,bottom5);
					break;
				case 100:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot20,Dot27,bottom6);
					break;
				case 101:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot21,Dot27,bottom5);
					break;
				case 102:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot21,Dot27,bottom6);
					break;
				case 103:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot21,Dot28,bottom6);
					break;
				case 104:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot21,Dot28,bottom7);
					break;
				case 105:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot20,Dot26,bottom4);
					break;
				case 106:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot20,Dot26,bottom5);
					break;
				case 107:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot20,Dot27,bottom5);
					break;
				case 108:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot20,Dot27,bottom6);
					break;
				case 109:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot21,Dot27,bottom5);
					break;
				case 110:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot21,Dot27,bottom6);
					break;
				case 111:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot21,Dot28,bottom6);
					break;
				case 112:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot15,Dot21,Dot28,bottom7);
					break;
				case 113:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot21,Dot27,bottom5);
					break;
				case 114:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot21,Dot27,bottom6);
					break;
				case 115:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot21,Dot28,bottom6);
					break;
				case 116:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot21,Dot28,bottom7);
					break;
				case 117:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot16,Dot28,bottom6);
					break;
				case 118:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot16,Dot28,bottom7);
					break;
				case 119:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot16,Dot22,bottom7);
					break;
				case 120:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot25,bottom3);
					break;
				case 121:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot25,bottom4);
					break;
				case 122:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot19,Dot26,bottom4);
					break;
				case 123:
					Routine(Ball,Dot1,Dot3,Dot5,Dot10,Dot15,Dot20,Dot26,bottom4);
					break;
				case 124:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot26,bottom4);
					break;
				case 125:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot26,bottom5);
					break;
				case 126:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot27,bottom5);
					break;
				case 127:
					Routine(Ball,Dot1,Dot2,Dot4,Dot9,Dot14,Dot20,Dot27,bottom6);
					break;
				case 128:
					Routine(Ball,Dot1,Dot3,Dot5,Dot8,Dot11,Dot16,Dot22,bottom8);
					break;		
			}			
		});
		primaryStage.setTitle("BeanMachinePane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	//path method 
	//the ball can move above the dot
	public void Routine(Circle Ball,Circle Dots1 ,Circle Dots2,Circle Dots3,Circle Dots4,Circle Dots5,Circle Dots6,Circle Dots7,Circle bottom){
		Timeline Routinego = new Timeline(
			new KeyFrame(Duration.seconds(0),new KeyValue(Ball.centerYProperty(),50)),
			new KeyFrame(Duration.seconds(0.1),new KeyValue(Ball.centerYProperty(),Dots1.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.2),new KeyValue(Ball.centerXProperty(),Dots2.getLayoutX())),
			new KeyFrame(Duration.seconds(0.2),new KeyValue(Ball.centerYProperty(),Dots2.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.3),new KeyValue(Ball.centerXProperty(),Dots3.getLayoutX())),
			new KeyFrame(Duration.seconds(0.3),new KeyValue(Ball.centerYProperty(),Dots3.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.4),new KeyValue(Ball.centerXProperty(),Dots4.getLayoutX())),
			new KeyFrame(Duration.seconds(0.4),new KeyValue(Ball.centerYProperty(),Dots4.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.5),new KeyValue(Ball.centerXProperty(),Dots5.getLayoutX())),
			new KeyFrame(Duration.seconds(0.5),new KeyValue(Ball.centerYProperty(),Dots5.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.6),new KeyValue(Ball.centerXProperty(),Dots6.getLayoutX())),
			new KeyFrame(Duration.seconds(0.6),new KeyValue(Ball.centerYProperty(),Dots6.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.7),new KeyValue(Ball.centerXProperty(),Dots7.getLayoutX())),
			new KeyFrame(Duration.seconds(0.7),new KeyValue(Ball.centerYProperty(),Dots7.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.8),new KeyValue(Ball.centerXProperty(),bottom.getLayoutX())),
			new KeyFrame(Duration.seconds(0.85),new KeyValue(Ball.centerYProperty(),bottom.getLayoutY()-5)));
			Routinego.play();
	}
	public static void main (String[] args) {
	    Application.launch(args);  

	}
	
}
