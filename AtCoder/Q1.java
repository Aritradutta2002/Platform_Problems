package Contests.LeetCode.Biweekly_Contest_167;

public class Q1 {
    public static boolean scoreBalance(String s) {
        int n = s.length();
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += s.charAt(i) - 'a' + 1;
        }
        if(total % 2 != 0) return false;
        int target = total / 2;
        int left = 0;
        for(int i = 0; i < n - 1; i++) {
            left += s.charAt(i) - 'a' + 1;
            if(left == target) return true;
        }
        return false;
    }
}
