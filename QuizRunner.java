public class QuizRunner {
    public static void main(String[] args) {
        //Create the quiz
        Quiz quiz = new Quiz();

        MultipleChoiceQuestion multiChoiceQuestion = new MultipleChoiceQuestion();
        quiz.addQuestion(multiChoiceQuestion);

        CheckboxQuestion checkboxQuestion = new CheckboxQuestion();
        quiz.addQuestion(checkboxQuestion);

        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion();
        quiz.addQuestion(trueFalseQuestion);
        //        Ask all of the questions in a given Quiz
        for(Question question: quiz.getQuestions()){
            //        Prompt the user for answers
            question.ask();

        }


        //        Grade the user’s answers
        quiz.grade();
    }
}
