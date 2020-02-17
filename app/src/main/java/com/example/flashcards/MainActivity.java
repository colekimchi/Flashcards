package com.example.flashcards;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView flashcard_question;
    TextView flashcard_answer;

    //onclick for flashcard toggle
    View.OnClickListener flashcardToggleListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (flashcard_question.getVisibility() == android.view.View.VISIBLE) {
                flashcard_question.setVisibility(android.view.View.INVISIBLE);
                flashcard_answer.setVisibility(android.view.View.VISIBLE);
            } else {
                flashcard_question.setVisibility(android.view.View.VISIBLE);
                flashcard_answer.setVisibility(android.view.View.INVISIBLE);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flashcard_question = findViewById(R.id.flashcard_question);
        flashcard_answer = findViewById(R.id.flashcard_answer);

        //flashcard_question.setText(R.string.fcQ_44thPresident);
        //flashcard_answer.setText(R.string.fcA_44thPresident);

        //set onclick
        flashcard_question.setOnClickListener(flashcardToggleListener);
        flashcard_answer.setOnClickListener(flashcardToggleListener);
    }
}
