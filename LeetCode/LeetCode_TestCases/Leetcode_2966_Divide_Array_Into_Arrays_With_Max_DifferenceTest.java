package LeetCode_TestCases;

import LeetCode_Problems.Leetcode_2966_Divide_Array_Into_Arrays_With_Max_Difference;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Thursday,19.06.2025 12:28 am
 */
class Leetcode_2966_Divide_Array_Into_Arrays_With_Max_DifferenceTest {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void divideArray() {
        int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k = 2;
        int[][] expected = {{1, 1, 3}, {3, 4, 5}, {7, 8, 9}};
        assertArrayEquals(expected, Leetcode_2966_Divide_Array_Into_Arrays_With_Max_Difference.divideArray(nums, k));
    }
    
    @Test
    void divideArrayWithImpossibleDivision() {
        int[] nums = {1, 3, 3, 2, 7, 3};
        int k = 3;
        int[][] expected = {};
        assertArrayEquals(expected, Leetcode_2966_Divide_Array_Into_Arrays_With_Max_Difference.divideArray(nums, k));
    }
    
    @Test
    void divideArrayWithExactSize() {
        int[] nums = {1, 3, 2, 4, 5, 6};
        int k = 3;
        int[][] expected = {{1, 2, 3}, {4, 5, 6}};
        assertArrayEquals(expected, Leetcode_2966_Divide_Array_Into_Arrays_With_Max_Difference.divideArray(nums, k));
    }
}