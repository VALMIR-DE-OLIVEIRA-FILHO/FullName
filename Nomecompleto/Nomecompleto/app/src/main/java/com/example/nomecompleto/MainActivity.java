package com.example.nomecompleto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome, editTextSobrenome;
    Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextTextPersonName);
        editTextSobrenome = findViewById(R.id.editTextTextPersonName2);
        btnstart=findViewById(R.id.buttonStart);
        btnstart.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String text1 = editTextNome.getText().toString();
                String text2 = editTextSobrenome.getText().toString();

                String result = text1 + text2;
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("RESULT", result);
                startActivity(intent);



            }
        });
    }

}