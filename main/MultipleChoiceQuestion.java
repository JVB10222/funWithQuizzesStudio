package main;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{
    //class variables

    //constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }


    //methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A" or "B"
        // answer = 'a' or 'b'
        String actualAnswer = this.getCorrectAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
}
