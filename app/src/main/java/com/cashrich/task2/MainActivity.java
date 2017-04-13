package com.cashrich.task2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        number1=(EditText)findViewById(R.id.num_input);
        number2=(EditText)findViewById(R.id.num_input2);
        total=(TextView)findViewById(R.id.sum);
        number1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String one=number1.getText().toString();
                String two=number2.getText().toString();
                if(one.equals("")){
                    one="0";}
                if(two.equals("")){
                    two="0";
                }
                int val1=Integer.parseInt(one);
                int val2=Integer.parseInt(two);
                total.setText(String.valueOf(val1+val2));

            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });



        number2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String one=number1.getText().toString();
                String two=number2.getText().toString();
                if(one.equals("")){
                    one="0";}
                if(two.equals("")){
                    two="0";
                }
                int val1=Integer.parseInt(one);
                int val2=Integer.parseInt(two);
                total.setText(String.valueOf(val1+val2));
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });



    }
}
