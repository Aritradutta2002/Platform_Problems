package LeetCode_TestCases;
import LeetCode_Problems.Leetcode2566_Maximum_Difference_by_Remapping_a_Digit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Leetcode2566_Maximum_Difference_by_Remapping_a_Digit_Tests {
    @Test
    void testcase1() {
        assertEquals(8208, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.minMaxDifference(11891));
    }

    @Test
    void testcase2() {
        assertEquals(909, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.minMaxDifference(990));
    }

    @Test
    void testcase3() {
        assertEquals(900, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.minMaxDifference(909));
    }

    @Test
    void testcase4() {
        assertEquals(9, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.minMaxDifference(9));
    }

    @Test
    void testcase5() {
        assertEquals(8000, Leetcode2566_Maximum_Difference_by_Remapping_a_Digit.minMaxDifference(1000));
    }
}