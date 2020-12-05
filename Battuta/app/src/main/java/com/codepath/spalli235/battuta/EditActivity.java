package com.codepath.spalli235.battuta;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {

    public static final String TAG = "EditActivity";

    private ImageButton leftBtn5;
    private Button nextBtn5;

    private Button editTransportation;
    private Button editDestination;
    private Button editLodging;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_options);

        leftBtn5 = findViewById(R.id.leftBtn5);
        nextBtn5 = findViewById(R.id.nextBtn5);

        editTransportation = findViewById(R.id.editTransportation);
        editDestination = findViewById(R.id.editDestination);
        editLodging = findViewById(R.id.editLodging);

        nextBtn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goOptionsActivity();
            }
        });
        leftBtn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goTripListEditActivity();
            }
        });

        editTransportation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goTransportationActivity();
            }
        });

        editDestination.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goDestinationActivity();
            }
        });
        editLodging.setOnClickListener(new View.OnClickListener()
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
    private void goTripListEditActivity() {
        Intent i = new Intent(this, TripListEditActivity.class);
        startActivity(i);
        finish();
    }
    private void goTransportationActivity() {
        Intent i = new Intent(this, TransportationActivity.class);
        startActivity(i);
        finish();
    }
    private void goDestinationActivity() {
        Intent i = new Intent(this, DestinationActivity.class);
        startActivity(i);
        finish();
    }
    private void goLodgingActivity() {
        Intent i = new Intent(this, LodgingActivity.class);
        startActivity(i);
        finish();
    }

}
