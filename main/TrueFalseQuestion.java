package main;

public class TrueFalseQuestion extends Question{
    //class variables


    //constructors
    public TrueFalseQuestion(String question,String answer){
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer){
        // answer =  "true" "false"
        //answer = 'TRUE' 'FALSE'
        if(answer.toLowerCase().equals(this.getCorrectAnswer().toLowerCase())){
            return true;
        }else{
            return false;
        }

    }
}
