package com.example.abhinav.firstaid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.emergency_online);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onlineEmergency();
            }
        });
    }

    public void fire(View view) {
        Intent intent = new Intent(this,FireActivity.class);
        startActivity(intent);
    }

    public void burn(View view) {
        Intent intent = new Intent(this,BurnActivity.class);
        startActivity(intent);
    }

    public void bleeding(View view) {
        Intent intent = new Intent(this,BleedingActivity.class);
        startActivity(intent);
    }

    public void choking(View view) {
        Intent intent = new Intent(this,ChokingActivity.class);
        startActivity(intent);
    }

    public void onlineEmergency(){

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.dropbox.com/s/hfcjdw49ucjlwa7/Emergency%20Guide.pdf?dl=0"));
        startActivity(intent);
    }

}

