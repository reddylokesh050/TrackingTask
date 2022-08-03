package com.example.trackingtask;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button button2;
    public Button button5;
    public TextView textView6;
    public TextView textView7;
    public ProgressBar progressBar;
    public ProgressBar progressBar2;
    public ImageButton imageButton2;
    public SeekBar seekBar3;
    public SeekBar seekBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        Button button5 = (Button) findViewById(R.id.button5);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        SeekBar seekBar3 =(SeekBar) findViewById(R.id.seekBar3);
        SeekBar seekBar4 =(SeekBar) findViewById(R.id.seekBar4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ads.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ads.class);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AT.class);
                startActivity(intent);
                seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        progressBar2.setProgress(i);
                        textView7.setText(""+i);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });
                seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                        progressBar.setProgress(progress);
                        textView6.setText("" + progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }


                });

            }
        });
    }
}


