package by.itstep.java1022.belser.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddPositive() {
        // Arrange
        int a = 10;
        int b = 20;
        int expected = 30;

        //Act
        int actual = Calculator.add(a, b);

        //Assert
        if (expected != actual) {
            fail();
        }
    }

    @Test
    public void testSubPositive() {
        // Arrange
        int a = 10;
        int b = 20;
        int expected = -10;

        //Act
        int actual = Calculator.sub(a, b);

        //Assert
        if (expected != actual) {
            fail();
        }
    }

    @Test
    public void testMulPositive() {
        // Arrange
        int a = 10;
        int b = 20;
        int expected = 200;

        //Act
        int actual = Calculator.mul(a, b);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDivPositive() {
        // Arrange
        int a = 20;
        int b = 10;
        int expected = 2;

        //Act
        int actual = Calculator.div(a, b);

        //Assert
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        // Arrange
        int a = 20;
        int b = 1;

        //Act
        Calculator.div(a, b);
    }

    @Test(timeout = 3000)
    public void testMulPerformance() {
        // Arrange
        int a = 10;
        int b = 20;
        int expected = 200;

        //Act
        Calculator.mul(a, b);

    }
}
