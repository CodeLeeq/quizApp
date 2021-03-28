package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void displayAnswer(View view) {
        /*Get the name from the user*/
        EditText nameField = findViewById(R.id.editTextName);
        String name = nameField.getText().toString();

        /*Radio button for question 1r*/
        RadioButton answerOneA = findViewById(R.id.qstOneA);
        if (answerOneA.isChecked()) {
            score += 1;
        }

        /*Checkbox for question 2 having an if statement check*/
        CheckBox answerTwoA = findViewById(R.id.qstTwoA);
        CheckBox answerTwoB = findViewById(R.id.qstTwoB);
        if (answerTwoA.isChecked() && answerTwoB.isChecked()) {
            score += 1;
        }

        /*This check the editText area for the name specify*/
        TextView qst3Field = findViewById(R.id.qstThreeAnswer);
        if (qst3Field.getText().toString().equals("Buccaneers")) {
            score += 1;
        }


        /*Radio button for question 4 answer*/
        RadioButton answerFour = findViewById(R.id.qstFourB);
        if (answerFour.isChecked()) {
            score += 1;
        }

        /*A toast displaying the Name of the user and the score.*/
        Toast.makeText(this, name + "\n You total score is " + score, Toast.LENGTH_LONG).show();
    }
}