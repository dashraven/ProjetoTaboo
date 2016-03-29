package com.dashraven.projetotaboo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class GameSetupActivity extends AppCompatActivity {

    EditText nome_equipa1;
    EditText nome_equipa2;
    Button startGameBtn;

    public static Equipa equipa1;
    public static Equipa equipa2;

    public static ArrayList equipas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_setup);

        nome_equipa1 = (EditText) findViewById(R.id.nome_da_equipa1);
        nome_equipa2 = (EditText) findViewById(R.id.nome_da_equipa2);

        startGameBtn = (Button) findViewById(R.id.startGame);

        equipa1 = null;
        equipa2 = null;

        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equipa1 != null) {
                    equipa1 = new Equipa(nome_equipa1.getText().toString());
                    equipas.add(equipa1);
                }
                if (equipa2 != null) {
                    equipa2 = new Equipa(nome_equipa2.getText().toString());
                    equipas.add(equipa2);
                }
                if (equipas.size() !=0 && equipas.size()>1 ) {
                    Toast.makeText(GameSetupActivity.this, "Só é possivel jogar depois de configurar as duas equipas! Verifique novamente", Toast.LENGTH_LONG).show();
                } else {
                    Intent playgame = new Intent(GameSetupActivity.this, PlayGame.class);
                    startActivity(playgame);
                    finish();
                }
            }
        });
    }
}
