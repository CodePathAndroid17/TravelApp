package com.codepath.spalli235.battuta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.pictogram.fragments.ComposeFragment;
import com.example.pictogram.fragments.PostFragment;
import com.example.pictogram.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.ParseUser;

import java.io.File;

public class MainActivity extends AppCompatActivity {
public static final String TAG = "MainActivity";

final FragmentManager fragmentManager = getSupportFragmentManager();

private BottomNavigationView bottomNavigationView;

private File photoFile;
public String photoFileName = "photo.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_activity);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = new Fragment();
                switch (menuItem.getItemId()) {

                    case R.id.action_home:
                        //TODO: update fragment
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        //Doesnt work for some good reason trying to find out
                        fragment = new PostFragment();
                        break;
                    case R.id.action_compose:
                        // do something here
                        Toast.makeText(MainActivity.this, "Compose", Toast.LENGTH_SHORT).show();
                        fragment = new ComposeFragment();
                        break;
                    case R.id.action_profile:
                        //TODO: update fragment
                        Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        fragment = new ProfileFragment();
                    case R.id.action_heart:
                        //TODO: update fragment
                        Toast.makeText(MainActivity.this, "Heart", Toast.LENGTH_SHORT).show();
                        //fragment = new ComposeFragment();
                        break;
                    case R.id.action_logout:
                        //TODO: update fragment
                        Toast.makeText(MainActivity.this, "Log Out", Toast.LENGTH_SHORT).show();
                        ParseUser.logOut();
                        goLoginActivity();
                        break;
                    default:
                        // do something here
                        //Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                       fragment = new ComposeFragment();
                        break;
                }

                fragmentManager.beginTransaction().replace(R.id.flContainer,fragment).commit();
                return true;
            }
        });
    //set default selection
        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }

    private void goLoginActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        //finish();
    }

}