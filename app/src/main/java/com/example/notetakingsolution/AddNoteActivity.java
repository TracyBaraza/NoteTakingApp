package com.example.notetakingsolution;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddNoteActivity extends AppCompatActivity {
EditText etTitle;
EditText etNote;
Button btnADDPHOTO;
Button btnADDVOICENOTE;
Button btnSAVE;
String note;
String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        etTitle=findViewById(R.id.etTitle);
        etNote=findViewById(R.id.etNote);
        btnADDPHOTO=findViewById(R.id.btnAddPhoto);
        btnADDVOICENOTE=findViewById(R.id.btnAddVoiceNote);
        btnSAVE=findViewById(R.id.btnSave);





        btnSAVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                note = etNote.getText().toString();
                title = etTitle.getText().toString();
            }






            });

    }

}
