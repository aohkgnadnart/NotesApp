package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNoteActivity extends AppCompatActivity {

    EditText title_input, detail_input;
    Button add_note_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        title_input = findViewById(R.id.note_title_input);
        detail_input = findViewById(R.id.note_detail_input);
        add_note_button = findViewById(R.id.add_note_button);
        add_note_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddNoteActivity.this);
                Log.d("readdb", "ok");
                String title = title_input.getText().toString().trim();
                String detail = detail_input.getText().toString().trim();
                if(title.isEmpty()) {
                    title_input.setError("Please enter a title");
                }
                else if(detail.isEmpty()) {
                    detail_input.setError("Please enter a detail");
                }
                else myDB.addBook(title, detail);
            }
        });
    }
}