package LeetCode_TestCases;
import LeetCode_Problems.Leetcode_2016_Maximum_Difference_Between_Increasing_Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Monday,16.06.2025 11:58 pm
 */
class Leetcode_2016_Maximum_Difference_Between_Increasing_ElementsTest {
    @Test
    void maximumDifference1() {
        int [] nums1 = {7,1,5,4};
        int expected1 = 4;
        assertEquals(expected1, Leetcode_2016_Maximum_Difference_Between_Increasing_Elements.maximumDifference(nums1));
    }

    @Test
    void maximumDifference2() {
        int [] nums1 = {9,4,3,2};
        int expected1 = -1;
        assertEquals(expected1, Leetcode_2016_Maximum_Difference_Between_Increasing_Elements.maximumDifference(nums1));
    }

    @Test
    void maximumDifference3() {
        int [] nums1 = {1,5,2,10};
        int expected1 = 9;
        assertEquals(expected1, Leetcode_2016_Maximum_Difference_Between_Increasing_Elements.maximumDifference(nums1));
    }
}