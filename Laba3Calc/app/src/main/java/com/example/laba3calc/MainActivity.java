package com.example.laba3calc;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnP;
    Button btnM;
    Button btnPM;
    Button btnD;
    Button btnC;
    Button btnDiv;
    Button btnMulti;
    Button btnEq;


    TextView TextV1;
    TextView TextV2;

    long tv1 = 0, tv2 = 0;
    boolean swpos = false;
    byte opID = 1;// 1+ 2- 3* 4/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnP = findViewById(R.id.buttonPlus);
        btnM = findViewById(R.id.buttonMinus);
        btnPM = findViewById(R.id.buttonPM);
        btnD = findViewById(R.id.buttonDot);
        btnC = findViewById(R.id.buttonC);
        btnDiv = findViewById(R.id.buttonDiv);
        btnMulti = findViewById(R.id.buttonMulti);
        btnEq = findViewById(R.id.buttonEq);


        TextV1 = findViewById(R.id.textV1);
        TextV2 = findViewById(R.id.textV2);
        TextV1.setText(Integer.toString(0));
        TextV2.setText(Integer.toString(0));


        btn0.setOnClickListener(oclCalc);
        btn1.setOnClickListener(oclCalc);
        btn2.setOnClickListener(oclCalc);
        btn3.setOnClickListener(oclCalc);
        btn4.setOnClickListener(oclCalc);
        btn5.setOnClickListener(oclCalc);
        btn6.setOnClickListener(oclCalc);
        btn7.setOnClickListener(oclCalc);
        btn8.setOnClickListener(oclCalc);
        btn9.setOnClickListener(oclCalc);
        btnP.setOnClickListener(oclCalc);
        btnM.setOnClickListener(oclCalc);
        btnPM.setOnClickListener(oclCalc);
        btnMulti.setOnClickListener(oclCalc);
        btnDiv.setOnClickListener(oclCalc);
        btnD.setOnClickListener(oclCalc);
        btnEq.setOnClickListener(oclCalc);
        btnC.setOnClickListener(oclCalc);


    }


    View.OnClickListener oclCalc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (!swpos) {
                switch (v.getId()) {
                    case R.id.button0:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 0;
                            break;
                        }
                        else {tv1= tv1*10-0;
                        break;}
                    case R.id.button1:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 1;
                            break;
                        }
                        else {tv1= tv1*10-1;
                        break;}

                    case R.id.button2:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 2;
                            break;
                        }
                        else {tv1= tv1* 10 - 2;
                            break;}
                    case R.id.button3:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 3;
                            break;
                        }
                        else {tv1= tv1* 10 - 3;
                            break;}
                    case R.id.button4:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 4;
                            break;
                        }
                        else {tv1= tv1* 10 - 4;
                            break;}
                    case R.id.button5:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 5;
                            break;
                        }
                        else {tv1= tv1* 10 - 5;
                            break;}
                    case R.id.button6:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 6;
                            break;
                        }
                        else {tv1= tv1* 10 - 6;
                            break;}
                    case R.id.button7:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 7;
                            break;
                        }
                        else {tv1= tv1* 10 - 7;
                            break;}
                    case R.id.button8:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 8;
                            break;
                        }
                        else {tv1= tv1* 10 - 8;
                            break;}
                    case R.id.button9:
                        if (tv1>=0) {
                            tv1 = tv1 * 10 + 9;
                            break;
                        }
                        else {tv1= tv1* 10 - 9;
                            break;}
                    case R.id.buttonC:
                        tv1 = 0;
                        tv2 = 0;
                        swpos = false;
                        break;
                    case R.id.buttonPlus:
                        opID=1;
                        swpos=true;
                        break;
                    case  R.id.buttonMinus:
                        opID=2;
                        swpos=true;
                        break;
                    case  R.id.buttonMulti:
                        opID=3;
                        swpos=true;
                        break;
                    case  R.id.buttonDiv:
                        opID=4;
                        swpos=true;
                        break;
                    case R.id.buttonPM:
                        tv1 = tv1 * (-1);
                        break;
                    case R.id.buttonDot:
                        tv1 /=10;
                        break;

                }

            }

            if (swpos){
                switch (v.getId()) {
                    case R.id.button0:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 0;
                            break;
                        }
                        else {tv2= tv2*10-0;
                            break;}
                    case R.id.button1:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 1;
                            break;
                        }
                        else {tv2= tv2*10-1;
                            break;}

                    case R.id.button2:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 2;
                            break;
                        }
                        else {tv2= tv2* 10 - 2;
                            break;}
                    case R.id.button3:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 3;
                            break;
                        }
                        else {tv2= tv2* 10 - 3;
                            break;}
                    case R.id.button4:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 4;
                            break;
                        }
                        else {tv2= tv2* 10 - 4;
                            break;}
                    case R.id.button5:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 5;
                            break;
                        }
                        else {tv2= tv2* 10 - 5;
                            break;}
                    case R.id.button6:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 6;
                            break;
                        }
                        else {tv2= tv2* 10 - 6;
                            break;}
                    case R.id.button7:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 7;
                            break;
                        }
                        else {tv2= tv2* 10 - 7;
                            break;}
                    case R.id.button8:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 8;
                            break;
                        }
                        else {tv2= tv2* 10 - 8;
                            break;}
                    case R.id.button9:
                        if (tv2>=0) {
                            tv2 = tv2 * 10 + 9;
                            break;
                        }
                        else {tv2= tv2* 10 - 9;
                            break;}
                    case R.id.buttonC:
                        tv1 = 0;
                        tv2 = 0;
                        swpos = false;
                        break;
                    case R.id.buttonPlus:
                        opID=1;
                        swpos=true;
                        break;
                    case  R.id.buttonMinus:
                        opID=2;
                        swpos=true;
                        break;
                    case  R.id.buttonMulti:
                        opID=3;
                        swpos=true;
                        break;
                    case  R.id.buttonDiv:
                        opID=4;
                        swpos=true;
                        break;
                    case R.id.buttonPM:
                        tv2 = tv2 * (-1);
                        break;
                    case R.id.buttonDot:
                        tv2 /=10;
                        break;
                    case R.id.buttonEq:
                        switch (opID){
                            case 1:
                                tv1 = tv1 + tv2;
                                break;
                            case 2:
                                tv1 = tv1 - tv2;
                                break;
                            case 3:
                                tv1 = tv1 * tv2;
                                break;
                            case 4:
                                tv1 = tv1 / tv2;
                        }
                        tv2 = 0;
                        swpos = false;
                        break;
                }
            }

            TextV1.setText( Long.toString(tv1) );
            TextV2.setText( Long.toString(tv2) );

        }
    };
}
