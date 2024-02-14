import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class test {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 5);
        assertEquals(15, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(10, 5);
        assertEquals(5, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(10, 5);
        assertEquals(50, result, 0.001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 5);
        assertEquals(2, result, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }

    @Test
    public void testLogarithm() {
        Calculator calculator = new Calculator();
        double result = calculator.logarithm(10);
        assertEquals(2.302585093, result, 0.001);
    }

    @Test
    public void testSquareRoot() {
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(16);
        assertEquals(4, result, 0.001);
    }

    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        double result = calculator.factorial(5);
        assertEquals(120, result, 0.001);
    }

    @Test
    public void testFactorialOfZero() {
        Calculator calculator = new Calculator();
        double result = calculator.factorial(0);
        assertEquals(1, result, 0.001);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double result = calculator.power(2, 3);
        assertEquals(8, result, 0.001);
    }
}
