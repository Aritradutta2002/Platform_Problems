package LeetCode_TestCases;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import LeetCode_Problems.Leetcode_3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/*
 *   Author : Aritra
 *   Created On: Thursday,12.06.2025 07:58 pm
 */
public class Leetcode_3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array_TestCases {

    @Test
    public void testPositiveNumbers() {
        int[] nums = {1,2,4};
        int expected = 3;
        assertEquals(expected, Leetcode_3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array.maxAdjacentDistance(nums));
    }

    @Test
    public void testNegativeNumbersSymmetric() {
        int[] nums = {-5, -10, -5};
        int expected = 5;
        assertEquals(expected, Leetcode_3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array.maxAdjacentDistance(nums));
    }

    @Test
    public void testNegativeNumbersDescending() {
        int[] nums = {-5, -8, -10};
        int expected = 5;
        assertEquals(expected, Leetcode_3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array.maxAdjacentDistance(nums));
    }
}
