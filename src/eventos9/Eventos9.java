/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos9;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */
public class Eventos9 extends Application {
    static double velocidad_bolax=1;
    static double velocidad_bolay=1;
    @Override
    public void start(Stage primaryStage) {
        Pane root=new Pane();
        Ellipse ellipse = new Ellipse(250,250,50,25);
        ellipse.setFill(Paint.valueOf("Red"));
        FadeTransition ft = new FadeTransition(Duration.millis(3000), ellipse);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play(); // Start animation
        // Control animation
        ellipse.setOnMousePressed(e -> ft.pause());
        ellipse.setOnMouseReleased(e -> ft.play());
        
        root.getChildren().add(ellipse);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("elipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }  
}
