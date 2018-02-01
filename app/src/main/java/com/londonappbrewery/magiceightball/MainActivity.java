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

        Button ask=(Button) findViewById(R.id.askButton);
        final ImageView mgball=(ImageView) findViewById(R.id.magicball);
        final int[] ballArray={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,
                         R.drawable.ball4,R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r= new Random();
                int number= r.nextInt(5);
                mgball.setImageResource(ballArray[number]);
                Log.d("magic-8-ball","The image that displayed is "+number);
            }
        });

    }
}
