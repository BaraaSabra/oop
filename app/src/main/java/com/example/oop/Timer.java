package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer2);

//      int  secondsRemaining = 0;
//
//        plusButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                secondsRemaining++;
//                updateGreenTextView();
//            }
//        });
//
//        minusButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (secondsRemaining > 0) {
//                    secondsRemaining--;
//                    updateGreenTextView();
//                }
//            }
//        });
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startCountdown();
//            }
//        });
//    }
//
//    private void startCountdown() {
//        countDownTimer = new CountDownTimer(secondsRemaining * 1000, 1000) {
//            public void onTick(long millisUntilFinished) {
//                secondsRemaining--;
//                updateRedTextView();
//                progressBar.setProgress(secondsRemaining);
//            }
//
//            public void onFinish() {
//                // Close the app
//                finish();
//            }
//        }.start();
//    }
//
//    private void updateGreenTextView() {
//        greenTextView.setText(String.valueOf(secondsRemaining));
//    }
//
//    private void updateRedTextView() {
//        redTextView.setText(String.valueOf(secondsRemaining));
//    }
    }

}