package com.example.tugaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnlinearlayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlinearlayout = findViewById(R.id.btn_linear_layout);
        btnlinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentToLinearLayout = new Intent(MainActivity.this, Linear_Layout_Activity.class);
                startActivity(IntentToLinearLayout);
            }
        });

    }

}






