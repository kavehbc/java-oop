package S17_inheritance;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiChoiceQuestion extends ChoiceQuestion {
    
    private ArrayList<String> answers;

    public MultiChoiceQuestion() {
        super();
        answers = new ArrayList<>();
    }

    @Override
    public void addChoice(String choice, boolean correct) {
        super.addChoice(choice, correct);
        if (correct) {
            answers.add(Integer.toString(choices.size()));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        String[] userAnswers = userAnswer.split(" ");
        
        // trimming spaces
        for (int i = 0; i < userAnswers.length; i++) {
            userAnswers[i] = userAnswers[i].trim();
        }

        // check if all user answers are correct
        for (int i = 0; i < userAnswers.length; i++) {
            if (!answers.contains(userAnswers[i])) {
                return false;
            }
        }
        // check if all correct answers are included in user answers
        for (int i = 0; i < answers.size(); i++) {
            if (!Arrays.asList(userAnswers).contains(answers.get(i))) {
                return false;
            }
        }
        return true;
    }
}

