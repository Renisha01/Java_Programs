import java.util.*;

public class SearchRotated_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution33 s33 = new Solution33();
        System.out.print(s33.search(a, target));
        sc.close();
    }
}

class Solution33 {
    public int search(int[] a, int target) {
        int bp = -1;
        if (a.length == 1) {
            if (a[0] == target) {
                return 0;
            } else {
                return -1;
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > a[i + 1]) {
                    bp = i;
                    break;
                }
            }

            int lp = bp + 1;
            int rp = bp;
            while (lp < a.length - 1 && rp >= 0) {
                if (a[lp] == target) {
                    return lp;
                } else if (a[rp] == target) {
                    return rp;
                } else if (target > a[lp] && target < a[rp]) {
                    lp++;
                    rp--;
                }
            }
        }

    }
}