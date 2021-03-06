package com.dashraven.projetotaboo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button newGameBtn;
    private Button rulesBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newGameBtn = (Button) findViewById(R.id.newGameBtn);
        newGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupNewGame();
            }
        });


        Button rulesBtn = (Button) findViewById(R.id.rulesBtn);
        rulesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seeRules();
            }
        });

    }
    private void setupNewGame() {
        Intent setupGame = new Intent(this, GameSetupActivity.class);
        startActivity(setupGame);
        finish();
    }

    private void seeRules() {
        Intent rules = new Intent(this, Rules.class);
        startActivity(rules);
        finish();
    }
}


