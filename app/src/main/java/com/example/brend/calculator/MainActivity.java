package com.example.brend.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final char ADD = '+';
        final char SUB = '-';
        final char MUL = '*';
        final char DIV = '/';
        final char INV = 'I';
        final char FAC = '!';
        final char SQRT = 'R';

        final char[] TYPE = new char[1];

        Button buttonAdd = (Button) findViewById(R.id.btnadd);
        Button buttonSub = (Button) findViewById(R.id.btnsub);
        Button buttonMult = (Button) findViewById(R.id.btnmul);
        Button buttonDiv = (Button) findViewById(R.id.btndiv);
        Button buttonInv = (Button) findViewById(R.id.btninv);
        Button buttonFac = (Button) findViewById(R.id.btnfac);
        Button buttonSqrt = (Button) findViewById(R.id.btnsqrt);
        Button buttonNeg = (Button) findViewById(R.id.btnneg);
        Button buttonDot = (Button) findViewById(R.id.btndec);
        Button buttonEql = (Button) findViewById(R.id.btneql);

        Button button0 = (Button) findViewById(R.id.btn0);
        Button button1 = (Button) findViewById(R.id.btn1);
        Button button2 = (Button) findViewById(R.id.btn2);
        Button button3 = (Button) findViewById(R.id.btn3);
        Button button4 = (Button) findViewById(R.id.btn4);
        Button button5 = (Button) findViewById(R.id.btn5);
        Button button6 = (Button) findViewById(R.id.btn6);
        Button button7 = (Button) findViewById(R.id.btn7);
        Button button8 = (Button) findViewById(R.id.btn8);
        Button button9 = (Button) findViewById(R.id.btn9);

        final EditText oper1 = (EditText) findViewById(R.id.oper1);
        final EditText oper2 = (EditText) findViewById(R.id.oper2);
        final char[] choice = new char[1];

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "0");
                } else {
                    oper2.setText(oper2.getText() + "0");
                }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "1");
                } else {
                    oper2.setText(oper2.getText() + "1");
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "2");
                } else {
                    oper2.setText(oper2.getText() + "2");
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "3");
                } else {
                    oper2.setText(oper2.getText() + "3");
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "4");
                } else {
                    oper2.setText(oper2.getText() + "4");
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "5");
                } else {
                    oper2.setText(oper2.getText() + "5");
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "6");
                } else {
                    oper2.setText(oper2.getText() + "6");
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "7");
                } else {
                    oper2.setText(oper2.getText() + "7");
                }

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "8");
                } else {
                    oper2.setText(oper2.getText() + "8");
                }

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper1.hasFocus()) {
                    oper1.setText(oper1.getText() + "9");
                } else {
                    oper2.setText(oper2.getText() + "9");
                }

            }
        });

        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I do nothing!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void sendMessageAdd(View view){
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        EditText oper2 = (EditText) findViewById(R.id.oper2);
        TextView results = (TextView) findViewById(R.id.results);
        try{
            double dub1 = Double.parseDouble(oper1.getText().toString());
            double dub2 = Double.parseDouble(oper2.getText().toString());
            double result = dub1 + dub2;
            answer = String.valueOf(result);
        }
        catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageSub(View view){
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        EditText oper2 = (EditText) findViewById(R.id.oper2);
        TextView results = (TextView) findViewById(R.id.results);
        try{
            double dub1 = Double.parseDouble(oper1.getText().toString());
            double dub2 = Double.parseDouble(oper2.getText().toString());
            double result = dub1 - dub2;
            answer = String.valueOf(result);
        }
        catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageMult(View view){
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        EditText oper2 = (EditText) findViewById(R.id.oper2);
        TextView results = (TextView) findViewById(R.id.results);
        try{
            double dub1 = Double.parseDouble(oper1.getText().toString());
            double dub2 = Double.parseDouble(oper2.getText().toString());
            double result = dub1 * dub2;
            answer = String.valueOf(result);
        }
        catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageDiv(View view) {
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        EditText oper2 = (EditText) findViewById(R.id.oper2);
        TextView results = (TextView) findViewById(R.id.results);
        try{
            double dub1 = Double.parseDouble(oper1.getText().toString());
            double dub2 = Double.parseDouble(oper2.getText().toString());
            double result = dub1 / dub2;
            answer = String.valueOf(result);
        } catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        } catch (ArithmeticException e) {
            answer = "Cannot divide by zero.\nPlease enter a valid divisor";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageFact(View view) {
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        TextView results = (TextView) findViewById(R.id.results);
        try {
            double dub1 = Double.parseDouble(oper1.getText().toString());
            int i = 1;
            double result = 1;

            while (i <= dub1) {
                result *= i;
                answer = String.valueOf(result);
                i++;
            }
        } catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageSqrt(View view) {
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        TextView results = (TextView) findViewById(R.id.results);
        try {
            double dub1 = Double.parseDouble(oper1.getText().toString());
            double result = Math.sqrt(dub1);
            answer = String.valueOf(result);
        } catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageInv(View view) {
        String answer = "";
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        TextView results = (TextView) findViewById(R.id.results);
        try {
            double dub1 = Double.parseDouble(oper1.getText().toString());
            double result = 1/ dub1;
            answer = String.valueOf(result);
        } catch (NumberFormatException e) {
            answer = "NumberFormatException thrown.\nPlease enter valid numbers.";
        } catch (ArithmeticException e) {
            answer = "Cannot divide by zero.\nPlease enter a valid divisor";
        }
        results.setText(answer);
        answer = "";
    }

    public void sendMessageClr(View view) {
        EditText oper1 = (EditText) findViewById(R.id.oper1);
        EditText oper2 = (EditText) findViewById(R.id.oper2);
        TextView results = (TextView) findViewById(R.id.results);

        oper1.setText("");
        oper2.setText("");
        results.setText("");
    }
}
