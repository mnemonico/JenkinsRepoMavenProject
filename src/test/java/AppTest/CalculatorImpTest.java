/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppTest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Achraf Baiz
 */
public class CalculatorImpTest {
    
    public CalculatorImpTest() {
    }

    /**
     * Test of multiply method, of class CalculatorImp.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 5;
        int b = 3;
        CalculatorImp instance = new CalculatorImp();
        int expResult = 15;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculatorImp.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 5;
        double b = 0;
        CalculatorImp instance = new CalculatorImp();
        double expResult = Double.POSITIVE_INFINITY;
        double result = instance.divide(a, b);
        System.out.println("divide value  = "+result);
        assertEquals(expResult, result, 1.6666666666666666666666666666667);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CalculatorImp.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 3;
        CalculatorImp instance = new CalculatorImp();
        int expResult = 8;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class CalculatorImp.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 5;
        int b = 3;
        CalculatorImp instance = new CalculatorImp();
        int expResult = 2;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modulo method, of class CalculatorImp.
     */
    @Test
    public void testModulo() {
        System.out.println("modulo");
        double a = 10;
        double b = 4;
        CalculatorImp instance = new CalculatorImp();
        double expResult = 2;
        double result = instance.modulo(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
