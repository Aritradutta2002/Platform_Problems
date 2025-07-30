package LeetCode_TestCases;

import LeetCode_Problems.Leetcode_2419_Longest_Subarray_With_Maximum_Bitwise_AND;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Wednesday,30.07.2025 10:36 am
 */
class Leetcode_2419_Longest_Subarray_With_Maximum_Bitwise_ANDTest {

    @Test
    void longestSubarray1() {
        int[] arr = {1,2,3,3,2,2};
        assertEquals(2, Leetcode_2419_Longest_Subarray_With_Maximum_Bitwise_AND.longestSubarray(arr));
    }

    @Test
    void longestSubarray2() {
        int[] arr = {1,2,3,4};
        assertEquals(1, Leetcode_2419_Longest_Subarray_With_Maximum_Bitwise_AND.longestSubarray(arr));
    }
}