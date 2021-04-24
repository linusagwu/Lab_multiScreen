package com.example.lab_multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText eName;
    private EditText ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.eName = this.findViewById(R.id.etName);
        this.ePassword = this.findViewById(R.id.etNumber);
    }

    public void onNextScreenButtonClicked(View v)
    {
        Intent i = new Intent(this,Screen2.class);
        i.putExtra("name","mike");
        this.startActivity(i);
        //String num = this.inputTV.getText().toString();
        //int inputTV = Integer.parseInt(num);

        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
       // MySingleton.fac = inputTV;
       // this.startActivity(i);
    }
}