package LeetCode;
import java.util.Arrays;
import java.util.List;
public class Find_All_Anagrams_in_a_String_438 {

    /*
     * Problem: 438. Find All Anagrams in a String
     *
     * Description:
     * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
     * You may return the answer in any order.
     *
     * Constraints:
     * 1 <= s.length, p.length <= 3 * 10^4
     * s and p consist of lowercase English letters.
     */
    public List<Integer> findAnagrams(String s, String p) {
        
    }

    private static final class TestCase {
        final String s;
        final String p;
        final List<Integer> expected;

        TestCase(String s, String p, List<Integer> expected) {
            this.s = s;
            this.p = p;
            this.expected = expected;
        }
    }

    public static void main(String[] args) {
        Find_All_Anagrams_in_a_String_438 solver = new Find_All_Anagrams_in_a_String_438();

        TestCase[] tests = new TestCase[] {
            // Official examples
            new TestCase("cbaebabacd", "abc", Arrays.asList(0, 6)),
            new TestCase("abab", "ab", Arrays.asList(0, 1, 2)),

            // Extra sanity tests
            new TestCase("baa", "aa", Arrays.asList(1)),
            new TestCase("abc", "abcd", Arrays.asList()),
            new TestCase("aaaaa", "b", Arrays.asList())
        };

        int passed = 0;
        int failed = 0;
        int skipped = 0;

        for (int i = 0; i < tests.length; i++) {
            TestCase test = tests[i];
            try {
                List<Integer> actual = solver.findAnagrams(test.s, test.p);
                if (test.expected.equals(actual)) {
                    passed++;
                    System.out.println("Test " + (i + 1) + ": PASS");
                } else {
                    failed++;
                    System.out.println("Test " + (i + 1) + ": FAIL");
                    System.out.println("  s = \"" + test.s + "\", p = \"" + test.p + "\"");
                    System.out.println("  expected = " + test.expected);
                    System.out.println("  actual   = " + actual);
                }
            } catch (UnsupportedOperationException ex) {
                skipped++;
                System.out.println("Test " + (i + 1) + ": SKIPPED (Not implemented yet.)");
            }
        }

        System.out.println();
        System.out.println("Summary: total=" + tests.length + ", passed=" + passed + ", failed=" + failed + ", skipped=" + skipped);
    }
}
