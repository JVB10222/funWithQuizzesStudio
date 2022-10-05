package main;

public class CheckboxQuestion extends Question{

    //class variables


    //constructors
    public CheckboxQuestion(String question,String answer){
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer){
        // answer =  "A,B,C"
        //answer = 'a,b,c'
        String actualAnswer = this.getCorrectAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        }else {
            return false;
        }
    }
}
