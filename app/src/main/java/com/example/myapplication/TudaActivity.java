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

public class TudaActivity extends AppCompatActivity {

    private AnimationDrawable sharingAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuda);

        ImageView sahr = findViewById(R.id.sharinganAnim);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.kruchenie);
        sahr.startAnimation(animation);

        Button backBtm = findViewById(R.id.backBtm);
        animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        backBtm.startAnimation(animation);

        sharingAnim = (AnimationDrawable) sahr.getDrawable();
        sharingAnim.start();

        backBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TudaActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.naiskosok, R.anim.naiskosok2);
            }
        });
    }
}
