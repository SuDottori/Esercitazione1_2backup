package com.example.esercitazione12backup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.esercitazione12backup.R;

public class MainActivity extends AppCompatActivity {
    Button incremento, decremento, somma, sottrazione, reset;
    EditText input;
    //SeekBar seekbar;
    int minValue = 0;
    int maxValue = 100;
    int modelValue = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incremento = findViewById(R.id.incremento);
        decremento = findViewById(R.id.decremento);
        input = findViewById(R.id.input);
        somma = findViewById(R.id.somma);
        sottrazione = findViewById(R.id.sottrazione);
        reset = findViewById(R.id.reset);
        //seekbar = findViewById(R.id.seekbar);


        updateValue(modelValue);

        incremento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input.setText("+1");
                updateValue(++modelValue);
            }
        });
        decremento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input.setText("-1");
                updateValue(--modelValue);
            }
        });
        somma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input.setText("-1");
                updateValue(modelValue + 5);
            }
        });
        sottrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input.setText("-1");
                updateValue(modelValue - 5);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateValue(0);
            }
        });
        /*
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateValue(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                updateValue(seekBar.getProgress());

            }
        });*/
    }

    protected void updateValue(int newValue) {
        newValue = newValue > maxValue ? maxValue : newValue;
        newValue = newValue < minValue ? minValue : newValue;
        this.modelValue = newValue;
        input.setText("" + this.modelValue);
    }
}


