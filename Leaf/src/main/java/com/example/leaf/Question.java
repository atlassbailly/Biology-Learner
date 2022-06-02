package com.example.leaf;

//a question for the test class, with an answer and options
public class Question {

    private int answerChoice;
    private String optionOne, optionTwo, optionThree, optionFour, question;

    //returns the correct answer choice
    public int getAnswerChoice() {
        return answerChoice;
    }

    //returns an option
    public String getOption(int i){
        if(i == 1){
            return optionOne;
        } else if(i == 2){
            return optionTwo;
        } else if(i == 3){
            return optionThree;
        } else if(i == 4){
            return optionFour;
        }
        return "";
    }

    //returns the question
    public String getQuestion(){
        return question;
    }

    //checks the answer, true for correct false for incorrect
    public boolean checkAnswer(int i){
        return i == answerChoice;
    }

    //constructs a question, keeping the answer choices and track of the correct answer
    public Question(int i, String one, String two, String three, String four, String question){
        answerChoice = i;
        optionOne = one;
        optionTwo = two;
        optionThree = three;
        optionFour = four;
        this.question = question;
    }
}
