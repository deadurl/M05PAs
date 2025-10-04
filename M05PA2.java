import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class M05PA2 extends Application 
{
    @Override
    public void start(Stage stage)
    {
    
        //for input
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        //number 1 input box
        grid.add(new Label("Number 1:"), 0, 0);
        TextField tfNumber1 = new TextField("4.5");
        grid.add(tfNumber1, 1, 0);

        //number 2 input box
        grid.add(new Label("Number 2:"), 0, 1);
        TextField tfNumber2 = new TextField("3.4");
        grid.add(tfNumber2, 1, 1);

        //output box
        grid.add(new Label("Result:"), 0, 2);
        TextField tfResult = new TextField("7.9");
        tfResult.setEditable(false);
        grid.add(tfResult, 1, 2);

        //buttons for operations
        HBox buttonBox = new HBox(10);
        Button addBtn = new Button("Add");
        Button subBtn = new Button("Subtract");
        Button mulBtn = new Button("Multiply");
        Button divBtn = new Button("Divide");
        
        buttonBox.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);

        //button functions
        addBtn.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>()  //addition
        {
            @Override
            public void handle(javafx.event.ActionEvent e) 
            {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result = num1 + num2;
                tfResult.setText(result + "");
            }
        });

        subBtn.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() //subtraction
        {
            @Override
            public void handle(javafx.event.ActionEvent e) 
            {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result = num1 - num2;
                tfResult.setText(result + "");
            }
        });

        mulBtn.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() //multiplication
        {
            @Override
            public void handle(javafx.event.ActionEvent e) 
            {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result = num1 * num2;
                tfResult.setText(result + "");
            }
        });

        divBtn.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() //division
        {
            @Override
            public void handle(javafx.event.ActionEvent e) 
            {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result = num1 / num2;
                tfResult.setText(result + "");
            }
        });


       //layout
        VBox root = new VBox(10);
        root.getChildren().addAll(grid, buttonBox);

        // Scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("M05PA2");
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
