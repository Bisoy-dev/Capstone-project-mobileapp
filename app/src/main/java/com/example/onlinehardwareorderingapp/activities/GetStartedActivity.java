package com.example.onlinehardwareorderingapp.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.onlinehardwareorderingapp.MainActivity;
import com.example.onlinehardwareorderingapp.R;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GetStartedActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    ConstraintLayout constraintGetStartedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        constraintGetStartedBtn = (ConstraintLayout) findViewById(R.id.getStartedBtn);
        constraintGetStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GetStartedActivity.this, "You click it!", Toast.LENGTH_LONG).show();
                navigate();
            }

        });
        //sharedPreferences = getSharedPreferences(String.valueOf(R.string.shared_pref), Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPreferences.edit();
        //editor.putBoolean(String.valueOf(R.string.shared_pref), true);
    }

    private void navigate(){
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
    }
}