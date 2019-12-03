package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class Edit_pofile extends AppCompatActivity {


    private ImageView nameIcon;
    private ImageView mailIcon;


    private ImageView phoneIcon;
    private ImageView nameCheckIcon;
    private ImageView mailCheckIcon;
    private ImageView phoneCheckIcon;

    private TextView name;
    private TextView mail;
    private TextView phone;
    private EditText editName;
    private EditText editMail;
    private EditText editPhone;
    private Toolbar toolbar;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_edit_pofile );



        editName=findViewById( R.id.editTextName );
        nameCheckIcon=findViewById( R.id. nameCheckIcon);
        editMail=findViewById( R.id.editTextMail );
        mailCheckIcon=findViewById( R.id.mailCheckIcon );
        phoneCheckIcon=findViewById( R.id.phoneCheckIcon );
        editPhone=findViewById( R.id.editTextPhone );
        name=findViewById( R.id.textViewName );
        mail=findViewById( R.id.textViewMail );
        phone=findViewById( R.id.textViewPhone);
        nameIcon=findViewById( R.id.nameEditIcon );
        mailIcon=findViewById( R.id.mailEditIcon );
        phoneIcon=findViewById( R.id.phoneEditIcon );
        toolbar=findViewById( R.id.toolbar );

        toolbar.setTitle( "Edit Profile" );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


        nameIcon.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                name.setVisibility( View.GONE );
                editName.setVisibility( View.VISIBLE );
                nameIcon.setVisibility( View.GONE );
                nameCheckIcon.setVisibility( View.VISIBLE );
                editName.setText( name.getText() );


            }
        } );

        nameCheckIcon.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                name.setText( editName.getText() );
                nameCheckIcon.setVisibility( View.GONE );
                nameIcon.setVisibility( View.VISIBLE );
                editName.setVisibility( View.GONE );
                name.setVisibility( View.VISIBLE );

            }
        } );

        mailIcon.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                mail.setVisibility( View.GONE );
                editMail.setVisibility( View.VISIBLE );
                mailIcon.setVisibility( View.GONE );
                mailCheckIcon.setVisibility( View.VISIBLE );
                editMail.setText( mail.getText() );


            }
        } );

        mailCheckIcon.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                mail.setText( editMail.getText() );
                mailCheckIcon.setVisibility( View.GONE );
                mailIcon.setVisibility( View.VISIBLE );
                editMail.setVisibility( View.GONE );
                mail.setVisibility( View.VISIBLE );

            }
        } );
        phoneIcon.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                phone.setVisibility( View.GONE );
                editPhone.setVisibility( View.VISIBLE );
                phoneIcon.setVisibility( View.GONE );
                phoneCheckIcon.setVisibility( View.VISIBLE );
                editPhone.setText( phone.getText() );


            }
        } );

        phoneCheckIcon.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                phone.setText( editPhone.getText() );
                phoneCheckIcon.setVisibility( View.GONE );
                phoneIcon.setVisibility( View.VISIBLE );
                editPhone.setVisibility( View.GONE );
                phone.setVisibility( View.VISIBLE );

            }
        } );


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected( item );
    }





}
