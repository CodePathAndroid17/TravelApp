package com.codepath.spalli235.battuta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TripListActivity extends AppCompatActivity {

    private Button nextBtn2;
    private ImageButton leftBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list_home);

        nextBtn2 = findViewById(R.id.nextBtn2);
        leftBtn2 = findViewById(R.id.leftBtn2);

        nextBtn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goOptionsActivity();
            }
        });
        leftBtn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goLodgingActivity();
            }
        });
    }

    private void goOptionsActivity() {
        Intent i = new Intent(this, OptionsActivity.class);
        startActivity(i);
        finish();
    }

    private void goLodgingActivity() {
        Intent i = new Intent(this, LodgingActivity.class);
        startActivity(i);
        finish();
    }

}
