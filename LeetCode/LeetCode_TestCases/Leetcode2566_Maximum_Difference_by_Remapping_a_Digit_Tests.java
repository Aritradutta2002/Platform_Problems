package LeetCode_TestCases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Leetcode2566_Maximum_Difference_by_Remapping_a_Digit_Tests {

    @Test
    void testMaximumDifference1() {
        assertEquals(99009, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.maxDiff(11891));
    }

    @Test
    void testMaximumDifference2() {
        assertEquals(99, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.maxDiff(90));
    }

    @Test
    void testMaximumDifference3() {
        assertEquals(900, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.maxDiff(100));
    }

    @Test
    void testMaximumDifference4() {
        assertEquals(9000, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.maxDiff(1000));
    }

    @Test
    void minMaxDifference1() {
        int num = 11891;
        int expected = 99009;
        assertEquals(expected, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.maxDiff(num));
    }

    @Test
    void minMaxDifference2() {
        int num = 90;
        int expected = 99;
        assertEquals(expected, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.maxDiff(num));
    }
}