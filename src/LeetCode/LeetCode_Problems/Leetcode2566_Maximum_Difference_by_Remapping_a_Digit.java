package LeetCode.LeetCode_Problems;

import java.util.Scanner;

/*
 *   Author : Aritra
 *   Created On: Saturday,14.06.2025 07:45 pm
 */
public class Leetcode2566_Maximum_Difference_by_Remapping_a_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(minMaxDifference(num));
    }

    public static int minMaxDifference(int num) {
        String s = Integer.toString(num);
        String t = s;
        int pos = 0;
        while (pos < s.length() && s.charAt(pos) == '9') {
            pos++;
        }
        if (pos < s.length()) {
            s = s.replace(s.charAt(pos), '9');
        }
        t = t.replace(t.charAt(0), '0');
        return Integer.parseInt(s) - Integer.parseInt(t);
    }
}
