package com.example.caroline.cave;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_INTENT_RESULT_CODE = 1;
    private static final int CREATE_BOTTLE_ACTIVITY_INTENT_RESULT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (findViewById(R.id.button_add_bottle));

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, CreateBottleActivity.class);
                startActivityForResult(intent, CREATE_BOTTLE_ACTIVITY_INTENT_RESULT_CODE);
            }
        });

        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == CREATE_BOTTLE_ACTIVITY_INTENT_RESULT_CODE) {
                Bottle addedBottle = (Bottle) data.getSerializableExtra(CreateBottleActivity.ADDED_BOTTLE_KEY);
                Toast.makeText(MainActivity.this, addedBottle.toString(), Toast.LENGTH_LONG).show();
            }
        }

    }



}
