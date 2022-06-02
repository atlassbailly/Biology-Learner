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
//manages the leaf scene
public class bLeaf {

    @FXML
    private ImageView leafPic;
    @FXML
    private ImageView cellPic;
    @FXML
    private ImageView veinPic;
    @FXML
    private ImageView stomaPic;
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

    //sets up the pictures and text depending on whether its day or night
    @FXML
    private void dayNNite(){
        FileInputStream inputstream = null;
        if(Manager.isDay()) {
            //set the pictures
            Image image = new Image("/imgs/daygif.gif");
            leafPic.setImage(image);
            Image vein = new Image("/imgs/veinclick.gif");
            veinPic.setImage(vein);
            Image cell = new Image("/imgs/cellclick.gif");
            cellPic.setImage(cell);
            Image stoma = new Image("/imgs/stomataclick.gif");
            stomaPic.setImage(stoma);


            Image sun = new Image("/imgs/sun.png");
            time.setImage(sun);

            infobar.setText(Infobars.Leafday.getInfo());
            goal.setText(Goals.Leafday.getGoal());
        }
        else{
            //set the pictures
            Image image = new Image("/imgs/night leaf.png");
            leafPic.setImage(image);
            Image vein = new Image("/imgs/veinclick-n.png");
            veinPic.setImage(vein);
            Image cell = new Image("/imgs/cellclick-n.png");
            cellPic.setImage(cell);
            Image stoma = new Image("/imgs/stomataclick-n.png");
            stomaPic.setImage(stoma);


            Image moon = new Image("/imgs/moon.png");
            time.setImage(moon);

            infobar.setText(Infobars.Leafnight.getInfo());
            goal.setText(Goals.Leafnight.getGoal());
        }
    }
}
