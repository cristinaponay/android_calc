package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.*;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText editCalc;
    private TextView txtDisplay;
    MathCalc calc = new MathCalc();
    private double dVal1 = Double.NaN;
    private int prev = 0, next =0;
    private String chosenOp = "";
    private String strEditTxt = "";
    private String pattern = "###,###.##########";
    private DecimalFormat df = new DecimalFormat(pattern);
    private boolean isDelLockOn = false;
    private boolean minusOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the UI
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnCE = findViewById(R.id.btnCE);
        Button btnC = findViewById(R.id.btnC);
        Button btnDel = findViewById(R.id.btnDel);
        Button btnEqual = findViewById(R.id.btnEqual);
        Button btnNegative = findViewById(R.id.btnNegative);
        Button btnPoint = findViewById(R.id.btnPoint);

        editCalc = findViewById(R.id.editCalc);
        txtDisplay = findViewById(R.id.txtDisplay);
        txtDisplay.setMovementMethod(new ScrollingMovementMethod());

        // Add listeners
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("0");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("1");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("2");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("3");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("4");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("5");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("6");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("7");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("8");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDelLockOn || (txtDisplay.getText().charAt(0) == '0' && txtDisplay.getText().length() == 1)) {
                    txtDisplay.setText("9");
                    if(isDelLockOn) { isDelLockOn = false; }
                }
                else {
                    txtDisplay.setText(txtDisplay.getText() + "9");
                }
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isDelLockOn) {
                    if (txtDisplay.getText().toString().indexOf('.') == -1) {
                        txtDisplay.setText(txtDisplay.getText() + ".");
                    } else if (editCalc.getText().toString().length() - 1 == next) {
                        txtDisplay.setText("0.");
                    }
                }
                else {
                    txtDisplay.setText("0.");
                    isDelLockOn = false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText("");
                editCalc.setSelection(0);
                reset();
                txtDisplay.setText("0");
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText("0");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDisplay = txtDisplay.getText().toString();

                if(!isDelLockOn) {
                    if (strDisplay.length() == 1) {
                        txtDisplay.setText("0");
                    }
                    else {
                        txtDisplay.setText(strDisplay.substring(0, strDisplay.length() - 1));
                    }
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenOp = "+";
                compute();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenOp = "-";
                compute();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenOp = "*";
                compute();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenOp = "/";
                compute();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenOp = "=";
                compute();
            }
        });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtDisplay.getText().toString() != "0") {
                    if (minusOn) {
                        txtDisplay.setText("-" + txtDisplay.getText());
                    } else if (txtDisplay.getText().toString().charAt(0) == '-') {
                        txtDisplay.setText(txtDisplay.getText().toString().substring(1));
                    }
                    minusOn = !minusOn;
                }
            }
        });
    }

    private void reset() {
        prev = 0;
        next = 0;
        dVal1 = Double.NaN;
        calc.setResult(0);
    }

    // function that performs the calculations
    private void compute() {
        // initialize local variables
        String strResult = txtDisplay.getText().toString();

        // if last character on display is ".", remove it
        if(strResult.charAt(strResult.length()-1) == '.') {
            txtDisplay.setText(strResult.substring(0, strResult.length()-1));
        }

        // isDelLockOn is a flag that will lock the DEL button
        // DEL button should not perform delete if an operator is set just like the Windows calculator
        if(!isDelLockOn) {
            // if user enters the "=" immediately after entering a number,
            // display the number only
            if (chosenOp.equals("=") && Double.isNaN(dVal1)) {
                strEditTxt = txtDisplay.getText().toString() + chosenOp;
                editCalc.setText(strEditTxt);

                reset();
            } else {
                if(TextUtils.isEmpty(editCalc.getText().toString())) {
                    strEditTxt = txtDisplay.getText().toString() + chosenOp; // strEdit is reset
                }
                // allows continuous adding of operations in the EditText area
                else {
                    strEditTxt += txtDisplay.getText().toString() + chosenOp;
                }
                editCalc.setText(strEditTxt);
                editCalc.setSelection(strEditTxt.length()); // puts the cursor at the end

                next = strEditTxt.lastIndexOf(chosenOp); // sets the index # for substring later

                // if the first number was set
                if(!Double.isNaN(dVal1)) {
                    // get first number
                    dVal1 = calc.getResult(); // first number is always the previous result

                    // get second number in between the operators
                    double dVal2 = Double.parseDouble(strEditTxt.substring(prev, next));
//                    Toast.makeText(getApplicationContext(), "Val2: " + dVal2, Toast.LENGTH_LONG).show();

                    // gets the current operator
                    String op = String.valueOf(strEditTxt.charAt(prev - 1));
                    calc.setOperation(op);

                    // performs the calculation
                    calc.calculate(dVal1, dVal2);

                    // checks if infinity
                    if (Double.isInfinite(calc.getResult()) || Double.isNaN(calc.getResult())) {
                        strResult = "Error!";
                        calc.setResult(0);
                        Toast.makeText(getApplicationContext(), "Can't divide by 0!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        strResult = df.format(calc.getResult());
                    }
                    txtDisplay.setText(strResult);

                    if(chosenOp.equals("=")) {
                        reset();
                        calc.setOperation("=");
                    }
                }
                // if the first number is not set yet
                else {
                    prev = 0;
                    // put the entered value from the TextView to the EditText area with the operator
                    strEditTxt = txtDisplay.getText().toString() + chosenOp;
                    editCalc.setText(strEditTxt);

                    // sets the first value
                    dVal1 = Double.parseDouble(txtDisplay.getText().toString());
                    calc.setResult(dVal1);  // set as result

                    // sets the operator
                    calc.setOperation(chosenOp);
//                    Toast.makeText(getApplicationContext(), "Val1: " + dVal1, Toast.LENGTH_LONG).show();
                }
            }
            prev = strEditTxt.lastIndexOf(chosenOp) + 1;
            isDelLockOn = true;
        }
        else {
            // allows switching of operators
            if(calc.getOperation() != chosenOp && calc.getOperation() != null) {
//                Toast.makeText(getApplicationContext(), "Changed operation: " + chosenOp, Toast.LENGTH_LONG).show();

                // do not allow switching of operators if "=" is already entered
                if(!calc.getOperation().equals("=")) {
                    // Changes the operator at the end
                    if (!TextUtils.isEmpty(editCalc.getText().toString())) {
                        strEditTxt = editCalc.getText().toString();
                        strEditTxt = strEditTxt.substring(0, strEditTxt.length() - 1) + chosenOp;

                        if(chosenOp.equals("=")) {
                            reset();
                            calc.setOperation("=");
                        }
                    } else {
                        strEditTxt = "";
                    }
                    editCalc.setText(strEditTxt);
                    editCalc.setSelection(strEditTxt.length());
                }
            }
        }
    }
}
