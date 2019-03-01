package com.example.giftest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayProduct extends AppCompatActivity {

    private TextView myView;
    private Button moveback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product);
        String ItemValue = "...";
        moveback = findViewById(R.id.goback);
        myView = (TextView) findViewById(R.id.actualItem);

        Bundle extras = getIntent().getExtras();


        if (extras != null) {
            ItemValue = extras.getString("value");
        }

        myView.setText(ItemValue);
    }

    public void restartOld (View v) {
        final Intent browse = new Intent(this,ShopActivity.class);
        startActivity(browse);
        finish();
    }
}
