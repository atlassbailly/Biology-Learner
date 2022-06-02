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
//implements the selection tree functionality
public class Menu {

    @FXML
    private ImageView leaf;
    @FXML
    private ImageView leafPic;
    @FXML
    private ImageView cellPic;
    @FXML
    private ImageView veinPic;
    @FXML
    private ImageView stomaPic;
    @FXML
    private ImageView mitochondrionPic;
    @FXML
    private ImageView ribosomePic;
    @FXML
    private ImageView matrixPic;
    @FXML
    private ImageView outerPic;
    @FXML
    private ImageView innerPic;
    @FXML
    private ImageView dnaPic;
    @FXML
    private ImageView chloroplastPic;
    @FXML
    private ImageView granaPic;
    @FXML
    private ImageView thylakoidPic;
    @FXML
    private AnchorPane current;
    @FXML
    private Label goal;

    //sets up all the pictures and text
    public void initialize() {
        dayNNite();
    }

    //opens the leaf fxml when the leaf is clicked
    @FXML
    private void openLeaf(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("1-leaf.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Leaf Cell");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens the cell fxml when the cell is clicked
    @FXML
    private void openCell(){
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

    //opens the stoma fxml when the stoma picture is clicked
    @FXML
    private void openStoma(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("2-stomata.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Stomata");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens the vein fxml when the vein picture is clicked
    @FXML
    private void openVein(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("2-vein.fxml"));
            Stage stage = (Stage) current.getScene().getWindow();
            stage.setTitle("Vein");
            stage.setScene(new Scene(root, 850, 640));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println("EXCEPTION CAUGHT");
        }
    }

    //opens the mithcondrion scene
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

    //opens the ribosome scene
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

    //opens the mitochondrial matrix scene
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

    //opens the outer mitochondrial membrane scene
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

    //opens the inner mitochondrial membrane scene
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

    //opens the dna scene
    @FXML
    private void openDna(){
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

    //opens the chloroplast scene
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

    //opens the grana scene
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

    //opens the thylakoid membrane scene
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

    //displays more info
    @FXML
    private void moreInfo(){
        JOptionPane.showMessageDialog(null,"None yet!");
    }

    //gives the test
    @FXML
    private void test(){
        JOptionPane.showMessageDialog(null,"Tada! Here's the test");
    }

    //sets up the pictures and text depending on whether its day or night
    //ALSO KID CUDI HAHA FUNNY
    @FXML
    private void dayNNite() {
        //set the pictures
        Image leafimg = new Image("/imgs/leafer.png");
        leaf.setImage(leafimg);
        Image image = new Image("/imgs/leafclick-m.png");
        leafPic.setImage(image);
        Image vein = new Image("/imgs/veinclick-m.png");
        veinPic.setImage(vein);
        Image cell = new Image("/imgs/cellclick-m.png");
        cellPic.setImage(cell);
        Image stoma = new Image("/imgs/stomataclick-m.png");
        stomaPic.setImage(stoma);
        Image mitochondrion = new Image("/imgs/mitochondrionclick-m.png");
        mitochondrionPic.setImage(mitochondrion);
        Image ribosome = new Image("/imgs/ribosomeclick-m.png");
        ribosomePic.setImage(ribosome);
        Image matrix = new Image("/imgs/matrixclick-m.png");
        matrixPic.setImage(matrix);
        Image outer = new Image("/imgs/outerclick-m.png");
        outerPic.setImage(outer);
        Image inner = new Image("/imgs/innerclick-m.png");
        innerPic.setImage(inner);
        Image dna = new Image("/imgs/dnaclick-m.png");
        dnaPic.setImage(dna);
        Image chloroplast = new Image("/imgs/chloroplastclick-m.png");
        chloroplastPic.setImage(chloroplast);
        Image grana = new Image("/imgs/granaclick-m.png");
        granaPic.setImage(grana);
        Image thylakoid = new Image("/imgs/thylakoidclick-m.png");
        thylakoidPic.setImage(thylakoid);
    }
}
