package LeetCode_TestCases;

import LeetCode_Problems.Leetcode_1432_Max_Difference_You_Can_Get_From_Changing_an_Integer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/*
 *   Author : Aritra
 *   Created On: Sunday,15.06.2025 10:46 am
 */
class Leetcode_1432_Max_Difference_You_Can_Get_From_Changing_an_IntegerTest {

    @Test
    void maxDiff1() {
        int num = 555;
        int expected = 888;
        int actual = Leetcode_1432_Max_Difference_You_Can_Get_From_Changing_an_Integer.maxDiff(num);
        assertEquals(expected, actual);
    }

    @Test
    void maxDiff2() {
        int num = 9;
        int expected = 8;
        int actual = Leetcode_1432_Max_Difference_You_Can_Get_From_Changing_an_Integer.maxDiff(num);
        assertEquals(expected, actual);
    }

    @Test
    void maxDiff3() {
        int num = 123456;
        int expected = 820000;
        int actual = Leetcode_1432_Max_Difference_You_Can_Get_From_Changing_an_Integer.maxDiff(num);
        assertEquals(expected, actual);
    }
}