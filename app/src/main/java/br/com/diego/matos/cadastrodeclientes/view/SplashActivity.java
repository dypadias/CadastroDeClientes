package br.com.diego.matos.cadastrodeclientes.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import app.br.com.matos.cadastrodeclientes.R;
import br.com.diego.matos.cadastrodeclientes.view.ui.login.LoginActivity;

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

                Intent trocarTela = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(trocarTela);
                finish();

            }
        }, tempoDeEspera);
    }
}