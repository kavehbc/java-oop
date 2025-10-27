package S17_inheritance;

public class Question {
    private String text;
    private String answer;

    public Question() {
        this.text = "";
        this.answer = "";
    }

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public void display() {
        System.out.println("Question: " + text);
    }

    public void setText(String text) {
        this.text = text;
    }   

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String userAnswer) {
        return this.answer.equalsIgnoreCase(userAnswer);
    }

}