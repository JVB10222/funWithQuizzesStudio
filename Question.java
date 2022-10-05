import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Question {
    private ArrayList<String> options;

    private String correctAnswer;

    private String userAnswer;

    public void addOption(String option){
        this.options.add(option);
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    abstract void gradeUserAnswer();
}
