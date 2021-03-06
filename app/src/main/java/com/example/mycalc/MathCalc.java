// Author.....: Cristina Ponay | cristinaponay@gmail.com
// Create Date: 27 Jan 2020
// Application: Android Calculator
// Description: Basic Android calculator designed after the Windows 10 standard calculator
//              which ignores the order of operations

package com.example.mycalc;

public class MathCalc {
    private double result;
    private String operation;

    public MathCalc() {
        this.result = 0;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void calculate (double num1, double num2) {
        switch (operation) {
            case "+":
                result = num1 + num2; break;
            case "-":
                result = num1 - num2; break;
            case "*":
                result = num1 * num2; break;
            case "/":
                result = num1 / num2; break;
            default:
                result = 0;
        }

    }
}
