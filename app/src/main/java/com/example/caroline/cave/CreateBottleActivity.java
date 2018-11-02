package com.example.caroline.cave;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class CreateBottleActivity extends AppCompatActivity {
    public static String ADDED_BOTTLE_KEY = "ADDED_BOTTLE_KEY";
    private static String TAG = CreateBottleActivity.class.getSimpleName();
    private String name;
    private float price;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_bottle_activity);

        final Button button = (findViewById(R.id.button_validate));

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                name = ((EditText)findViewById(R.id.edit_name)).getText().toString();
                price = Float.parseFloat(((EditText)findViewById(R.id.edit_price)).getText().toString());
                Bottle bottle = new Bottle(name, price);

                Intent intent = new Intent();
                intent.putExtra(ADDED_BOTTLE_KEY, (Serializable)bottle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }


}
