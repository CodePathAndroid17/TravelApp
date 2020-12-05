package com.codepath.spalli235.battuta;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import okhttp3.Headers;
public class DestinationActivity extends AppCompatActivity {


    public static final String TAG = "LodgingActivity";
    private Button nextBtn;
    private ImageButton leftBtn;
    private Button currentLocation_btn;
    private EditText whereToResponse;
    private EditText fromWhereResponse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_activity);

        nextBtn = findViewById(R.id.nextBtn);
        leftBtn = findViewById(R.id.leftBtn);
        currentLocation_btn = findViewById(R.id.currentLocation_btn);
        whereToResponse = findViewById(R.id.whereToResponse);
        fromWhereResponse = findViewById(R.id.fromWhereResponse);

        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goTransportationActivity();
            }
        });
        leftBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goOptionActivity();
            }
        });
    }

    private void goOptionActivity() {
        Intent i = new Intent(this, OptionsActivity.class);
        startActivity(i);
        finish();
    }
    private void goTransportationActivity() {
        Intent i = new Intent(this, TransportationActivity.class);
        startActivity(i);
        finish();
    }


}
