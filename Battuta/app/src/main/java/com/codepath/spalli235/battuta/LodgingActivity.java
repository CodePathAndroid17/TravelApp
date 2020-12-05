package com.codepath.spalli235.battuta;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LodgingActivity extends AppCompatActivity {


    public static final String TAG = "LodgingActivity";
    private Button nextBtn;
    private ImageButton leftBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodge);

        nextBtn = findViewById(R.id.nextBtn3);
        leftBtn = findViewById(R.id.leftBtn3);

        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goTripListActivity();
            }
        });
        leftBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goTransportationActivity();
            }
        });
    }

    private void goTransportationActivity() {
        Intent i = new Intent(this, TransportationActivity.class);
        startActivity(i);
        finish();
    }
    private void goTripListActivity() {
        Intent i = new Intent(this, TripListActivity.class);
        startActivity(i);
        finish();
    }
}
