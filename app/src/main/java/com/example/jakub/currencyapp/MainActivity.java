package com.example.jakub.currencyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mainField, euroField, gbpField, plnField, usdField;
    private SeekBar seekbarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbarMain = findViewById(R.id.seekBar);
        mainField = findViewById(R.id.textView);
        euroField = findViewById(R.id.euroText);
        gbpField = findViewById(R.id.gbpText);
        plnField = findViewById(R.id.plnText);
        usdField = findViewById(R.id.usdText);



        SeekBar.OnSeekBarChangeListener listenerSeekBar = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mainField.setText(String.valueOf(i));

                euroField.setText(String.valueOf(i*4.3)+"euro");
                gbpField.setText(String.valueOf(i*5)+"GBP");
                plnField.setText(String.valueOf(i)+"PLN");
                usdField.setText(String.valueOf(i*2.8)+"USD");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };
        seekbarMain.setOnSeekBarChangeListener(listenerSeekBar);
    }
}
