package com.example.leaf;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import java.awt.Color;
import java.io.IOException;

import javafx.scene.layout.*;
import javafx.stage.Stage;

//what interacts with the fxml
public class aIntro {
    @FXML
    private Text welcomeText;
    @FXML
    private Label intro;
    @FXML
    private Button readyButton;
    @FXML
    private AnchorPane current;

    //sets the text box to display the intro text
    public void initialize() {
        welcomeText.setText("People commonly mistake photosynthesis as the series of reactions that make plants grow. " +
                "If the education system has failed them, they do not know that life grows in the dark. " +
                "This educational model simulates eukaryotic plant growth through descriptive illustrations, information cards, toggle buttons and trivia questions. " +
                "Users will learn how day-time photosynthesis and night-time cellular respiration contributing in developing Earth’s most important organisms… plants. ");
    }

    //opens the leaf scene
    @FXML
    protected void openLeaf() throws IOException {
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

}