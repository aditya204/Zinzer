package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ForgotActivity extends AppCompatActivity {


    private Button resetbtn;
    private EditText etforgotMail;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        resetbtn=(Button)findViewById(R.id.resetPassword);
        etforgotMail=(EditText)findViewById(R.id.forgotMail);
        firebaseAuth=FirebaseAuth.getInstance();


        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sentresetMail();

            }
        });


    }

    private void sentresetMail(){
        String userEmail=etforgotMail.getText().toString().trim();
        if (userEmail.equals("")){
            Toast.makeText(this,"Enter Email",Toast.LENGTH_SHORT).show();
        }else {

            firebaseAuth.sendPasswordResetEmail(userEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(ForgotActivity.this,"Password reset email snt",Toast.LENGTH_SHORT).show();
                        finish();
                        startActivity(new Intent(ForgotActivity.this,MainActivity.class));
                    }else{
                        Toast.makeText(ForgotActivity.this,"Enter registered email",Toast.LENGTH_SHORT).show();

                    }

                }
            });
        }






    }

}
