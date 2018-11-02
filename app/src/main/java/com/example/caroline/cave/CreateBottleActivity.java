package com.example.caroline.cave;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.caroline.cave.R;

public class CreateBottleActivity extends AppCompatActivity {
    private String name;
    private float price;
    public static String ADDED_BOTTLE_KEY = "ADDED_BOTTLE_KEY";
    private static String TAG = CreateBottleActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_bottle_activity);

        final Button button = (findViewById(R.id.button_validate));

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                name = findViewById(R.id.edit_name).toString();
                price = Float.parseFloat(findViewById(R.id.edit_price).toString());
                Intent intent = new Intent();
                Bottle bottle = new Bottle(name, price);
                intent.putExtra(ADDED_BOTTLE_KEY, bottle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }






}
