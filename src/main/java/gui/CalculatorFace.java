package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;




public class CalculatorFace extends Application
{


    @Override
    public void start(Stage stage)
    {
        Button add = new Button(),sub, divide,multiple,square, squareRoot,one,zero,clear,equal;
        TextArea Text;
        Pane pane;
        stage.setTitle("BinaryCalculator");
        pane = new Pane();
        /*add.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent actionEvent){

            }
        });*/
     //   sub = new Button("-");
        /*sub.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
       // divide = new Button("/");
        /*divide.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //multiple = new Button("*");
        /*multiple.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //square = new Button("^2");
        /*square.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //squareRoot = new Button("");
        /*squareRoot.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //one = new Button("1");
        /*one.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //zero = new Button("0");
        /*zero.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //clear = new Button("CL");
        /*clear.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //equal = new Button("=");
        /*equal.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {

            }
        });*/
        //Text = new TextArea();

       // pane.getChildren().addAll(new Button[]{add, sub, divide, multiple, square, squareRoot, one, zero, clear, equal});
        //pane.getChildren().add(Text);*/

        stage.setScene(new Scene(pane, 400, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}