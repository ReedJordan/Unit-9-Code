package question_demo;

/**
 * Covers inheritance hierarchies and implementing subclasses
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");
        first.display();
        System.out.println("Your answer: ");
        String response = in.nextLine();
        System.out.println(first.checkAnswer(response));

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("What was the original name of the Java language?");
        second.addChoice("*7", false);
        second.addChoice("Duke", false);
        second.addChoice("Oak", true);
        second.addChoice("Gosling", false);

        ChoiceQuestion third = new ChoiceQuestion();
        third.setText("In which country was the inventor of Java born?");
        third.addChoice("Australia", false);
        third.addChoice("Canada", true);
        third.addChoice("Denmark", false);
        third.addChoice("United States", false);
        presentQuestion(second);
        presentQuestion(third);
    }
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.println("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}