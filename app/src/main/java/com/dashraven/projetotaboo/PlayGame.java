
package com.dashraven.projetotaboo;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;
import java.io.IOException;
import java.util.ArrayList;

public class PlayGame extends AppCompatActivity {

    public static ArrayList<UsedRedCards> UsedRedCards = new ArrayList<>();
    public static ArrayList<UsedBlueCards> UsedBlueCards = new ArrayList<>();
    public static ArrayList<UsedGreenCards> UsedGreenCards = new ArrayList<>();
    public static ArrayList<UsedYellowCards> UsedYellowCards = new ArrayList<>();
    public static ArrayList<LastCards> LastCards = new ArrayList<>();
    public static Array PlayCards = new Array (1, 2, 3, 4);

    public int PlayCardId;
    public static int newCardColor;
    public static int RedCard;
    public static int BlueCard;
    public static int GreenCard;
    public static int YellowCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        DataBaseHelper myDbHelper = new DataBaseHelper();
        myDbHelper = new DataBaseHelper(this);
        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }
        try {
            myDbHelper.openDataBase();
        }catch(SQLException sqle){
            throw sqle;
        }


    int PlayCardId = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        int newCardColor = (int) Math.floor(Math.random() * PlayCards.getLength()-1);



        if (newCardColor=1) {
        if (UsedRedCards != null && RedCard != UsedRedCards.size()-1) {
            UsedRedCards.add(RedCard);
            };
            Intent redcard = new Intent (PlayGame.this, RedCards.class);
            redcard.putExtra("PlaycardId",PlayCardId);
            startActivity(redcard);
            finish();
        };



        /*if (newCardColor=2) {
            BlueCard = new BlueCard;
        if (UsedBlueCards != null && BlueCard != UsedBlueCards..size()-1) {
            SQLite query
            UsedBlueCards.add(BlueCard);
            };
            Intent bluecard = new Intent (PlayGame.this, BlueCard.class)
            startActivity(bluecard);
            finish();
        };



        if (newCardColor=3) {
            GreenCard = new GreenCard;
         if (UsedGreenCards != null && GreenCard != UsedGreenCard.size()-1) {
            SQLite query
            UsedGreenCards.add(Greencard);
            };
            Intent greencard = new Intent (PlayGame.this, GreenCard.class)
            startActivity(Greencard);
            finish();
        };



        if (newCardColor=4) {
            YellowCard = new YellowCard;
         if (UsedYellowCards != null && YellowCard != UsedYellowCard..size()-1) {
            SQLite query
            UsedYellowCards.add(YellowCard);
            };
            Intent yellowcard = new Intent (PlayGame.this, YellowCard.class)
            startActivity(yellowcard);
            finish();
         };
*/

        }


    }


