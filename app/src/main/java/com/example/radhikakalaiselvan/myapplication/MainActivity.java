package com.example.radhikakalaiselvan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clickButton;
    Button resetButton;
    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton= (Button)findViewById(R.id.buttonCount);
        resetButton=(Button)findViewById(R.id.button2);
        count=(TextView)findViewById(R.id.textViewCount);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue=count.getText().toString();
int c=Integer.parseInt(countValue);
                c++;
                count.setText(String.valueOf(c));

            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.setText(String.valueOf(0));
            }
        });
    }
}
