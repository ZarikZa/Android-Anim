package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SudaActivity extends AppCompatActivity {

    private Button back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suda);

        ImageView sahr = findViewById(R.id.saske);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mercanie);
        sahr.startAnimation(animation);

        back = findViewById(R.id.BackBtm);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.priezd);
        back.startAnimation(animation1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SudaActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.verh, R.anim.verh2);
            }
        });
    }
}
