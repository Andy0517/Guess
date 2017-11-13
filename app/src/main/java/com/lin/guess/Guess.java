package com.lin.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Guess extends AppCompatActivity {
    int secnumber = 5;//new Random().nextInt(100)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
    }
    public void ok(View view){
        EditText edsecnumber =  (EditText)findViewById(R.id.ed_input);
        int number = Integer.parseInt(edsecnumber.getText().toString());
        TextView smalltext =  (TextView)findViewById(R.id.text_small);
        if(number > secnumber) {
            smalltext.setText("小一點");
        }else if(number < secnumber) {
            Toast.makeText(this, "大一點", Toast.LENGTH_LONG).show();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("訊息")
                    .setMessage("恭喜答對!!!")
                    .setPositiveButton("了解",null)
                   // .setNegativeButton("再玩一次",null)
                    .show();
        }
    }
}
