package com.example.android.jeopardy;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;        //view for current total score
    private TextView mQuestionView;     //current question to answer
    private Button mButtonChoice1;      //multiple choice 1 for mQuestionView
    private Button mButtonChoice2;      //multiple choice 2 for mQuestionView
    private Button mButtonChoice3;      //multiple choice 3 for mQuestionView
    private Button mButtonChoice4;      //multiple choice 4 for mQuestionView



    private String mAnswer;  //correct answer for question in mQuestion
    private int mScore = 0;  // Current total score
    private int mQuestionNumber = 0;  //current question number



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);


        updateQuestion();



        //Start Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Button goes in here
                if(mButtonChoice1.getText()== mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //Line for Toast
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(MainActivity.this, "Try Again!", Toast.LENGTH_SHORT).show();

                }
            }

        });
            //End of Button Listener for Button1

        //Start Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Button goes in here
                if(mButtonChoice2.getText()== mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //Line for Toast
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Try Again!", Toast.LENGTH_SHORT).show();

                }
            }

        });
        //End of Button Listener for Button2

        //Start Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Button goes in here
                if(mButtonChoice3.getText()== mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //Line for Toast
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Try Again!", Toast.LENGTH_SHORT).show();

                }
            }

        });
        //End of Button Listener for Button3

        //Start Button Listener for Button4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Button goes in here
                if(mButtonChoice4.getText()== mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //Line for Toast
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Try Again!", Toast.LENGTH_SHORT).show();

                }
            }

        });
        //End of Button Listener for Button4


    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }



    public void reset(View view) {

        // reset quiz
        Intent resetActivity = getIntent();
        finish();
        startActivity(resetActivity);
    }
}

