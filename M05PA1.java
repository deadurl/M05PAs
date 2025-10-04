import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class M05PA1 extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        //grab from src/images
        Image img1 = new Image("file:src/images/flag1.gif");
        Image img2 = new Image("file:src/images/flag2.gif");
        Image img3 = new Image("file:src/images/flag6.gif");
        Image img4 = new Image("file:src/images/flag7.gif");

        //put in images
        ImageView iv1 = new ImageView(img2);
        ImageView iv2 = new ImageView(img4);
        ImageView iv3 = new ImageView(img3);
        ImageView iv4 = new ImageView(img1);

        //resize they look good and actually flag like since some had weird dimensions
        iv1.setFitWidth(250); iv1.setFitHeight(150);
        iv2.setFitWidth(250); iv2.setFitHeight(150);
        iv3.setFitWidth(250); iv3.setFitHeight(150);
        iv4.setFitWidth(250); iv4.setFitHeight(150);

        //add to grid
        grid.add(iv1, 0, 0);
        grid.add(iv2, 1, 0);
        grid.add(iv3, 0, 1);
        grid.add(iv4, 1, 1);

        //set scene, set to fit scene
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene(); 
        primaryStage.show();
        primaryStage.setTitle("Exercise14_01");
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}