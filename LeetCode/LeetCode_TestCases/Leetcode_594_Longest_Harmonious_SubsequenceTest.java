package LeetCode_TestCases;

import LeetCode_Problems.Leetcode_594_Longest_Harmonious_Subsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Monday,30.06.2025 09:08 pm
 */
class Leetcode_594_Longest_Harmonious_SubsequenceTest {

    @Test
    void findLHSTest1() {
        int[] nums = {1, 3, 2, 2, 5, 4, 3, 3};
        int expected = 5; // The longest harmonious subsequence is [3, 2, 2, 3, 3]
        assertEquals(expected, Leetcode_594_Longest_Harmonious_Subsequence.findLHS(nums));
    }
    @Test
    void findLHSTest2() {
        int[] nums = {1, 2, 3, 4};
        int expected = 2; // The longest harmonious subsequence is [1, 2] or [2, 3]
        assertEquals(expected, Leetcode_594_Longest_Harmonious_Subsequence.findLHS(nums));
    }

    @Test
    void findLHSTest3() {
        int[] nums = {1, 1, 1, 1};
        int expected = 0; // No harmonious subsequence exists
        assertEquals(expected, Leetcode_594_Longest_Harmonious_Subsequence.findLHS(nums));
    }
}