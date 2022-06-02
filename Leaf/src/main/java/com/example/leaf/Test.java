package com.example.leaf;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.Color;

import java.util.ArrayList;

//manages the take test functionality
public class Test {
    @FXML
    private Button respiration;
    @FXML
    private Button photosynthesis;
    @FXML
    private Button organelle;
    @FXML
    private Button miscellaneous;
    @FXML
    private Button next;
    @FXML
    private AnchorPane current;
    @FXML
    private Label question;
    @FXML
    private Label goal;
    @FXML
    private CheckBox option1;
    @FXML
    private CheckBox option2;
    @FXML
    private CheckBox option3;
    @FXML
    private CheckBox option4;
    @FXML
    private Slider num;
    private ArrayList<Question> respirationQ, photosynthesisQ, organelleQ, miscQ, questionOptions, questions;
    private boolean respirationOn, photosynthesisOn, organelleOn, miscOn;
    private int length, right, wrong;

    //selects respiration as a possible quesiton type
    @FXML
    public void respiration(){
        if(!respirationOn)
            respiration.setStyle("-fx-background-color:#03dbfc");
        else
            respiration.setStyle("");
        respirationOn = !respirationOn;
    }
    //selects photosynthesis as a possible quesiton type
    @FXML
    public void photosynthesis(){
        if(!photosynthesisOn)
            photosynthesis.setStyle("-fx-background-color:#03dbfc");
        else
            photosynthesis.setStyle("");
        photosynthesisOn = !photosynthesisOn;
    }
    //selects organelles as a possible quesiton type
    @FXML
    public void organelle(){
        if(!organelleOn)
            organelle.setStyle("-fx-background-color:#03dbfc");
        else
            organelle.setStyle("");
        organelleOn = !organelleOn;
    }
    //selects miscellaneous as a possible quesiton type
    @FXML
    public void miscellaneous(){
        if(!miscOn)
            miscellaneous.setStyle("-fx-background-color:#03dbfc");
        else
            miscellaneous.setStyle("");
        miscOn = !miscOn;
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

    //adds questiosn of each type to dedicated test bank array lists
    public void add(){
        respirationQ.add(new Question(1, "Releases energy from food", "Creates food from the sun", "Requires the sun to function","Always requires oxygen",
                "Which of the following best describes cellular respiration? “A process that: ” (section: inner mitochondrial membrane)"));
        respirationQ.add(new Question(2, "True", "False", "","",
                "Cellular respiration is completely aerobic, meaning that every phase needs oxygen in order to take place."));
        respirationQ.add(new Question(2, "Matrix", "Inner mitochondrial membrane", "Ribosome","DNA",
                "ATP synthase is located in the"));

        photosynthesisQ.add(new Question(3, "It converges green light", "It absorbs green light", "It reflects green light","It refracts green light",
                "Why does chlorophyll make plants appear green?"));
        photosynthesisQ.add(new Question(4, "Citric acid", "acetyl-CoA", "C02","02 and glucose",
                "What are C02 and H20 converted to as a result of photosynthesis? (light independent cycle)"));
        photosynthesisQ.add(new Question(2, "Ribosomal fluids", "Chlorophyll", "Cytosol","ATP synthase",
                "What is the main green pigment in green plants?"));
        photosynthesisQ.add(new Question(2, "Vacuoles", "Chloroplasts", "Lysosomes","Ribosomes",
                "What are the organelles that use sunlight to produce food in the process of photosynthesis?"));
        photosynthesisQ.add(new Question(1, "Photons", "Oxygen", "C02","Glucose",
                "In sunlight, chlorophyll traps ______?"));

        organelleQ.add(new Question(1, "Mitochondrion", "Chloroplast", "Ribosome","Vein",
                "What organelle contains its own set of DNA? (section: DNA)"));
        organelleQ.add(new Question(4, "Cell walls", "Matrix", "Nucleus","Mitochondrion",
                "Which organelle houses the process of cellular respiration?"));
        organelleQ.add(new Question(1, "Thylakoid Membrane", "Vein", "Stomata","Lysosome",
                "Which organelle houses the first step of photosynthesis?"));
        organelleQ.add(new Question(1, "Grana", "Thylakoid membrane", "Root cells","Golgi apparatus",
                "Which organelle houses the second step of photosynthesis?"));

        miscQ.add(new Question(2, "Daytime", "Nighttime", "Both day and night","Neither",
                "When will a plant produce net C02 emissions? (section: mitochondrion)"));
        miscQ.add(new Question(3, "Chlorophyll changes based on temperature", "Chlorophyll leaches out of the leaves", "Chlorophyll is broken down and stored","Chlorophyll dissipates from the chloroplast",
                "Why do some leaves turn red, brown and yellow during autumn? (section: chloroplast)"));
    }

    //starts the test
    public void start(){
        int i = (int) num.getValue();
        System.out.println("Slider Value: " + i);
        respirationQ = new ArrayList<Question>();
        photosynthesisQ = new ArrayList<Question>();
        organelleQ = new ArrayList<Question>();
        miscQ = new ArrayList<Question>();
        questionOptions = new ArrayList<Question>();
        questions = new ArrayList<Question>();
        add();

        System.out.println(respirationOn + " " + photosynthesisOn + " " + organelleOn + " " + miscOn);
        if(respirationOn){
            questionOptions.addAll(respirationQ);
        } if(photosynthesisOn){
            questionOptions.addAll(photosynthesisQ);
        } if(organelleOn){
            questionOptions.addAll(organelleQ);
        } if(miscOn){
            questionOptions.addAll(organelleQ);
        }

        System.out.println("Question option size: " + questionOptions.size());

        if(i <= questionOptions.size())
            length = i;
        else
            length = questionOptions.size();

        int j;
        System.out.println("length of test: " + length);
        while(questions.size() <= length && questionOptions.size() != 0){
            j = (int) (Math.random() * questionOptions.size());
            questions.add(questionOptions.remove(j));
        }

        question.setText(questions.get(0).getQuestion());
        option1.setText(questions.get(0).getOption(1));
        option2.setText(questions.get(0).getOption(2));
        option3.setText(questions.get(0).getOption(3));
        option4.setText(questions.get(0).getOption(4));
        goal.setText("   Questions Remaining: " + questions.size());
    }

    //checks the answer
    public void guess(int i){
        if(questions.get(0).checkAnswer(i)){
            right++;
            if(i == 1){
                option1.setStyle("-fx-background-color:#4ff062");
            } else if(i == 2){
                option2.setStyle("-fx-background-color:#4ff062");
            } else if(i == 3){
                option3.setStyle("-fx-background-color:#4ff062");
            } else if(i == 4){
                option4.setStyle("-fx-background-color:#4ff062");
            }
        } else{
            wrong++;
            if(i == 1){
                option1.setStyle("-fx-background-color:#f05f4f");
            } else if(i == 2){
                option2.setStyle("-fx-background-color:#f05f4f");
            } else if(i == 3){
                option3.setStyle("-fx-background-color:#f05f4f");
            } else if(i == 4){
                option4.setStyle("-fx-background-color:#f05f4f");
            }
            int c = questions.get(0).getAnswerChoice();
            if(c == 1){
                option1.setStyle("-fx-background-color:#4ff062");
            } else if(c == 2){
                option2.setStyle("-fx-background-color:#4ff062");
            } else if(c == 3){
                option3.setStyle("-fx-background-color:#4ff062");
            } else if(c == 4){
                option4.setStyle("-fx-background-color:#4ff062");
            }
        }
    }

    //swaps to the next question, and updates stats. provides end statistics if the test is over
    public void nextQuestion(){
        option1.setStyle("");
        option2.setStyle("");
        option3.setStyle("");
        option4.setStyle("");
        questions.remove(0);
        if(questions.size() != 0) {
            question.setText(questions.get(0).getQuestion());
            option1.setText(questions.get(0).getOption(1));
            option2.setText(questions.get(0).getOption(2));
            option3.setText(questions.get(0).getOption(3));
            option4.setText(questions.get(0).getOption(4));
        } else if(questions.size() == 1){
            next.setText("See Results");
        } else {
            double percent = (double) right/(right + wrong) * 100;
            int persont = (int) percent;
            question.setText(persont + "%" + "correct!");
            option1.setText(right + " correct");
            option2.setText(wrong + " incorrect");
            String str = "Sections: ";
            if(respirationOn)
                str += "respiration, ";
            if(photosynthesisOn)
                str += "photosynthesis, ";
            if(organelleOn)
                str += "organelle, ";
            if(miscOn)
                str += "miscellaneous.";
            option3.setText("");
            option4.setText("");
            right = 0;
            wrong = 0;
        }
        boolean state = false;
        option1.setSelected(state);
        option2.setSelected(state);
        option3.setSelected(state);
        option4.setSelected(state);
        goal.setText("   Questions Remaining: " + questions.size());
    }

    //guess option 1
    public void one(){
        guess(1);
    }
    //guess option 2
    public void two(){
        guess(2);
    }
    //guess option 3
    public void three(){
        guess(3);
    }
    //guess option 4
    public void four(){
        guess(4);
    }
}
