package com.example.sarahbrazauskas.webviewerucsd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonYahoo, buttonUCSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);

        buttonUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this, YahooActivity.class);
                startActivity(y);
                break;
            case R.id.buttonUCSD:
                Intent u = new Intent(this, UCSDActivity.class);
                startActivity(u);
                break;
        }
    }
}
