package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
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
        MathUtils mathUtils = new MathUtils();
        double expected = Double.POSITIVE_INFINITY;
        double actual = mathUtils.divide(1,0);
        assertEquals(expected, actual,
                "Divide by zero should return positive infinity");
    }

    @Test
    void testDivideByZeroNegativeInfinity() {
        MathUtils mathUtils = new MathUtils();
        double expected = Double.NEGATIVE_INFINITY;
        double actual = mathUtils.divide(-1,0);
        assertEquals(expected, actual,
                "Divide by zero should return negative infinity");
    }

    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();

        assertEquals(314.1592653589793, mathUtils.calculateCircleArea(10),
                "Should return right circle area");

    }

}