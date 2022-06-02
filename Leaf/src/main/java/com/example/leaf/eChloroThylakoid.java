package com.example.leaf;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//manages the thylakoid membrane scene
public class eChloroThylakoid {

    @FXML
    private ImageView thylakoidPic;
    @FXML
    private ImageView time;
    @FXML
    private AnchorPane current;
    @FXML
    private Label goal;
    @FXML
    private Text infobar;

    //sets up all the pictures and text
    public void initialize() {
        dayNNite();
    }


    //changes from day to night and from night to day
    @FXML
    private void time(){
        if(Manager.isDay()){
            Manager.makeNight();
        } else {
            Manager.makeDay();
        }

        dayNNite();
    }

    //displays the selection tree hierarchy
    @FXML
    private void selectionTree(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Menu Select");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //displays more info
    @FXML
    private void moreInfo(){
        JOptionPane.showMessageDialog(null,"Step 2. PSl: The charged electron reaches molecule pair P700, which boosts the electron to a higher energy level \n" +
                "to push it down the membrane. At the end of the chain, two charged molecules created by these reactions \n" +
                "are passed to NADP+ to create NADPH, which stores energy needed to create glucose.");
    }

    //gives the test
    @FXML
    private void test(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Test");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //returns to the chloroplast scene
    @FXML
    private void back(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("3-cell-chloroplast.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Chloroplast");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //sets up the pictures and text depending on whether its day or night
    @FXML
    private void dayNNite(){
        FileInputStream inputstream = null;
        if(Manager.isDay()) {
            //set the pictures
            Image thylakoid = new Image("/imgs/thylakoid.gif");
            thylakoidPic.setImage(thylakoid);

            Image sun = new Image("/imgs/sun.png");
            time.setImage(sun);

            infobar.setText(Infobars.Thylakoidday.getInfo());
            goal.setText(Goals.Thylakoidday.getGoal());
        }
        else{
            //set the pictures
            Image thylakoid = new Image("/imgs/thylakoid-n.gif");
            thylakoidPic.setImage(thylakoid);


            Image moon = new Image("/imgs/moon.png");
            time.setImage(moon);

            infobar.setText(Infobars.Thylakoidnight.getInfo());
            goal.setText(Goals.Thylakoidnight.getGoal());
        }
    }
}