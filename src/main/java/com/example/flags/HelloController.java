package com.example.flags;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Button btnClear;

    @FXML
    private Button btnRussia;

    @FXML
    private Button btnNigeria;

    @FXML
    private Button btnIreland;

    @FXML
    private Button btnGermany;

    @FXML
    private Button btnFrance;

    @FXML
    private Button btnAustria;

    @FXML
    private Rectangle top;

    @FXML
    private Rectangle middle;

    @FXML
    private Rectangle bottom;
    @FXML
    private Rectangle left;

    @FXML
    private Rectangle between;
    @FXML
    private Rectangle right;
    @FXML
    private Label lblNational;

    //Declaring colors
    Color red = Color.RED;
    Color green = Color.GREEN;
    Color blue = Color.BLUE;
    Color white = Color.WHITE;
    Color black = Color.BLACK;
    Color orange = Color.ORANGE;

    @FXML
    void handleClicks(ActionEvent event) {

        hide();
        //hitting the Austria button
        if(event.getSource()==btnAustria){
            top.setFill(red);
            middle.setFill(white);
            bottom.setFill(red);
            lblNational.setText("Austria");

        }
        //Pressing the Russia button
        if(event.getSource()==btnRussia){
            lblNational.setText("Russia");
            top.setFill(white);
            middle.setFill(blue);
            bottom.setFill(red);

        }
        //Hitting the Nigeria button
        if(event.getSource()==btnNigeria){
            left.setFill(green);
            between.setFill(white);
            right.setFill(green);
            lblNational.setText("Nigeria");
        }
        //pressing the Ireland Button
        if(event.getSource()==btnIreland){
            lblNational.setText("Ireland");
            left.setFill(green);
            between.setFill(white);
            right.setFill(orange);
        }
        //pressing the Germany button
        if(event.getSource()==btnGermany){
            lblNational.setText("Germany");
            top.setFill(black);
            middle.setFill(red);
            bottom.setFill(orange);
        }
        //hitting the France button
        if(event.getSource()==btnFrance){
            lblNational.setText("France");
            left.setFill(blue);
            between.setFill(white);
            right.setFill(red);
        }
        //clicking the clear button
        if(event.getSource()==btnClear){
            Reset();
        }
    }
    //method hide
    void hide(){
        top.setFill(null);
        middle.setFill(null);
        bottom.setFill(null);
        right.setFill(null);
        between.setFill(null);
        left.setFill(null);

    }
    //Method reset
    void Reset() {
        top.setFill(null);
        middle.setFill(null);
        bottom.setFill(null);
        left.setFill(null);
        between.setFill(null);
        right.setFill(null);

        lblNational.setText("Name");
    }
}