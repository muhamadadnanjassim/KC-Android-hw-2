package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Name = findViewById(R.id.Name);
        EditText Age = findViewById(R.id.Age);
        EditText job = findViewById(R.id.JOB);
        EditText Phone = findViewById(R.id.PHONE);
        EditText Email = findViewById(R.id.Emeil);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                String I1 = Name.getText().toString();
                String I3 = job.getText().toString();

                String I22 = Age.getText().toString();
                String I44 = Phone.getText().toString();


                String I5 = Email.getText().toString();

                intent.putExtra("Name", I1);
                intent.putExtra("Age",I22);
                intent.putExtra("job",I3);
                intent.putExtra("Phone",I44);
                intent.putExtra("Email",I5);
                startActivity(intent);
            }
        });

    }
}