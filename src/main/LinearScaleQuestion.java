package main;

public class LinearScaleQuestion extends Question {

    // CLass Variable
    private int lowValue;
    private int highValue;

    public LinearScaleQuestion(String question, int lowValue, int highValue) {
        super(question, null);
        this.lowValue = lowValue;
        this.highValue = highValue;
    }
    // Getter
    public int getLowValue() { return this.lowValue; }
    public int getHighValue() { return this.highValue; }

    @Override
    public boolean checkAnswer(String answer) {
        int answerAsAnInt = Integer.parseInt(answer);
        if (answerAsAnInt >= lowValue && answerAsAnInt <= highValue) {
            return true;
        } else {
            return false;
        }

    }
}
