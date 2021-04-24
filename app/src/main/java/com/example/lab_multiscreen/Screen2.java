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

        TextView nameTV = this.findViewById(R.id.nameTV3);
        Intent myIntent = this.getIntent();
        String name = myIntent.getStringExtra("name");
        nameTV.setText(name);
    }

    public void onNextScreenPressed(View v)
    {
        Intent i = new Intent(this,Screen3.class);
        this.startActivity(i);
    }
}