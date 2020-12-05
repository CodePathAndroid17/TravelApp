package com.codepath.spalli235.battuta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TripSummary extends AppCompatActivity {

    private Button nextBtn5;
    private ImageButton leftBtn5;

    private ImageView ivTrip;
    private ImageView ivTransport;
    private ImageView ivLodge;

    private TextView tripLocation;
    private TextView overallCost;
    private TextView tripPrice;

    private TextView transportationName;
    private TextView transportationMethod;
    private TextView transportPrice;

    private TextView lodgeName;
    private TextView roomInfo;
    private TextView lodgePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_summary);

        nextBtn5 = findViewById(R.id.nextBtn5);
        leftBtn5 = findViewById(R.id.leftBtn5);

        ivTrip = findViewById(R.id.ivTrip);
        ivTransport = findViewById(R.id.ivTransport);
        ivLodge = findViewById(R.id.ivLodge);

        tripLocation = findViewById(R.id.tripLocation);
        overallCost = findViewById(R.id.overallCost);
        tripPrice = findViewById(R.id.tripPrice);

        transportationName = findViewById(R.id.transportationName);
        transportationMethod = findViewById(R.id.transportationMethod);
        transportPrice = findViewById(R.id.transportPrice);

        lodgeName = findViewById(R.id.lodgeName);
        roomInfo = findViewById(R.id.roomInfo);
        lodgePrice = findViewById(R.id.lodgePrice);


        nextBtn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goEditActivity();
            }
        });
        leftBtn5.setOnClickListener(new View.OnClickListener()
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

    private void goEditActivity() {
        Intent i = new Intent(this, EditActivity.class);
        startActivity(i);
        finish();
    }


}
