package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bottom_activity extends AppCompatActivity {

    private TextView bottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bottom_activity2 );


        bottomText=findViewById( R.id.bottomText );
    }
}
