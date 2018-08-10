package com.example.albinjoseph.misc2;

import android.inputmethodservice.ExtractEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View one){

        EditText username =  findViewById(R.id.Name1);
        EditText password =  findViewById(R.id.Pname1);

        Log.i("main info" , username.getText().toString() + "  " +  password.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
