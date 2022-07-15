package com.example.onlinehardwareorderingapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.onlinehardwareorderingapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity {

    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        getSupportActionBar().hide();
        initializeNav();
    }

    private void initializeNav(){
        nav = (BottomNavigationView) findViewById(R.id.bottomNavMenu);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(IntroActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.stores:
                        Toast.makeText(IntroActivity.this, "Stores", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.account:
                        Toast.makeText(IntroActivity.this, "Account", Toast.LENGTH_LONG).show();
                        break;
                }

                return true;
            }
        });
    }
}