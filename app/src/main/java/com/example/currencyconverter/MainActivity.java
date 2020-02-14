package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void converter (View view)
    {
        EditText amount = (EditText) findViewById(R.id.editText);
        double amt = Double.parseDouble(amount.getText().toString());
        double rs = amt*71.03;
        String dollar = Double.toString(rs);
        Toast.makeText(this, "$ " + amount.getText().toString() + " in Rs. is " +dollar, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
