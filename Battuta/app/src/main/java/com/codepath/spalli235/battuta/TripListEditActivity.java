package com.codepath.spalli235.battuta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TripListEditActivity extends AppCompatActivity {

    private Button nextBtnEdit;
    private ImageButton leftBtnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list_edit);

        nextBtnEdit = findViewById(R.id.nextBtnEdit);
        leftBtnEdit = findViewById(R.id.leftBtnEdit);

        nextBtnEdit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goEditTripActivity();
            }
        });
        leftBtnEdit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goOptionsActivity();
            }
        });
    }

    private void goOptionsActivity() {
        Intent i = new Intent(this, OptionsActivity.class);
        startActivity(i);
        finish();
    }

    private void goEditTripActivity() {
        Intent i = new Intent(this, TripSummary.class);
        startActivity(i);
        finish();
    }

}
