package LeetCode_TestCases;

import LeetCode_Problems.Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Tuesday,12.08.2025 10:00 pm
 */
class Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_PowersTest {

    @Test
    void testExample1_SimpleCase() {
        assertEquals(1, Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers.numberOfWays(10, 2), "Test Case 1: n=10, x=2");
    }

    @Test
    void testExample2_MultipleWays() {
        assertEquals(2, Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers.numberOfWays(4, 1), "Test Case 2: n=4, x=1");
    }

    @Test
    void testNoPossibleWays() {
        assertEquals(0, Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers.numberOfWays(3, 2), "Test Case 3: No possible ways");
    }

    @Test
    void testLargerNWithSquares() {
        assertEquals(3, Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers.numberOfWays(100, 2), "Test Case 4: Larger n with x=2");
    }

    @Test
    void testLargerNWithCubes() {
        assertEquals(1, Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers.numberOfWays(100, 3), "Test Case 5: Larger n with x=3");
    }

    @Test
    void testEdgeCaseNIsOne() {
        assertEquals(1, Leetcode_2787_Ways_to_Express_an_Integer_as_Sum_of_Powers.numberOfWays(1, 5), "Test Case 6: Edge case where n=1");
    }

}