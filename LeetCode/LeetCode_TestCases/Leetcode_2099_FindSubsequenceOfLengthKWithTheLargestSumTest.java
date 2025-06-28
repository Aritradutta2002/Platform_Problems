package LeetCode_TestCases;
import LeetCode_Problems.Leetcode_2099_FindSubsequenceOfLengthKWithTheLargestSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Saturday,28.06.2025 11:29 pm
 */
class Leetcode_2099_FindSubsequenceOfLengthKWithTheLargestSumTest {

    @Test
    void maxSubsequence() {
        int[] nums = {3, 4, 3, 3, 4};
        int k = 2;
        int[] expected = {4, 4};

        assertArrayEquals(expected, Leetcode_2099_FindSubsequenceOfLengthKWithTheLargestSum.maxSubsequence(nums, k));
    }
}