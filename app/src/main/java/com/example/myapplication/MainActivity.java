package com.example.myapplication;

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
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button startBtm;
    private Button stopBtm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtm = findViewById(R.id.SudaBut);
        stopBtm = findViewById(R.id.TudaBut);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mercanie);
        startBtm.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.vsplitie);
        stopBtm.startAnimation(animation1);

        startBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TudaActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_perehod, R.anim.right_perehod);
            }
        });

        stopBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SudaActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.down, R.anim.down2);
            }
        });

    }
}