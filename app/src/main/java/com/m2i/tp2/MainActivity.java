package com.m2i.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Random random = new Random(); // class random => generer nombres aleatoires ...
    TextView nbr1_txt, nbr2_txt;
    Button resp1_btn, resp2_btn, resp3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}