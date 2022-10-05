package main;

import javax.swing.plaf.BorderUIResource;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What sound does a cat make?\nA: Bark\nB:Meow\nC:Moo\nPlease just type a single letter as an answer", "B");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckboxQuestion myCheckBoxQuestion = new CheckboxQuestion("Select all that apply, what sea critters swim?\nA: Sharks\nB: Eels\nC: Crabs", "A,B");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("An Apple falls far from the tree", "false");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}
