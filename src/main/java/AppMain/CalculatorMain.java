/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMain;

import AppTest.CalculatorImp;
/**
 *
 * @author Achraf Baiz
 */
public class CalculatorMain {
    
    public static void main(String[] args) {
        
        CalculatorImp ci = new CalculatorImp();
        
        System.out.println( "adding result of 2 and 4 is : "+ ci.add(2, 4));
        
        System.out.println( "modulo result of 10 by 4 is : "+ ci.modulo(10, 4));
        
    }
    
}
