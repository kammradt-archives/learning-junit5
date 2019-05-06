package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void add() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1, 1);

        assertEquals(expected, actual,
                "Should add two numbers.");
        
    }

    @Test
    void computeCircleArea() {
        MathUtils mathUtils = new MathUtils();

        assertEquals(314.1592653589793, mathUtils.calculateCircleArea(10),
                "Should return right circle area");

    }
}