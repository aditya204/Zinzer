  package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


  public class RegistrationActivity extends AppCompatActivity {

    private EditText userName,userPassword,userPhone,userMail;
    private TextView userLogin;
    private Button userRegister;
    public FirebaseAuth firebase;
    public ProgressDialog progressDialog;
    private ImageView profilepic;

    String name,mail,password,phone;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setUIViews();

        firebase=FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);




        userRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateDetails()){
                    //upload to data base
                    String user_mail= userMail.getText().toString().trim();
                    String user_password=userPassword.getText().toString().trim();

                    firebase.createUserWithEmailAndPassword(user_mail,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                sendemailVerification();

                                Toast.makeText(RegistrationActivity.this,"Registration is Successful",Toast.LENGTH_SHORT).show();


                            }else{
                                Toast.makeText(RegistrationActivity.this,"Registration Not Successful",Toast.LENGTH_SHORT).show();
                            }


                        }
                    });

                }
            }
        });


        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
            }
        });


    }


    private void setUIViews(){
        userName=(EditText)findViewById(R.id.regUserName);
        userPassword=(EditText)findViewById(R.id.regUserPassword);
        userMail=(EditText)findViewById(R.id.regUserEmainl);
        userPhone=(EditText)findViewById(R.id.regUserPhone);
        userLogin=(TextView)findViewById(R.id.regUserLogin);
        userRegister=(Button)findViewById(R.id.regUserRegister);
        profilepic=(ImageView)findViewById(R.id.profilepic);

    }


    private boolean validateDetails(){
        Boolean result =false;

        name=userName.getText().toString();
        password = userPassword.getText().toString();
        phone=userPhone.getText().toString();
        mail=userMail.getText().toString();


        if (( name.isEmpty())|| (password.isEmpty())|| (mail.isEmpty()) || (phone.isEmpty())){

            Toast.makeText(this,"Please enter all the details",Toast.LENGTH_SHORT).show();

        }else {
            result =true;
        }
        return result;
    }

    private  void sendemailVerification(){
        progressDialog.setMessage("Sending verification mail");
        progressDialog.show();

        FirebaseUser firebaseUser=firebase.getCurrentUser();
        if(firebaseUser != null){
            firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        sendUserData();
                        Toast.makeText(RegistrationActivity.this,"Verification mail sent!",Toast.LENGTH_SHORT).show();
                        firebase.signOut();
                        progressDialog.cancel();
                        finish();
                        startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
                    }else {
                        Toast.makeText(RegistrationActivity.this,"Verification mail has not been sent!",Toast.LENGTH_SHORT).show();

                    }


                }
            });
        }
    }

    private void sendUserData(){
        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
        DatabaseReference myref=firebaseDatabase.getReference(firebase.getUid());
        UserProfile userProfile= new UserProfile(mail,name,phone,password);
        myref.setValue(userProfile);
    }


}
