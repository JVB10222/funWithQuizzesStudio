package main;

import java.util.ArrayList;
import java.util.Scanner;

//REQUIREMENTS:
//ADD QUESTIONS TO QUIZ
//RUN THE QUIZ
//GRADE THE QUIZ
public class Quiz {

    //class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);
    //constructor

    public Quiz() {
    }

    //methods
    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz(){
        //loop through each question
        for(Question question: questions){
            //ask the user the question
            System.out.println(question.getTheQuestion());
            //get the users answer
            String userAnswer = this.getUsersAnswers();
            //check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
            //increment numberOfQuestionsCorrect if answered correctly
            if(userGotQuestionCorrect){
                this.numberOfQuestionsCorrect++;
            }
        }

        //grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");

    }

    private String getUsersAnswers(){
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
