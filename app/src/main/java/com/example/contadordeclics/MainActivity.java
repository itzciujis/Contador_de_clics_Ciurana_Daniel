package com.example.contadordeclics;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;
    private TextView tvContador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContador = findViewById(R.id.textView);
        Button btnPulsar = findViewById(R.id.btnPulsar);
        Button btnReiniciar = findViewById(R.id.btnPulsar2);

        btnPulsar.setOnClickListener(v ->{
            contador++;
            tvContador.setText(String.valueOf(contador));
        });
        btnReiniciar.setOnClickListener(v -> {
            contador = 0;
            tvContador.setText("0");
        });

        if (savedInstanceState != null){
            contador=savedInstanceState.getInt(KEY_CONTADOR, 0);
        }
        tvContador.setText(String.valueOf(contador));
    }
    private static final String KEY_CONTADOR = "contador";
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_CONTADOR, contador);
    }
}