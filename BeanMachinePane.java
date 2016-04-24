import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import java.security.SecureRandom;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class BeanMachinePane  extends Application { 
	double X, Y;
	public void start(Stage primaryStage) {	
		Pane pane = new Pane();	//create a pane    
		Circle Dot1 = new Circle(275,100,5,Color.BLACK);//create 28 circle as dots
		Circle Dot2 = new Circle(250,130,5,Color.BLACK);
		Circle Dot3 = new Circle(300,130,5,Color.BLACK);
		Circle Dot4 = new Circle(275,160,5,Color.BLACK);
		Circle Dot5 = new Circle(325,160,5,Color.BLACK);
		Circle Dot6 = new Circle(225,160,5,Color.BLACK);
		Circle Dot7 = new Circle(200,190,5,Color.BLACK);
		Circle Dot8 = new Circle(350,190,5,Color.BLACK);
		Circle Dot9 = new Circle(250,190,5,Color.BLACK);
		Circle Dot10 = new Circle(300,190,5,Color.BLACK);
		Circle Dot11 = new Circle(375,220,5,Color.BLACK);
		Circle Dot12 = new Circle(175,220,5,Color.BLACK);
		Circle Dot13 = new Circle(225,220,5,Color.BLACK);
		Circle Dot14 = new Circle(275,220,5,Color.BLACK);
		Circle Dot15 = new Circle(325,220,5,Color.BLACK);
		Circle Dot16 = new Circle(400,250,5,Color.BLACK);
		Circle Dot17 = new Circle(150,250,5,Color.BLACK);
		Circle Dot18 = new Circle(200,250,5,Color.BLACK);
		Circle Dot19 = new Circle(250,250,5,Color.BLACK);
		Circle Dot20 = new Circle(300,250,5,Color.BLACK);
		Circle Dot21 = new Circle(350,250,5,Color.BLACK);
		Circle Dot22 = new Circle(425,280,5,Color.BLACK);
		Circle Dot23 = new Circle(125,280,5,Color.BLACK);
		Circle Dot24 = new Circle(175,280,5,Color.BLACK);
		Circle Dot25 = new Circle(225,280,5,Color.BLACK);
		Circle Dot26 = new Circle(275,280,5,Color.BLACK);
		Circle Dot27 = new Circle(325,280,5,Color.BLACK);
		Circle Dot28 = new Circle(375,280,5,Color.BLACK);
		Circle bottom1 = new Circle(100,350,0.1,Color.WHITE);
		Circle bottom2 = new Circle(150,350,0.1,Color.WHITE);
		Circle bottom3 = new Circle(200,350,0.1,Color.WHITE);
		Circle bottom4 = new Circle(250,350,0.1,Color.WHITE);
		Circle bottom5 = new Circle(300,350,0.1,Color.WHITE);
		Circle bottom6 = new Circle(350,350,0.1,Color.WHITE);
		Circle bottom7 = new Circle(400,350,0.1,Color.WHITE);
		Circle bottom8 = new Circle(450,350,0.1,Color.WHITE);	
		Line Line1 = new Line(300,65,475,280);	//create line as side
		Line Line2 = new Line(475,350,75,350);		
		Line Line3 = new Line(250,65,75,280);	
		Line Line4 = new Line(475,280,475,350);	
		Line Line5 = new Line(75,350,75,280);	
		Line Line6 = new Line(300,65,300,40);		
		Line Line7 = new Line(250,65,250,40);	
		Line Line8 = new Line(123,280,125,350);	
		Line Line9 = new Line(175,280,175,350);	
		Line Line10 = new Line(225,280,225,350);	
		Line Line11 = new Line(275,280,275,350);
		Line Line12 = new Line(325,280,325,350);
		Line Line13 = new Line(425,280,425,350);
		Line Line14 = new Line(375,280,375,350);
		pane.getChildren().addAll(Dot1,Dot2,Dot3,Dot4,Dot5,Dot6,Dot7,Dot8,Dot9,Dot10,Dot11,Dot12,Dot13,Dot14,Dot15,Dot16,Dot17,Dot18,Dot19,Dot20,Dot21,Dot22,Dot23,Dot24,Dot25,Dot26,Dot27,Dot28,Line1,Line2,Line3,Line4,Line5,Line6,Line7,Line8,Line9,Line10,Line11,Line12,Line13,Line14,bottom1,bottom2,bottom3,bottom4,bottom5,bottom6,bottom7,bottom8);
		Scene scene = new Scene(pane,600,500);//create a scene
		pane.setOnMouseClicked(e -> {
			X = 275; Y = 50;
			Circle Ball = new Circle(X,Y,6,new Color(Math.random(),Math.random(), Math.random(), 0.8));
			pane.getChildren().add(Ball);
			
			
		});
		primaryStage.setTitle("BeanMachinePane");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public double randomX(double a){
		int d = new SecureRandom().nextInt(2),i = 0;
		if(d == 1)
			i = 1;
		else
			i = -1;
		return (i * 25) + a;
	}
	public void Routine(Circle Ball){
		Timeline Routinego = new Timeline(new KeyFrame(Duration.seconds(0.2),new KeyValue(Ball.centerXProperty(),randomX(Ball.getCenterX()))),new KeyFrame(Duration.seconds(0.2),new KeyValue(Ball.centerYProperty(),Ball.getCenterY())));
			Routinego.play();
	}
	public static void main (String[] args) {
	    Application.launch(args);  

	}
	
}