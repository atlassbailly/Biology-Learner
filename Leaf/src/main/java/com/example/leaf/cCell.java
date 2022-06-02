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
//manages the cell scene
public class cCell {

    @FXML
    private ImageView cellPic;
    @FXML
    private ImageView mitochondrionPic;
    @FXML
    private ImageView chloroplastPic;
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


    //opens the chloroplast fxml when the chloroplast is clicked
    @FXML
    private void openChloroplast(){
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

    //opens the mitochondrion fxml when the mitochondrion picture is clicked
    @FXML
    private void openMitochondrion(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("3-cell-mitochondrion.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Mitochondrion");
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

    @FXML
    private void back(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("1-leaf.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Leaf");
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
            Image cell = new Image("/imgs/cellpic.png");
            cellPic.setImage(cell);
            Image chloroplast = new Image("/imgs/chloroplastclick.png");
            chloroplastPic.setImage(chloroplast);
            Image mitochondrion = new Image("/imgs/mitochondrionclick.png");
            mitochondrionPic.setImage(mitochondrion);

            Image sun = new Image("/imgs/sun.png");
            time.setImage(sun);

            infobar.setText(Infobars.Cellday.getInfo());
            goal.setText(Goals.Cellday.getGoal());
        }
        else{
            //set the pictures
            Image cell = new Image("/imgs/cellpic-n.png");
            cellPic.setImage(cell);
            Image chloroplast = new Image("/imgs/chloroplastclick-n.png");
            chloroplastPic.setImage(chloroplast);
            Image mitochondrion = new Image("/imgs/mitochondrionclick-n.png");
            mitochondrionPic.setImage(mitochondrion);

            Image moon = new Image("/imgs/moon.png");
            time.setImage(moon);

            infobar.setText(Infobars.Cellnight.getInfo());
            goal.setText(Goals.Cellnight.getGoal());
        }
    }
}
