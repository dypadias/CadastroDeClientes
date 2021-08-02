package br.com.diego.matos.cadastrodeclientes.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import app.br.com.matos.cadastrodeclientes.R;

public class SplashActivity extends AppCompatActivity {

    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        trocarTela();
    }
    private void trocarTela() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent trocarTela = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(trocarTela);
                finish();

            }
        }, tempoDeEspera);
    }
}