import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class M05PA3 extends Application 
{
    @Override
    public void start(Stage stage) 
    {
       

        //light circles with initial gray color
        Circle redLight = new Circle(20); //red
        redLight.setFill(Color.GRAY);

        Circle yellowLight = new Circle(20); //yellow
        yellowLight.setFill(Color.GRAY);

        Circle greenLight = new Circle(20); //green
        greenLight.setFill(Color.GRAY);

        //light positions
        VBox lightBox = new VBox(10); //for spacing
        lightBox.setAlignment(Pos.CENTER); //so its centered and more aligns with example
        lightBox.getChildren().addAll(redLight, yellowLight, greenLight); //add buttons

        //box outline
        Rectangle outline = new Rectangle(60, 170); //rectangle outline
        outline.setFill(Color.TRANSPARENT); //no color
        outline.setStroke(Color.BLACK); //black lines
        outline.setStrokeWidth(2); //thickness

        //layering of scene
        StackPane trafficLight = new StackPane();
        trafficLight.getChildren().addAll(outline, lightBox);

        //buttons
        RadioButton redBtn = new RadioButton("Red");
        RadioButton yellowBtn = new RadioButton("Yellow");
        RadioButton greenBtn = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        redBtn.setToggleGroup(group);
        yellowBtn.setToggleGroup(group);
        greenBtn.setToggleGroup(group);

        //operations upon button press
        redBtn.setOnAction(e -> {
            redLight.setFill(Color.RED); //set only red light
            yellowLight.setFill(Color.GRAY);
            greenLight.setFill(Color.GRAY);
        });

        yellowBtn.setOnAction(e -> {
            redLight.setFill(Color.GRAY);
            yellowLight.setFill(Color.YELLOW); //set only yellow
            greenLight.setFill(Color.GRAY);
        });

        greenBtn.setOnAction(e -> {
            redLight.setFill(Color.GRAY);
            yellowLight.setFill(Color.GRAY);
            greenLight.setFill(Color.GREEN); //set only green
        });

        //button layout
        HBox controls = new HBox(15);
        controls.setAlignment(Pos.CENTER);
        controls.getChildren().addAll(redBtn, yellowBtn, greenBtn);

        //main alignment
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(trafficLight, controls);

        //scene setup
        Scene scene = new Scene(root, 200, 300);
        stage.setScene(scene);
        stage.setTitle("M05PA3");
        stage.show();
    }

    public static void main(String[] args) {launch(args);}
}
