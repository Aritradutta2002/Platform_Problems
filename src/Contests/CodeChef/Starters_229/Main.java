import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            long n = fs.nextLong();
            long k = fs.nextLong();
            long s = fs.nextLong();
            long m = fs.nextLong();

            long ans = 0;
            for (long usedM = 0; usedM <= k; usedM++) {
                long remainingCount = k - usedM;
                long remainingSum = s - usedM * m;
                if (solve(n, remainingCount, remainingSum, m)) {
                    ans = usedM;
                    break;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }

    private static boolean solve(long n, long count, long sum, long m) {
        if (count == 0) {
            return sum == 0;
        }

        if (sum < count || sum > count * n) {
            return false;
        }

        if (m == 1) {
            return sum >= 2 * count;
        }

        if (m == n) {
            return sum <= (n - 1) * count;
        }

        if (n == 3 && m == 2) {
            return ((sum - count) & 1) == 0;
        }

        if (m == 2) {
            return sum != count + 1;
        }

        if (m == n - 1) {
            return sum != count * n - 1;
        }

        return !(count == 1 && sum == m);
    }

    private static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}
