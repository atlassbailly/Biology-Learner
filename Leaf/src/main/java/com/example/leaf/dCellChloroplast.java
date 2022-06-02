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

//manages the chloroplast scene
public class dCellChloroplast {

    @FXML
    private ImageView chloroplastPic;
    @FXML
    private ImageView granaPic;
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


    //opens the grana fxml when the grana is clicked
    @FXML
    private void openGrana(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-chloro-grana.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Grana");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens the thylakoid fxml when the thylakoid picture is clicked
    @FXML
    private void openThylakoid(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-chloro-thylakoid.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Thylakoid Membrane");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
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
        JOptionPane.showMessageDialog(null,"None yet!");
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

    //returns to the cell scene
    @FXML
    private void back(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("2-cell.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Leaf Cell");
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
            Image chloroplast = new Image("/imgs/chloroplastday.png");
            chloroplastPic.setImage(chloroplast);
            Image thylakoid = new Image("/imgs/thylakoidclick.png");
            thylakoidPic.setImage(thylakoid);
            Image grana = new Image("/imgs/granaclick.png");
            granaPic.setImage(grana);

            Image sun = new Image("/imgs/sun.png");
            time.setImage(sun);

            infobar.setText(Infobars.Chloroplastday.getInfo());
            goal.setText(Goals.Chloroplastday.getGoal());
        }
        else{
            //set the pictures
            Image chloroplast = new Image("/imgs/chloroplastnight.png");
            chloroplastPic.setImage(chloroplast);
            Image thylakoid = new Image("/imgs/thylakoidclick-n.png");
            thylakoidPic.setImage(thylakoid);
            Image grana = new Image("/imgs/granaclick-n.png");
            granaPic.setImage(grana);

            Image moon = new Image("/imgs/moon.png");
            time.setImage(moon);

            infobar.setText(Infobars.Chloroplastnight.getInfo());
            goal.setText(Goals.Chloroplastnight.getGoal());
        }
    }
}
