package com.example.nomecompleto;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        textViewResult = findViewById(R.id.textViewResult);

        // Recebe o resultado da MainActivity
        Intent intent = getIntent();
        String result = intent.getStringExtra("RESULT" );

        // Exibe o resultado
        textViewResult.setText("NomeCompleto " + result);
    }
}