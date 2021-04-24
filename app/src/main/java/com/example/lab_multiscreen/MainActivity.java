package com.example.lab_multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText eName;
    private EditText eNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.eName = this.findViewById(R.id.etName);
        this.eNumber = this.findViewById(R.id.etNumber);
    }

    public void onNextScreenButtonClicked(View v)
    {
        String name = eName.getText().toString().trim();
        String age = eNumber.getText().toString().trim();
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        bundle.putString("number", age);
        Intent intent = new Intent(MainActivity.this, Screen2.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}