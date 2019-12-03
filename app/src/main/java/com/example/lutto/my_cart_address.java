package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class my_cart_address extends AppCompatActivity {

    private TextView address;
    private TextView changeAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_cart_address );

        address=findViewById( R.id.myCartAddress );
        changeAddress=findViewById( R.id.myCartAddressChange );

    }
}
