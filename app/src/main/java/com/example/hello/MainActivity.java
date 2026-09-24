package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextViewHello;
    private EditText EditTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewHello = findViewById(R.id.textView);
        EditTextName = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (EditTextName.getText().length() == 0) {
            TextViewHello.setText("Здравствуй!");
        } else {
            TextViewHello.setText("Привет, " + EditTextName.getText());
        }
    }
}