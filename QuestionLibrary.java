package com.example.android.jeopardy;

import android.view.View;

public class QuestionLibrary {

    private String mQuestions[] = {
            "1. Who was the winner of Super Bowl LII?",
            "2. Name the starting QB for the losing team?",
            "3. Who was the MVP of Super Bowl 2018",
            "4. What City hosted the first Super Bowl",




    };


    // choices for questions
    private String mChoices[][] = {

            {"Cardinals", "Steelers", "Patriots", "Eagles"},
            {"Carson Wentz", "Tom Brady", "Tony Romo", "Nick Foles"},
            {"Dion Lewis", "Nick Foles", "LeGarrette Blount", "Chris Long"},
            {"Los Angeles, CA", "New Orleans, LA", "Green Bay, WI", "Tampa, FL"},

    };


    //correct answers as order of questions
    private String mCorrectAnswers[] = {"Eagles", "Tom Brady", "Nick Foles", "Los Angeles, CA"};


    //return question from array
    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    //return single multiple choice item for question
    //based on number of multiple choice item in list


    //returns correct answer for questions
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}

