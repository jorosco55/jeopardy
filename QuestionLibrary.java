package com.example.android.jeopardy;

import android.view.View;

public class QuestionLibrary {

    private String mQuestions[] = {
            "Who was the winner of Super Bowl LII?",
            "Who was the Starting Quarterback for the losing team?",
            "Who was the MVP of Super Bowl 2018",
            "What City hosted the first Super Bowl played",
    };

    private String mChoices [][] = {

            {"Cardinals","Steelers","Patriots","Eagles"},
            {"Carson Wentz", "Tom Brady", "Tony Romo","Nick Foles"},
            {"Dion Lewis", "Nick Foles", "LeGarrette Blount", "Chris Long"},
            {"Los Angeles, CA", "New Orleans, LA", "Green Bay, WI", "Tampa, FL" },
    };

    private String mCorrectAnswers[] = {"Eagles", "Tom Brady", "Nick Foles", "Los Angeles, CA"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

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

    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}

