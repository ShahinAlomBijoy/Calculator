package com.example.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView Result;
 Double num1,num2,ans;
 char C;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result =findViewById(R.id.textViewId);
    }


    public void numOne( View view){
        String s =Result.getText().toString();
        Result.setText(s+"1");


    }
    public void numTwo( View view){
        String s =Result.getText().toString();
        Result.setText(s+"2");


    }
    public void numThree( View view){
        String s =Result.getText().toString();
        Result.setText(s+"3");


    }
    public void numFour( View view){
        String s =Result.getText().toString();
        Result.setText(s+"4");


    }
    public void numFive( View view){
        String s =Result.getText().toString();
        Result.setText(s+"5");


    }
    public void numSix( View view){
        String s =Result.getText().toString();
        Result.setText(s+"6");


    }
    public void numSeven( View view){
        String s =Result.getText().toString();
        Result.setText(s+"7");


    }
    public void numEight( View view){
        String s =Result.getText().toString();
        Result.setText(s+"8");


    }
    public void numNine( View view){
        String s =Result.getText().toString();
        Result.setText(s+"9");


    }
    public void numPlus( View view){
        String s =Result.getText().toString();
        num1=Double.parseDouble(s);
        Result.setText("");
        C='+';


    }
    public void numMinus( View view){
        String s =Result.getText().toString();
        num1=Double.parseDouble(s);
        Result.setText("");
        C='-';



    }
    public void numMulti( View view){
        String s =Result.getText().toString();
        num1=Double.parseDouble(s);
        Result.setText("");
        C='*';



    }
    public void numZero( View view){

           String s =Result.getText().toString();
           if(s.length()!=0){
           Result.setText(s+"0");
       }



    }
    public void numEqual( View view){
        String s =Result.getText().toString();
        num2=Double.parseDouble(s);
        if(C=='+'){
            ans=num1+num2;
            s=String.valueOf(ans);
            Result.setText(s);
        }
     if(C=='-'){
            ans=num1-num2;
            s=String.valueOf(ans);
            Result.setText(s);
        }
     if(C=='*'){
            ans=num1*num2;
            s=String.valueOf(ans);
            Result.setText(s);
        }
     if(C=='/'){
            ans=num1/num2;
            s=String.valueOf(ans);
            Result.setText(s);
        }



    }
    public void numDived(View view){
        String s =Result.getText().toString();
        num1=Double.parseDouble(s);
        Result.setText("");
        C='/';



    }
    public void clear(View view){

        Result.setText("");
    }
    public void back(View view){
        String s =Result.getText().toString();
        if(s.length()!=0)
        {
            s = s.substring(0, s.length() - 1);
            Result.setText(s);
        }

    }
}