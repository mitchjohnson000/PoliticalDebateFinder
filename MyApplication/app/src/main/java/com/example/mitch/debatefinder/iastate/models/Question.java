package com.example.mitch.debatefinder.iastate.models;

import java.util.ArrayList;

/**
 * Created by nate on 3/8/17.
 */

public class Question {
    String[] answers;
    String questionText = "";
    boolean agree;

    public Question(String[] answers){
        this.answers = answers;
    }
    public void setAgree(Boolean bool){
        this.agree = bool;
    }

    public ArrayList<Question> getQuestions(){

        String[] answers = {"Agree", "Disagree"};

        ArrayList<Question> questions = new ArrayList<>();

        Question toBeAdded = new Question(answers);

        toBeAdded.questionText = "The best way to improve the economy is to decrease government control.";

        questions.add(toBeAdded);

        toBeAdded.questionText = "Taxes should be raised to make sure that the government has enough revenue.";

        questions.add(toBeAdded);

        toBeAdded.questionText = "The economic gains of hyrdofracking offset the risks of environmental degradation.";

        questions.add(toBeAdded);

        toBeAdded.questionText = "The rich should pay a higher tax rate than the middle class";

        questions.add(toBeAdded);

        return questions;
    }
}
