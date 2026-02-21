package LeetCode;
import java.util.Scanner;
public class Prime_Number_of_Set_Bits_in_Binary_Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(countPrimeSetBits(left, right));
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int setBit = Integer.bitCount(i);
            if(isPrime(setBit)){
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
