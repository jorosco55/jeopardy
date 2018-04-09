package com.example.android.jeopardy;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore =0;
    private int mQuestionNumber = 0;

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

        //start of button listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //my logic for Button here
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //This line of code is options
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                }
            }

        });

        //End of Buttion Listener for Button1

        //Start of Button Listener for Button2

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //my logic for Button here
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //This line of code to inform if answer is correct or not by toasting a message
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                }
            }

        });

        //End of Button Listener for Button 2

        //Start of Button Listener 3

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //my logic for Button here
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //This line of code to inform if answer is correct or not by toasting a message
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                }
            }

        });
        //End of Button Listener 3

        //Start of Button Listener 4

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //my logic for Button here
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //This line of code to inform if answer is correct or not by toasting a message
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

    //This method to enter contestants name

    public void nameField(View view) {
        //Fill in Name Field
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
    }


    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber ++;
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}



