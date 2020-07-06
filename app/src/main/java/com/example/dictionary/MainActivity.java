package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView idtextView, englishtextView, arabictextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dictionary.copyDictionary(this);

        idtextView = findViewById(R.id.id_textView);
        englishtextView = findViewById(R.id.english_textView);
        arabictextView = findViewById(R.id.arabic_textView);

    }

    public void changeID(View view) {
    }
}
