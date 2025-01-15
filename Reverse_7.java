import java.util.*;

class Solution7 {
    public int reverse(long x) {
        long temp = 0;
        int f = 0;

        if (x < 0) {
            x = x * -1;
            f = 1;
        }
        while (x > 0) {
            int rem = (int) x % 10;
            temp = temp * 10 + rem;
            x = x / 10;
        }
        if (f == 1) {
            temp = -1 * temp;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            return 0;
        } else {
            int rev = (int) temp;
            return rev;
        }
    }
}

public class Reverse_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Solution7 s = new Solution7();
        System.out.print(s.reverse(n));
        sc.close();
    }
}
