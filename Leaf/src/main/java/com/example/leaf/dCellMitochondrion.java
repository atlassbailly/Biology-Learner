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

//manages the mitochondrion scene
public class dCellMitochondrion {

    @FXML
    private ImageView mitochondrionPic;
    @FXML
    private ImageView ribosomePic;
    @FXML
    private ImageView dnaPic;
    @FXML
    private ImageView matrixPic;
    @FXML
    private ImageView innerPic;
    @FXML
    private ImageView outerPic;
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


    //opens ribosome
    @FXML
    private void openRibosome(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-mito-ribosome.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Ribosome");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens dna
    @FXML
    private void openDNA(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-mito-dna.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Mitochondrial DNA");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens matrix
    @FXML
    private void openMatrix(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-mito-matrix.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Matrix");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens inner mitochondrial membrane
    @FXML
    private void openInner(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-mito-inner.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Inner Mitochondrial Membrane");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens outer mitochondrial membrane
    @FXML
    private void openOuter(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("4-mito-outer.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Outer Mitochondrial Membrane");
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
        JOptionPane.showMessageDialog(null,"Structure: Double membrane, where the inner membrane is folded to increase surface area to volume \n"  +
                        "ratio (allows area for more chemical reactions to occur). These folds are called cristae. \n"  +
                "It also contains expressed genetic material, ribosomes, and matrix (the space inside the inner membrane).");
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
            Image mitochondrion = new Image("/imgs/mitochondrion.png");
            mitochondrionPic.setImage(mitochondrion);
            Image dna = new Image("/imgs/dnaclick.png");
            dnaPic.setImage(dna);
            Image ribosome = new Image("/imgs/ribosomeclick.png");
            ribosomePic.setImage(ribosome);
            Image matrix = new Image("/imgs/matrixclick.png");
            matrixPic.setImage(matrix);
            Image inner = new Image("/imgs/innerclick.png");
            innerPic.setImage(inner);
            Image outer = new Image("/imgs/outerclick.png");
            outerPic.setImage(outer);

            Image sun = new Image("/imgs/sun.png");
            time.setImage(sun);

            infobar.setText(Infobars.Mitochondrionday.getInfo());
            goal.setText(Goals.Mitochondrionday.getGoal());
        }
        else{
            //set the pictures
            Image mitochondrion = new Image("/imgs/mitochondrion-n.png");
            mitochondrionPic.setImage(mitochondrion);
            Image dna = new Image("/imgs/dnaclick-n.png");
            dnaPic.setImage(dna);
            Image ribosome = new Image("/imgs/ribosomeclick-n.png");
            ribosomePic.setImage(ribosome);
            Image matrix = new Image("/imgs/matrixclick-n.png");
            matrixPic.setImage(matrix);
            Image inner = new Image("/imgs/innerclick-n.png");
            innerPic.setImage(inner);
            Image outer = new Image("/imgs/outerclick-n.png");
            outerPic.setImage(outer);


            Image moon = new Image("/imgs/moon.png");
            time.setImage(moon);

            infobar.setText(Infobars.Mitochondrionnight.getInfo());
            goal.setText(Goals.Mitochondrionnight.getGoal());
        }
    }
}
