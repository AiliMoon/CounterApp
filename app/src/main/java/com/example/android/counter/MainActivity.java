package com.example.android.counter;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    String formatted;
    String variableKey = "counter";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button count = findViewById(R.id.button);
       // TextView counting = findViewById(R.id.textView2);
        count.setOnClickListener(v -> {
            counter++;
            formatted = String.format("%04d", counter);
            counting.setText(formatted);
        }); */
    }

    public void click(View view) {
        counter++;
        displayCounter(counter);
    }

    @SuppressLint("DefaultLocale")
    public void displayCounter(int counter) {
        TextView counting = findViewById(R.id.textView2);
        formatted = String.format("%04d", counter);
        counting.setText(formatted);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(variableKey, counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(variableKey);
        displayCounter(counter);
    }
}