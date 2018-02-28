package com.xinran.mo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startOneActivity();
            }
        });
    }

    private void startOneActivity() {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("app://moudle"));
        startActivity(intent);
    }
}
