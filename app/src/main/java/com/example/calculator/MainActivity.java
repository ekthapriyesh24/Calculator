package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t;
    private String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.textview2);
    }
    public void setValue(View v)
    {
        switch (v.getId())
        {
            case (R.id.Button_1):   s="";
                                    t.setText(s);
                                    break;
            case (R.id.Button_2):   s=s+" + ";
                                    t.setText(s);
                                    break;
            case (R.id.Button_3):   s=s+" - ";
                                    t.setText(s);
                                    break;
            case (R.id.Button_4):   s+="1";
                                    t.setText(s);
                                    break;
            case (R.id.Button_5):   s+="2";
                                    t.setText(s);
                                    break;
            case (R.id.Button_6):   s+="3";
                                    t.setText(s);
                                    break;
            case (R.id.Button_7):   s+="4";
                                    t.setText(s);
                                    break;
            case (R.id.Button_8):   s+="5";
                                    t.setText(s);
                                    break;
            case (R.id.Button_9):   s+="6";
                                    t.setText(s);
                                    break;
            case (R.id.Button_10):  s+="7";
                                    t.setText(s);
                                    break;
            case (R.id.Button_11):  s+="8";
                                    t.setText(s);
                                    break;
            case (R.id.Button_12):  s+="9";
                                    t.setText(s);
                                    break;
            case (R.id.Button_13):  s+="0";
                                    t.setText(s);
                                    break;
            case (R.id.Button_14):  s+=" * ";
                                    t.setText(s);
                                    break;
            case (R.id.Button_15):  s+=" / ";
                                    t.setText(s);
                                    break;
            case (R.id.Button_16):  EvaluateString e=new EvaluateString();
                                    int res=e.evaluate(s);
                                    t.setText(Integer.toString(res));
                                    break;
            case (R.id.Button_17):  s+=".";
                                    t.setText(s);
                                    break;
            case (R.id.Button_18):  s+=" % ";
                                    t.setText(s);
                                    break;
        }
    }

}
