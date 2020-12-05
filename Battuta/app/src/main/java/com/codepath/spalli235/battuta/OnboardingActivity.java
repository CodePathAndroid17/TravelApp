package com.codepath.spalli235.battuta;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity extends AppCompatActivity {

    public static final String TAG = "OnboardingActivity";
    private Button btnGettingStarted;
    private ImageButton rightArrowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_activity);

        btnGettingStarted = findViewById(R.id.btnGettingStarted);
        rightArrowBtn = findViewById(R.id.rightArrowBtn);

        rightArrowBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goOptionsActivity();
            }
        });
        btnGettingStarted.setOnClickListener(new View.OnClickListener()
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


}
