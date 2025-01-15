import java.util.*;

public class Pallindrom_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution9 s = new Solution9();
        System.out.print(s.isPalindrome(n));
        sc.close();
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        if (x < 0) {
            return false;
        } else {
            while (temp > 0) {
                int rem = temp % 10;
                ans = ans * 10 + rem;
                temp = temp / 10;
            }
            if (x == ans) {
                return true;
            } else {
                return false;
            }
        }
    }
}
