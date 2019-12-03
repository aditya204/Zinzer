package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MycartBill extends AppCompatActivity {


    private TextView itemPrice;
    private TextView taxPrice;
    private TextView grandPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mycart_bill );


        itemPrice=findViewById( R.id.itemTotalPrice );
        taxPrice=findViewById( R.id.taxChargesPrice );
        grandPrice=findViewById( R.id.grandTotalPrice );




    }
}
