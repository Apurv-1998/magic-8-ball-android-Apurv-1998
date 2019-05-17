package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;
        askbutton=findViewById(R.id.button);
        final ImageView ball = findViewById(R.id.ballimage);

        final int[] imagearray = {R.drawable.ball1_2x,
        R.drawable.ball2_2x,
        R.drawable.ball3_2x,
        R.drawable.ball4_2x,
        R.drawable.ball5_2x};

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magic-8-ball","Asked");

                Random R = new Random();
                int n = R.nextInt(5);
                Log.d("mag-8-ball","Number generated"+n);

                ball.setImageResource(imagearray[n]);
            }
        });
    }
}
