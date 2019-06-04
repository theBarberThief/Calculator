import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import java.io.FileReader;
import java.io.BufferedReader;

public class GUI extends Application {
    double value;
    String operator;
    int counter = 0;
    public void start(Stage myStage){
       //creates textfield to display user input and answer
        TextField textfield = new TextField();

        //value in the textfield




        //number 7
        //creates image object to create a button with that image
        Image image7 = new Image("7.png");
        ImageView iv7 = new ImageView(image7);

        //set the height and width of the image
        iv7.setFitHeight(30);
        iv7.setFitWidth(30);

        //creates a button with the image
        Button num7 = new Button("", iv7);

        //if button is pressed, adds

        num7.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                counter++;
                System.out.println(counter);
                String textData = textfield.getText();
                textfield.setText(textData+7);
            }
        });


        //num 8
        //creates image object to create a button with that image
        Image image8 = new Image("8.png");
        ImageView iv8 = new ImageView(image8);

        //set the height and width of the image
        iv8.setFitHeight(30);
        iv8.setFitWidth(30);

        //creates a button with the image
        Button num8 = new Button("", iv8);

        //if button is pressed, adds
        num8.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+8);
            }
        });

        //num 9
        //creates image object to create a button with that image
        Image image9 = new Image("9.png");
        ImageView iv9 = new ImageView(image9);

        //set the height and width of the image
        iv9.setFitHeight(30);
        iv9.setFitWidth(30);

        //creates a button with the image
        Button num9 = new Button("", iv9);

        //if button is pressed, adds
        num9.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+9);
            }
        });

        //num 6
        //creates image object to create a button with that image
        Image image6 = new Image("6.png");
        ImageView iv6 = new ImageView(image6);

        //set the height and width of the image
        iv6.setFitHeight(30);
        iv6.setFitWidth(30);

        //creates a button with the image
        Button num6 = new Button("", iv6);

        //if button is pressed, adds
        num6.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+6);
            }
        });

        //num 5
        //creates image object to create a button with that image
        Image image5 = new Image("5.png");
        ImageView iv5 = new ImageView(image5);

        //set the height and width of the image
        iv5.setFitHeight(30);
        iv5.setFitWidth(30);

        //creates a button with the image
        Button num5 = new Button("", iv5);

        //if button is pressed, adds
        num5.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+5);
            }
        });

        //num 4
        //creates image object to create a button with that image
        Image image4 = new Image("4.png");
        ImageView iv4 = new ImageView(image4);

        //set the height and width of the image
        iv4.setFitHeight(30);
        iv4.setFitWidth(30);

        //creates a button with the image
        Button num4 = new Button("", iv4);

        //if button is pressed, adds
        num4.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+4);
            }
        });

        //num 3
        //creates image object to create a button with that image
        Image image3 = new Image("3.png");
        ImageView iv3 = new ImageView(image3);

        //set the height and width of the image
        iv3.setFitHeight(30);
        iv3.setFitWidth(30);

        //creates a button with the image
        Button num3 = new Button("", iv3);

        //if button is pressed, adds
        num3.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+3);
            }
        });

        //num 2
        //creates image object to create a button with that image
        Image image2 = new Image("2.png");
        ImageView iv2 = new ImageView(image2);

        //set the height and width of the image
        iv2.setFitHeight(30);
        iv2.setFitWidth(30);

        //creates a button with the image
        Button num2 = new Button("", iv2);

        //if button is pressed, adds
        num2.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+2);
            }
        });

        //num 1
        //creates image object to create a button with that image
        Image image1 = new Image("1.png");
        ImageView iv1 = new ImageView(image1);

        //set the height and width of the image
        iv1.setFitHeight(30);
        iv1.setFitWidth(30);

        //creates a button with the image
        Button num1 = new Button("", iv1);

        //if button is pressed, adds
        num1.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+1);
            }
        });

        //num 8
        //creates image object to create a button with that image
        Image image0 = new Image("0.png");
        ImageView iv0 = new ImageView(image0);

        //set the height and width of the image
        iv0.setFitHeight(30);
        iv0.setFitWidth(30);

        //creates a button with the image
        Button num0 = new Button("", iv0);

        //if button is pressed, adds
        num0.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                String textData = textfield.getText();
                textfield.setText(textData+0);
            }
        });

        //+ object
        //creates image object to create a button with that image
        Image imagePlus = new Image("+.png");
        ImageView ivPlus = new ImageView(imagePlus);

        //set the height and width of the image
        ivPlus.setFitHeight(30);
        ivPlus.setFitWidth(30);

        //creates a button with the image
        Button numPlus = new Button("", ivPlus);

        //if button is pressed, adds
        numPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                value = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator = "+";
            }
        });

        //+ object
        //creates image object to create a button with that image
        Image imageMinus = new Image("-.png");
        ImageView ivMinus = new ImageView(imageMinus);

        //set the height and width of the image
        ivMinus.setFitHeight(30);
        ivMinus.setFitWidth(30);

        //creates a button with the image
        Button numMinus = new Button("", ivMinus);

        //if button is pressed, adds
        numMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                value = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator = "-";
            }
        });

        //+ object
        //creates image object to create a button with that image
        Image imageTimes = new Image("x.png");
        ImageView ivTimes = new ImageView(imageTimes);

        //set the height and width of the image
        ivTimes.setFitHeight(30);
        ivTimes.setFitWidth(30);

        //creates a button with the image
        Button numTimes = new Button("", ivTimes);

        //if button is pressed, adds
        numTimes.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                value = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator = "*";
            }
        });

        //+ object
        //creates image object to create a button with that image
        Image imageDivide = new Image("divide.png");
        ImageView ivDivide = new ImageView(imageDivide);

        //set the height and width of the image
        ivDivide.setFitHeight(30);
        ivDivide.setFitWidth(30);

        //creates a button with the image
        Button numDivide = new Button("", ivDivide);

        //if button is pressed, adds
        numDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                value = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operator = "/";
            }
        });

        //clear object
        //creates image object to create a button with that image
        Image imageC = new Image("c.png");
        ImageView ivC = new ImageView(imageC);

        //set the height and width of the image
        ivC.setFitHeight(30);
        ivC.setFitWidth(30);

        //creates a button with the image
        Button numC = new Button("", ivC);

        //if button is pressed, adds
        numC.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                textfield.setText("");

            }
        });

        //= object
        //creates image object to create a button with that image
        Image imageEquals = new Image("=.png");
        ImageView ivEquals = new ImageView(imageEquals);

        //set the height and width of the image
        ivEquals.setFitHeight(30);
        ivEquals.setFitWidth(30);

        //creates a button with the image
        Button numEquals = new Button("", ivEquals);

        //if button is pressed, adds
        numEquals.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                double answer = 0;
                double secondValue = Double.parseDouble(textfield.getText());
                if(operator.equals("+")){
                    textfield.setText(Double.toString(value + secondValue));
                    answer = value + secondValue;
                }
                else if(operator.equals("-")){
                    textfield.setText(Double.toString(value-secondValue));
                    answer = value-secondValue;
                }
                else if(operator.equals("*")){
                    textfield.setText(Double.toString(value * secondValue));
                    answer = value * secondValue;
                }
                else if(operator.equals("/")){
                    textfield.setText(Double.toString(value/secondValue));
                    answer = value/secondValue;

                }

                String path = "/Users/s210230/IdeaProjects/Final Project/src/Computations";
                try {
                    FileWriter write = new FileWriter(path,true);
                    PrintWriter printLine = new PrintWriter(write);
                    printLine.printf("%s" + "%n", answer);
                    printLine.close();
                }

                catch(Exception e){
                    System.out.println("naughty naughty");
                }



            }
        });

        Button printRecents = new Button("Print Recents");
        printRecents.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                try {
                    String path = "/Users/s210230/IdeaProjects/Final Project/src/Computations";
                    FileReader reader = new FileReader(path);

                    BufferedReader buffReader = new BufferedReader(reader);
                    String line = buffReader.readLine();
                    if(line == null){
                        System.out.println("All Recents Cleared");
                    }
                    while(line != null){
                        System.out.println(line);
                        line = buffReader.readLine();
                    }
                buffReader.close();
                }


                catch(Exception e){
                    System.out.println("that is very naughty indeed");
                }
            }

        });

        Button clearRecents = new Button("Clear Recents");
        clearRecents.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                try {
                    String path = "/Users/s210230/IdeaProjects/Final Project/src/Computations";
                    FileWriter write = new FileWriter(path);
                    PrintWriter clearAll = new PrintWriter(write);
                    clearAll.print("");
                    clearAll.close();


                }

                catch(Exception e){
                    System.out.println("2naughty4me");
                }
            }

        });







       GridPane gridPane = new GridPane();

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setMinSize(100,100);
        gridPane.maxHeight(4);
        gridPane.maxWidth(4);
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        num7.setMinWidth(1);
        num7.setMinHeight(1);
        gridPane.add(num7, 0,2);
        gridPane.add(num8, 1,2);
        gridPane.add(num9,2,2);
        gridPane.add(num4, 0, 3);
        gridPane.add(num5, 1, 3);
        gridPane.add(num6, 2,3);
        gridPane.add(num1, 0,4);
        gridPane.add(num2,1,4);
        gridPane.add(num3,2,4);
        gridPane.add(num0,3,4);
        gridPane.add(numPlus,3,3);
        gridPane.add(numMinus,4,3);
        gridPane.add(numTimes, 3,2);
        gridPane.add(numDivide, 4,2);
        gridPane.add(numC,4,1 );
        gridPane.add(numEquals,4,4);
        gridPane.add(textfield, 2,0);
        gridPane.add(printRecents,2,1);
        gridPane.add(clearRecents, 2,5);





        //gridPane.setAlignment(Pos.CENTER);


        Scene scene = new Scene(gridPane, 400,450);

        myStage.setTitle("Calculator");
        myStage.setScene(scene);
        myStage.show();
    }
}
