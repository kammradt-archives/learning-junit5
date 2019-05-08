package math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }


    @Nested
    @DisplayName("Testing method: add()")
    class AddTest {

        @Test
        @DisplayName("Adding positive and negative numbers")
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
        @DisplayName("Adding two negative numbers")
        void testAddNegatives() {
            double expected = -2;
            double actual = mathUtils.add(-1, -1);

            assertEquals(expected, actual,
                    "Should add two negative numbers.");

        }
    }

    @Nested
    @DisplayName("Testing method: subtract()")
    class SubtractTest {

        @Test
        @DisplayName("Subtracting positive and negative numbers")
        void testSubtract() {
            double expected = 2;
            double actual = mathUtils.subtract(1, -1);

            assertEquals(expected, actual,
                    "Should subtract two numbers.");

        }

        @Test
        @DisplayName("Subtracting two positive numbers")
        void testSubtractPositives() {
            double expected = 0;
            double actual = mathUtils.subtract(1, 1);

            assertEquals(expected, actual,
                    "Should subtract two positive numbers.");

        }

        @Test
        @DisplayName("Subtracting two negative numbers")
        void testSubtractNegatives() {
            double expected = 0;
            double actual = mathUtils.subtract(-1, -1);

            assertEquals(expected, actual,
                    "Should subtract two negative numbers.");

        }
    }

    @Test
    @DisplayName("Testing method: multiply()")
    void testMultiplyAssertAll() {
        assertAll (
                () -> assertEquals(1, mathUtils.multiply(1,1)),
                () -> assertEquals(0, mathUtils.multiply(1,0)),
                () -> assertEquals(-1, mathUtils.multiply(1,-1)),
                () -> assertEquals(1, mathUtils.multiply(-1,-1)),
                () -> assertEquals(0, mathUtils.multiply(0,0))
        );
    }


    @Test
    @Tag("InfiniteRelated")
    @DisplayName("Division of positive number by zero")
    void testDivideByZeroPositiveInfinity() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = mathUtils.divide(1,0);

        assertEquals(expected, actual,
                "Divide by zero should return positive infinity");
    }

    @Test
    @Tag("InfiniteRelated")
    @DisplayName("Division of negative number by zero")
    void testDivideByZeroNegativeInfinity() {
        double expected = Double.NEGATIVE_INFINITY;
        double actual = mathUtils.divide(-1,0);

        assertEquals(expected, actual,
                "Divide by zero should return negative infinity");
    }

    @RepeatedTest(10)
    @Tag("Circle")
    void testComputeCircleArea(RepetitionInfo repetitionInfo) {
        double expected = 314.1592653589793;
        double actual = mathUtils.calculateCircleArea(10);

        if (repetitionInfo.getCurrentRepetition() == 5) {
            // Half done
        }

        assertEquals(expected, actual,
                "Should return right circle area");

    }
}