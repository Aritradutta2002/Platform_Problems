package LeetCode_TestCases;
import LeetCode_Problems.Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_I;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Wednesday,16.07.2025 11:39 pm
 */
class Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_ITest {

    @Test
    void maximumLength1() {
        int[] nums1 = {1,2,1,1,2,1,2};
        assertEquals(6, Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_I.maximumLength(nums1));
    }

    @Test
    void maximumLength2() {
        int[] nums2 = {2, 4, 6, 8};
        assertEquals(4, Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_I.maximumLength(nums2));
    }

    @Test
    void maximumLength3() {
        int[] nums3 = {1, 3, 5, 7};
        assertEquals(4, Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_I.maximumLength(nums3));
    }

    @Test
    void maximumLength4() {
        int[] nums4 = {1, 2, 3, 4};
        assertEquals(4, Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_I.maximumLength(nums4));
    }


    @Test
    void maximumLength5() {
        int[] nums5 = {1, 3};
        assertEquals(2, Leetcode_3201_Find_the_Maximum_Length_of_Valid_Subsequence_I.maximumLength(nums5));
    }
}