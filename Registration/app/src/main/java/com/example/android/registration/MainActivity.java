package com.example.android.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button but1;
    EditText contact,name,email,username,password,cpassword;



String st,st1,st2,st3,st4,st5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=findViewById(R.id.but1);
        contact=findViewById(R.id.contact);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        cpassword=findViewById(R.id.cpassword);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, IntentActivity.class);
                st = contact.getText().toString();
                st1 = name.getText().toString();
                st2 = email.getText().toString();
                st3 = username.getText().toString();
                st4 = password.getText().toString();
                st5 = cpassword.getText().toString();
                    if (st.length() == 0 || st1.length() == 0 || st2.length() == 0 || st3.length() == 0 || st4.length() == 0) {
                        Toast.makeText(MainActivity.this, "empty field", Toast.LENGTH_SHORT).show();
                    }
                else{
                        if(!(st4.equals(st5)))
                        { Toast.makeText(MainActivity.this, "password not match", Toast.LENGTH_SHORT).show();}
                        else {
                            i.putExtra("Value", st);
                            i.putExtra("Value1", st1);
                            i.putExtra("Value2", st2);
                            i.putExtra("Value3", st3);
                            i.putExtra("Value4", st4);
                            i.putExtra("Value5", st5);
                            startActivity(i);

                            finish();
                        }

            }
            }
        });

    }
}
