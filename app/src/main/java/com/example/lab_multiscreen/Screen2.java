package com.example.lab_multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            String name = bundle.getString("name");
            String age = bundle.getString("number");
            TextView tvName = findViewById(R.id.tvName);
            TextView tvAge = findViewById(R.id.tvNumber);
            tvName.setText(name);
            tvAge.setText(age);
        }

    }

    public void onNextScreenPressed(View v)
    {
        Intent i = new Intent(this,Screen3.class);
        this.startActivity(i);
    }
}