package com.example.todo_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class todo_detail extends AppCompatActivity {

    private TextView textView;
    private String[] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_detail);
        textView=findViewById(R.id.details);

        Resources res = getResources();
        description = res.getStringArray(R.array.details);

        int currentIndex = getIntent().getIntExtra(MainActivity.TODO_INDEX, 0);
        textView = findViewById(R.id.details);
        textView.setText(description[currentIndex]);

    }
}
