package com.example.boardcastproject;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends BaseActivity {


    private TextView currentUserTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentUserTextView = findViewById(R.id.current_user);

        Button forceOffline = (Button) findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.boardcastproject.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        currentUserTextView.setText("当前登录用户名:"+username);
    }

}