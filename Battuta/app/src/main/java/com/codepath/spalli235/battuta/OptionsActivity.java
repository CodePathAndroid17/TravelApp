package com.codepath.spalli235.battuta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    public static final String TAG = "OnboardingActivity";
    private Button tripPlan_btn;
    private Button tripEdit_btn;
    private ImageButton backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);

        tripEdit_btn = findViewById(R.id.tripEdit_btn);
        tripPlan_btn = findViewById(R.id.tripPlan_btn);
        backBtn = findViewById(R.id.backBtn);

        tripPlan_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goDestinationActivity();
            }
        });

        tripEdit_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goEditActivity();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goOnboardingActivity();
            }
        });

    }

    private void goEditActivity() {
        Intent i = new Intent(this, EditActivity.class);
        startActivity(i);
        finish();
    }

    private void goDestinationActivity() {
        Intent i = new Intent(this, DestinationActivity.class);
        startActivity(i);
        finish();
    }

    private void goOnboardingActivity() {
        Intent i = new Intent(this, OnboardingActivity.class);
        startActivity(i);
        finish();
    }


}
