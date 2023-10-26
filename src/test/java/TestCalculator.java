import BT.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        double result = calculator.add(3.0, 4.0);
        assertEquals(7.0, result, 0.00001);
    }

    @Test
    public void testAddWithNegativeValues() {
        double result = calculator.add(-4.5, -5.4);
        assertEquals(-9.9, result, 0.00001);
    }

    @Test
    public void testAddWithZeroValues() {
        double result = calculator.add(9.9, 0.0);
        assertEquals(9.9, result, 0.00001);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(7.3, 3.7);
        assertEquals(3.6, result, 0.00001);
    }

    @Test
    public void testSubtractWithNegativeValues() {
        double result = calculator.subtract(-3.1, -4.2);
        assertEquals(1.1, result, 0.00001);
    }

    @Test
    public void testSubtractWithZeroValues() {
        double result = calculator.subtract(0.0, -0.001);
        assertEquals(0.001, result, 0.00001);
    }
    @Test
    public void testMultiplication(){
        double result = calculator.multiplication(3.0,4.0);
        assertEquals(12.0,result,0.000000001);
    }
    @Test
    public void testDivision() {
        double result = calculator.division(10.0, 2.0);
        assertEquals(5.0, result, 0.00001);
    }
    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.division(10.0, 0.0));
    }
    public class TestBT4 {
        @Test
        public void testFindMax() {

            int max = calculator.findMax(new int[]{1, 5, -6, 1, 5, 6, 11});
            System.out.println("Find max value in array [1, 5, -6, 1, 5, 6, 11]:");
            assertEquals(11, max);
        }
    }
}
