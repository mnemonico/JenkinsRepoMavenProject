/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppTest;

import App.Calculator;

/**
 *
 * @author Achraf Baiz
 */
public class CalculatorImp implements Calculator{

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
                return a/b;
    }

    @Override
    public int add(int a, int b) {
                return a+b;
    }

    @Override
    public int substract(int a, int b) {
                return a-b;
    }

    @Override
    public double modulo(double a, double b) {
                return a%b;
    }
    
}
