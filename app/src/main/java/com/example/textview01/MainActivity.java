package com.example.textview01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int x;
    ImageView iv1;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = findViewById(R.id.iv);
    }

    public void dodge(View view) {
        x=rnd.nextInt(3)+1;
        btn.setText("" + x);
        if (x==1)
        {
            iv1.setImageResource(R.drawable.dog);
        }
    }
}