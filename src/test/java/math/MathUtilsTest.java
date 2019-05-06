package math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        double expected = 0;
        double actual = mathUtils.add(1, -1);

        assertEquals(expected, actual,
                "Should add two numbers.");

    }

    @Test
    @DisplayName("Adding two positive numbers")
    void testAddPositives() {
        double expected = 2;
        double actual = mathUtils.add(1, 1);

        assertEquals(expected, actual,
                "Should add two positive numbers.");

    }

    @Test
    void testAddNegatives() {
        double expected = -2;
        double actual = mathUtils.add(-1, -1);

        assertEquals(expected, actual,
                "Should add two negative numbers.");

    }

    @Test
    void testSubtract() {
        double expected = -2;
        double actual = mathUtils.subtract(-1, 1);

        assertEquals(expected, actual,
                "Should subtract two numbers.");
    }

    @Test
    void testSubtractPositives() {
        double expected = 0;
        double actual = mathUtils.subtract(1, 1);

        assertEquals(expected, actual,
                "Should subtract two positive numbers.");
    }

    @Test
    void testSubtractNegatives() {
        double expected = 0;
        double actual = mathUtils.subtract(-1, -1);

        assertEquals(expected, actual,
                "Should subtract two negative numbers.");
    }

    @Test
    void testMultiply() {
        double expected = 10;
        double actual = mathUtils.multiply(2, 5);

        assertEquals(expected, actual,
                "Should multiply two numbers.");
    }

    @Test
    void testMultiplyByOne() {
        double expected = 2;
        double actual = mathUtils.multiply(2, 1);

        assertEquals(expected, actual,
                "Should multiply by one.");
    }

    @Test
    void testMultiplyByZero() {
        double expected = 0;
        double actual = mathUtils.multiply(2, 0);

        assertEquals(expected, actual,
                "Should multiply by zero.");
    }

    @Test
    void testMultiplyByNegative() {
        double expected = -10;
        double actual = mathUtils.multiply(2, -5);

        assertEquals(expected, actual,
                "Should multiply by a negative negative.");
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

    @Test
    @Disabled
    @DisplayName("Test that I don't want to run because it will fail, lets skip")
    void disabledTest(){
        fail("This test will fail if I remove the @Disabled");
    }
}