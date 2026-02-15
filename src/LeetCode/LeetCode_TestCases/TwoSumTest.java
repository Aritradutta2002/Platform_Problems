package LeetCode.LeetCode_TestCases;
import LeetCode.LeetCode_Problems.Leetcode_01_Two_Sum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testTwoSumBasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = Leetcode_01_Two_Sum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testTwoSumDifferentTarget() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = Leetcode_01_Two_Sum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumSameNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = Leetcode_01_Two_Sum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        int[] result = Leetcode_01_Two_Sum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumNoSolution() {
        int[] nums = {1, 2, 3, 4};
        int target = 10;
        int[] expected = {-1, -1};
        int[] result = Leetcode_01_Two_Sum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumLargeArray() {
        int[] nums = {2, 7, 11, 15, 3, 6, 9, 1, 4, 5, 8, 12};
        int target = 17;
        int[] expected = {0, 3}; // 2 + 15 = 17
        int[] result = Leetcode_01_Two_Sum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}
