package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Madlib extends AppCompatActivity {
    private TextView mMadlibTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib);

        mMadlibTextView = (TextView) findViewById(R.id.madlibTextView);

        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        String noun2 = intent.getStringExtra("noun2");
        String noun3 = intent.getStringExtra("noun3");
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        mMadlibTextView.setText("The " + adjective + " " + noun3 + " and the " + noun1 + " " + verb + " the " + noun2 + ", as they do...");
    }
}
