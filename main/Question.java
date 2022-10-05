package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Question {
    //class variables
    private final String theQuestion;
    private final String correctAnswer;

    //constructors
    public Question(String question, String answer){
        this.theQuestion = question;
        this.correctAnswer = answer;
    }

    //methods
    //getters

    public String getTheQuestion() {
        return this.theQuestion;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public abstract boolean checkAnswer(String answer);
//    private ArrayList<String> options;
//
//
//    private String userAnswer;

//    public void addOption(String option){
//        this.options.add(option);
//    }
//
//    public ArrayList<String> getOptions() {
//        return options;
//    }
//
//    abstract void gradeUserAnswer();
}
