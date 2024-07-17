package com.techgiants.animationsall;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
  TextView text;
  Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textviwe);
        anim= AnimationUtils.loadAnimation(this,R.anim.translate);
        Button btn=findViewById(R.id.btnTranslate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(anim);
            }
        });
        Button alp=findViewById(R.id.btnAlpha);
        Animation alpha=AnimationUtils.loadAnimation(this,R.anim.alpha);
        alp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(alpha);
            }
        });
        Button sc=findViewById(R.id.btnScale);
        Animation scale=AnimationUtils.loadAnimation(this,R.anim.scale);
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setAnimation(scale);
            }
        });
        Button rot=findViewById(R.id.btnRotate);
        Animation rotate=AnimationUtils.loadAnimation(this,R.anim.rotate);
        rot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setAnimation(rotate);
            }
        });
    }
}