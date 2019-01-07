package com.pg.fk.vector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView, mImageView5, mImageView6, mImageView7;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);
        mButton = findViewById(R.id.btnChange);
        mImageView5 = findViewById(R.id.imageView5);
        mImageView6 = findViewById(R.id.imageView6);
        mImageView7 = findViewById(R.id.imageView7);



        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageResource(R.drawable.ic_android_black_24dp);
            }
        });

        mImageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageResource(R.drawable.ic_android_black_24dp);
            }
        });

        mImageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageResource(R.drawable.ic_mood_black_24dp);
            }
        });

        mImageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageResource(R.drawable.ic_wb_sunny_black_24dp);
            }
        });
    }
}
