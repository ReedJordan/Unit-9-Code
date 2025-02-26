package question_demo;

public class Question {
    private String text;
    private String answer;

    // make a constructor that creates an empty question with an empty answer
    public Question(){
        text = "";
        answer = "";
    }

    /**
     * Checks a response for correctness
     * @param response the response to check
     * @return true if response was correct, false otherwise
     */
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }

    /**
     * Sets the question text
     * @param questionText
     */
    public void setText(String questionText){
        //complete this
        text = questionText;
    }

    /**
     * Sets the answer for the question
     * @param correctResponse
     */
    public void setAnswer(String correctResponse){
        //complete this
        answer = correctResponse;
    }

    /**
     * Displays the question
     */
    public void display(){
        System.out.println(text);
    }

}
