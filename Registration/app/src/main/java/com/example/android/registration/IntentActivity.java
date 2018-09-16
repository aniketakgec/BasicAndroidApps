package com.example.android.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3,tv4;
    String st,st1,st2,st3,st4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

       tv1=findViewById(R.id.textView6);
        tv2=findViewById(R.id.textView8);
        tv3=findViewById(R.id.textView10);
        tv4=findViewById(R.id.textView12);
        tv=findViewById(R.id.textView14);
       st=getIntent().getExtras().getString("Value");
        st1=getIntent().getExtras().getString("Value1");
        st2=getIntent().getExtras().getString("Value2");
        st3=getIntent().getExtras().getString("Value3");
        st4=getIntent().getExtras().getString("Value4");

       tv1.setText(st1);
        tv2.setText(st2);
        tv3.setText(st);
        tv4.setText(st3);
        tv.setText(st4);

    }
}
