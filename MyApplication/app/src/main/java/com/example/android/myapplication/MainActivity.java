package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText myInput;
    TextView myResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput=(EditText)findViewById(R.id.myInput);
        myResult=(TextView) findViewById(R.id.myResult);
    }

    public void convertToBinary(View view) {
        String Input = myInput.getText().toString();
        int data = Integer.parseInt(Input);
        int binary = 0;
        int base = 1;
        while (data > 0) {
            int remainder = data % 2;
            binary = binary + remainder * base;
            base = base * 10;
            data = data / 2;
        }
        String output = Integer.toString(binary);
        myResult.setText(output);


        Toast.makeText(getApplicationContext(),"Result displayed",Toast.LENGTH_LONG).show();
    }

    public void convertToDecimal(View view) {

        int n=0;
        int rem=0;
        int res=0;
        String Input = myInput.getText().toString();
        int data = Integer.parseInt(Input);
        if(checkInput(Input)) {
            while (data > 0) {
                rem = data % 10;
                int x = rem * (int) Math.pow(2, n);
                res += x;
                n++;
                data=data/10;
            }
                String output = Integer.toString(res);
                myResult.setText(output);


        }
        else
            Toast.makeText(getApplicationContext(),"NOt proper input",Toast.LENGTH_LONG).show();
    }

    private boolean checkInput(String input) {
        int flag=0;
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(!((c=='0')||(c=='1')))
            {flag=1;break;}
        }
        return flag == 0;
    }

}
