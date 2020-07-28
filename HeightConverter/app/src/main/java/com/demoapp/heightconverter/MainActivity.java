package com.demoapp.heightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText feet  =(EditText) findViewById(R.id.feet);
        final EditText inches  =(EditText) findViewById(R.id.inches);
        Button btn = (Button) findViewById(R.id.btn);
        final EditText result =(EditText) findViewById(R.id.result2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double res =  30.48 *  Double.valueOf(feet.getText().toString()) +
                        2.54 * Double.valueOf(inches.getText().toString());
                result.setText(String.valueOf(res)+"cm");

            }
        });

    }
}