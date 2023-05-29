package by.itstep.java1022.belser.model.logic;

import org.junit.*;

import static org.junit.Assert.*;

public class SuperCalculatorTest {
    private static SuperCalculator calc;
    public SuperCalculatorTest(){

        System.out.println("create object");
    }

    @BeforeClass
    public static void setUp() {
        System.out.println("BeforeClass");
        calc = new SuperCalculator();
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("AfterClass");
        calc = null;
    }

    @Test
    public void add() {
        int a = 10;
        int b = 20;
        int expected = 30;

        int actual = calc.add(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void sub() {
    }

    @Test
    public void mul() {
    }

    @Test
    public void div() {
    }
}