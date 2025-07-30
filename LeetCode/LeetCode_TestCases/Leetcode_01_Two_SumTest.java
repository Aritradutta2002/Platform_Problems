package LeetCode_TestCases;

import LeetCode_Problems.Leetcode_01_Two_Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Sunday,29.06.2025 02:43 pm
 */
class Leetcode_01_Two_SumTest {

    @Test
    void twoSumTest1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, Leetcode_01_Two_Sum.twoSum(nums, target));
    }
    @Test
    void twoSumTest2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, Leetcode_01_Two_Sum.twoSum(nums, target));
    }
    @Test
    void twoSumTest3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, Leetcode_01_Two_Sum.twoSum(nums, target));
    }
}