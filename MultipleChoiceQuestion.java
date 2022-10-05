import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{

    public MultipleChoiceQuestion(ArrayList<String> options) {
        for(String option : options){
            this.addOption(option);
        }
    }
}
