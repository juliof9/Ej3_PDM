package com.uca.ej3_pdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout btn_1;
    LinearLayout btn_2;
    LinearLayout btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int[] red = {R.color.r_botn1, R.color.r_botn2, R.color.r_botn3, R.color.r_botn4, R.color.r_botn5, R.color.r_botn6};

        int[] green = {R.color.g_btn,R.color.g_btn2,R.color.g_btn3,R.color.g_btn4,R.color.g_btn5,R.color.g_btn6};

        int[] purple = {R.color.p_btn,R.color.p_btn2,R.color.p_btn3,R.color.p_btn4,R.color.p_btn5,R.color.p_btn6};

        int viewId = v.getId();

        Log.i("id ",viewId+"");

        switch (viewId){
            case R.id.btn_1:
                btn_1.setBackgroundResource(red[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.btn_2:
                btn_2.setBackgroundResource(green[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.btn_3:
                btn_3.setBackgroundResource(purple[(int) Math.floor(Math.random()*6)]);
                break;
        }
    }
}
