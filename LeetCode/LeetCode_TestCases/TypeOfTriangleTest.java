package LeetCode_TestCases;

import LeetCode_Problems.TypeOfTriangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *   Author : Aritra
 *   Created On: Friday,14.06.2025 03:45 pm
 */
public class TypeOfTriangleTest {

    @Test
    void testEquilateralTriangle() {
        assertEquals("Equilateral", TypeOfTriangle.triangleType(5, 5, 5));
    }
    
    @Test
    void testIsoscelesTriangle() {
        assertEquals("Isosceles", TypeOfTriangle.triangleType(5, 5, 3));
        assertEquals("Isosceles", TypeOfTriangle.triangleType(5, 3, 5));
        assertEquals("Isosceles", TypeOfTriangle.triangleType(3, 5, 5));
    }
    
    @Test
    void testScaleneTriangle() {
        assertEquals("Scalene", TypeOfTriangle.triangleType(3, 4, 5));
    }
    
    @Test
    void testNotATriangle() {
        assertEquals("None", TypeOfTriangle.triangleType(1, 2, 10));
    }
}
