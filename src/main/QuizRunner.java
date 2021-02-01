package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?" +
                "\nA: Bark\nB: Quack\nPlease just type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "B, C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are omnnivores?  \n True or False?", "True");
        myQuiz.addQuestion(myTrueFalseQuestion );

        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion( "Kangaroos are from which country?", "Australia");
        myQuiz.addQuestion(myShortAnswerQuestion);

        LinearScaleQuestion myLinearScaleQuestion = new LinearScaleQuestion("On a scale from 1-10 how cute are penguins?", 8, 10);
        myQuiz.addQuestion(myLinearScaleQuestion);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why animals are cool?", "Because they are.");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();
    }
}
