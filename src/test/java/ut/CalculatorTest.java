package ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {

    static Calculator cl;

    @BeforeClass
    public static void setUp() {
        cl = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        System.gc();
    }

    @Test
    public void testAdd() {
        assertEquals(3, cl.doAdd(1, 2));
    }

    @Test
    public void testSub1() {
        assertEquals(0, cl.doSub(1, 1));
    }

    @Test
    public void testMul1() {
        assertEquals(18, cl.doMul(9, 2));
    }
    
    @Test
    public void testSub2() {
        assertEquals(0.0, cl.doSub(1.0, 1.0), 0.0);
    }

    @Test
    public void testDiv() {
        assertEquals(4, cl.doDiv(8, 2));
    }
}
