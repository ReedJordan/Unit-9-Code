package question_demo;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {

    // this instance variable is added to the subclass
    private ArrayList<String> choices;

    public ChoiceQuestion(){
        choices = new ArrayList<String>();
    }

    //method added to subclass
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            //convert choices.size() to a string
            String choiceString = ""+choices.size();
            setAnswer(choiceString);
        }

    }

    // overrides super class
    public void display(){

    }
}
