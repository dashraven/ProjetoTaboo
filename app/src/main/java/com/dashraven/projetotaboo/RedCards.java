package com.dashraven.projetotaboo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import java.util.concurrent.ThreadLocalRandom;


public class RedCards extends CursorAdapter {

    public RedCards(Context context, Cursor c, int flags) {
        super(context, c, 0);
    }

    // The newView method is used to inflate a new view and return it,
    // you don't bind any data to the view at this point.
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.redcards, parent, false);
    }

    // The bindView method is used to bind all data to a given view
    // such as setting the text on a TextView.
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find fields to populate in inflated template
        TextView palavraSecreta = (TextView) view.findViewById(R.id.palavrasecreta);
        TextView palavraProibida1 = (TextView) view.findViewById(R.id.palavraproibida1);
        TextView palavraProibida2 = (TextView) view.findViewById(R.id.palavraproibida2);
        TextView palavraProibida3 = (TextView) view.findViewById(R.id.palavraproibida3);
        TextView palavraProibida4 = (TextView) view.findViewById(R.id.palavraproibida4);
        TextView palavraProibida5 = (TextView) view.findViewById(R.id.palavraproibida5);
        // Extract properties from cursor
        String palavrasecreta = cursor.getString(cursor.getColumnIndexOrThrow("palavrasecreta"));
        String palavraproibida1 = cursor.getString(cursor.getColumnIndexOrThrow("palavraproibida1"));
        String palavraproibida2 = cursor.getString(cursor.getColumnIndexOrThrow("palavraproibida2"));
        String palavraproibida3 = cursor.getString(cursor.getColumnIndexOrThrow("palavraproibida3"));
        String palavraproibida4 = cursor.getString(cursor.getColumnIndexOrThrow("palavraproibida4"));
        String palavraproibida5 = cursor.getString(cursor.getColumnIndexOrThrow("palavraproibida5"));

        // Populate fields with extracted properties
        palavraSecreta.setText(palavrasecreta);
        palavraProibida1.setText(palavrasecreta);
        palavraProibida2.setText(palavrasecreta);
        palavraProibida3.setText(palavrasecreta);
        palavraProibida4.setText(palavrasecreta);
        palavraProibida5.setText(palavrasecreta);
    }


    //Bundle bundle = getIntent().getExtras();
    //int PlayCardIdRed = bundle.getInt("PlayCardId",PlayCardId);

    int PlayCardId = ThreadLocalRandom.current().nextInt(1, 50 + 1);
    // TodoDatabaseHandler is a SQLiteOpenHelper class connecting to SQLite
    //DataBaseHelper query = new DataBaseHelper(this);
    //SQLiteDatabase db = query.getReadableDatabase();
    //
    //Cursor cursor = db.rawQuery("SELECT  * FROM redcards WHERE id=" + PlayCardId , null);
}