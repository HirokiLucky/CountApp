package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonUp = (Button) this.findViewById(R.id.countUp_button);
        Button buttonDown = (Button) this.findViewById(R.id.countDown_button);
        TextView textView = (TextView) this.findViewById(R.id.count_text);
        buttonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "ボタンが押されました", Snackbar.LENGTH_SHORT).show();
                count++;
                textView.setText((String.valueOf(count)));
            }
        });

        buttonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "ボタンが押されました", Snackbar.LENGTH_SHORT).show();
                count--;
                textView.setText((String.valueOf(count)));
            }
        });
    }
}