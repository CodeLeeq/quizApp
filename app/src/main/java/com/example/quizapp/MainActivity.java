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
        boolean questionOneAns = answerOneA.isChecked();
        score += 1;

        CheckBox answerTwoA = findViewById(R.id.qstTwoA);
        boolean questionTwoAns = answerTwoA.isChecked();

        CheckBox answerTwoB = findViewById(R.id.qstTwoB);
        boolean questionTwoAnsB = answerTwoB.isChecked();

        TextView qst3Field = findViewById(R.id.qst3_tv);
        String answer3 = qst3Field.getText().toString();


        Toast.makeText(this,name + "\n You score is" + score, Toast.LENGTH_LONG).show();
    }
}