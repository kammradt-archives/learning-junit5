package math;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        double expected = 2;
        double actual = mathUtils.add(1, 1);

        assertEquals(expected, actual,
                "Should add two numbers.");
        
    }

    @Test
    void testSubtract() {
    }

    @Test
    void testMultiply() {
    }

    @Test
    void testDivideByZeroPositiveInfinity() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = mathUtils.divide(1,0);

        assertEquals(expected, actual,
                "Divide by zero should return positive infinity");
    }

    @Test
    void testDivideByZeroNegativeInfinity() {
        double expected = Double.NEGATIVE_INFINITY;
        double actual = mathUtils.divide(-1,0);

        assertEquals(expected, actual,
                "Divide by zero should return negative infinity");
    }

    @Test
    void testComputeCircleArea() {
        double expected = 314.1592653589793;
        double actual = mathUtils.calculateCircleArea(10);

        assertEquals(expected, actual,
                "Should return right circle area");

    }

}