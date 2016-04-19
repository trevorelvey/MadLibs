package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mCreateMadlibButton;
    private EditText mEditNoun1;
    private EditText mEditNoun2;
    private EditText mEditNoun3;
    private EditText mEditAdjective;
    private EditText mEditVerb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditNoun1 = (EditText) findViewById(R.id.editNoun1);
        mEditNoun2 = (EditText) findViewById(R.id.editNoun2);
        mEditNoun3 = (EditText) findViewById(R.id.editNoun3);
        mEditAdjective = (EditText) findViewById(R.id.editAdjective);
        mEditVerb = (EditText) findViewById(R.id.editVerb);
        mCreateMadlibButton = (Button) findViewById(R.id.createMadlibButton);
            mCreateMadlibButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    String noun1 = mEditNoun1.getText().toString();
                    String noun2 = mEditNoun2.getText().toString();
                    String noun3 = mEditNoun3.getText().toString();
                    String verb = mEditVerb.getText().toString();
                    String adjective = mEditAdjective.getText().toString();
                    Log.d(TAG, noun1);
                    Log.d(TAG, noun2);
                    Log.d(TAG, noun3);
                    Log.d(TAG, verb);
                    Log.d(TAG, adjective);
                    Intent intent = new Intent(MainActivity.this, Madlib.class);
                    startActivity(intent);
                }
            });
    }
}
