package LeetCode;

import java.util.Scanner;

public class Leetcode_1404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(numSteps(s));
    }

    public static int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                steps += 2;
            } else {
                steps += 1;
            }
        }
        return steps + carry;
    }
}