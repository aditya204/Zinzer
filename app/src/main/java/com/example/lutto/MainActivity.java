package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {


    public EditText name;
    public EditText password;
    public TextView info,etforgotPassword;
    private Button login,newreg;
    private Button skipbtn;
    public FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.button);
        info=(TextView)findViewById(R.id.wrongPassword);
        newreg=(Button)findViewById(R.id.newRegister);
        etforgotPassword=(TextView)findViewById(R.id.forgotPassword);
        skipbtn=findViewById( R.id.button2 );


        firebaseAuth=FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);


        FirebaseUser user =firebaseAuth.getCurrentUser();

       

        skipbtn.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( MainActivity.this, HomeMainActivity.class );
                startActivity( intent );            }
        } );




        etforgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ForgotActivity.class));
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });

        newreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });


    }


    public void validate(String username,String userPassword){

        progressDialog.setMessage("Please Wait");
        progressDialog.show();


        firebaseAuth.signInWithEmailAndPassword(username,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressDialog.dismiss();
                    checkEmailverification();

                }else {
                    progressDialog.cancel();
                    Toast.makeText(MainActivity.this,"Login Failed,Incorrect Email or password" ,Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void checkEmailverification(){
        FirebaseUser firebaseUser =firebaseAuth.getInstance().getCurrentUser();
        Boolean emailflag=firebaseUser.isEmailVerified();

        if(emailflag){
            finish();
            startActivity( new Intent(MainActivity.this,HomeMainActivity.class));

        }else{
            Toast.makeText(this,"Verify your email",Toast.LENGTH_SHORT).show();
            firebaseAuth.signOut();
        }

    }

}
