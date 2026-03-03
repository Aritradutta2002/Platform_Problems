package LeetCode;

import java.util.Arrays;

public class MinimumPartitionScore3826 {
    public long minPartitionScore(int[] nums, int k) {
        
    }

    public static void main(String[] args) {
        /*
         * LeetCode 3826. Minimum Partition Score
         *
         * Description:
         * Partition nums into exactly k non-empty contiguous subarrays.
         * The value of a subarray with sum = sumArr is:
         *   sumArr * (sumArr + 1) / 2
         * Return the minimum possible total score across all k-partitions.
         *
         * Constraints:
         * 1 <= nums.length <= 1000
         * 1 <= nums[i] <= 10^4
         * 1 <= k <= nums.length
         */

        MinimumPartitionScore3826 solver = new MinimumPartitionScore3826();

        TestCase[] tests = new TestCase[]{
                // Official examples
                new TestCase(new int[]{5, 1, 2, 1}, 2, 25L),
                new TestCase(new int[]{1, 2, 3, 4}, 1, 55L),
                new TestCase(new int[]{1, 1, 1}, 3, 3L),

                // Extra sanity checks
                new TestCase(new int[]{7}, 1, 28L),
                new TestCase(new int[]{2, 2, 2, 2}, 4, 12L)
        };

        runAllTests(solver, tests);
    }

    private static void runAllTests(MinimumPartitionScore3826 solver, TestCase[] tests) {
        int passed = 0;

        for (int i = 0; i < tests.length; i++) {
            TestCase tc = tests[i];
            try {
                long actual = solver.minPartitionScore(tc.nums, tc.k);
                boolean ok = actual == tc.expected;
                if (ok) {
                    passed++;
                }

                System.out.printf(
                        "Test %d | nums=%s, k=%d | expected=%d, actual=%d | %s%n",
                        i + 1,
                        Arrays.toString(tc.nums),
                        tc.k,
                        tc.expected,
                        actual,
                        ok ? "PASS" : "FAIL"
                );
            } catch (UnsupportedOperationException ex) {
                System.out.printf(
                        "Test %d | nums=%s, k=%d | expected=%d | SKIPPED (%s)%n",
                        i + 1,
                        Arrays.toString(tc.nums),
                        tc.k,
                        tc.expected,
                        ex.getMessage()
                );
            }
        }

        System.out.printf("Summary: %d/%d tests passed.%n", passed, tests.length);
    }

    private static class TestCase {
        int[] nums;
        int k;
        long expected;

        TestCase(int[] nums, int k, long expected) {
            this.nums = nums;
            this.k = k;
            this.expected = expected;
        }
    }
}
