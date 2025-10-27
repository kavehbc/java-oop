package S17_inheritance;
import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    
    protected ArrayList<String> choices;

    public ChoiceQuestion() {
        super(); // calling the constructor of the parent class: public Question()
        choices = new ArrayList<>();
    }

    public ChoiceQuestion(String text, String answer) {
        super(text, answer); // calling the constructor of the parent class: public Question(String text, String answer)
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            setAnswer(Integer.toString(choices.size())); // setting the answer to the index (1-based) of the correct choice
        }
    }

    @Override // this overrides the display method of the parent class Question
    public void display() {
        super.display(); // runs the display method of the parent class of Question: public void display()
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
    }

}