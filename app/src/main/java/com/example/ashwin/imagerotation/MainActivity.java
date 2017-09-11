package com.example.ashwin.imagerotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private Button mClockButton, mAntiClockButton;
    private int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mImageView = (ImageView) findViewById(R.id.imageView);

        mClockButton = (Button) findViewById(R.id.clockButton);
        mClockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClockwise();
            }
        });

        mAntiClockButton = (Button) findViewById(R.id.antiClockButton);
        mAntiClockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateAntiClockwise();
            }
        });
    }

    private void rotateClockwise() {
        mCounter = (++mCounter);
        mImageView.animate().rotation(mCounter*90).setInterpolator(new LinearInterpolator()).setDuration(500);
    }

    private void rotateAntiClockwise() {
        mCounter = (--mCounter);
        mImageView.animate().rotation(mCounter*90).setInterpolator(new LinearInterpolator()).setDuration(500);
    }
}
