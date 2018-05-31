package com.my.broadcaset;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline = findViewById(R.id.forceOffline);
        forceOffline.setOnClickListener(this);
        Button toLogin = findViewById(R.id.toLogin);
        toLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.forceOffline:
                Intent intent = new Intent("com.my.otherhandler.FORECEOFFLINE");
                sendBroadcast(intent);
                break;
            case R.id.toLogin:
                Intent intent1 = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent1);
            default:
                break;
        }
    }
}

