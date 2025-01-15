import java.util.*;

public class FirstMissingPositive_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Solution_41 s41 = new Solution_41();
        System.out.print(s41.firstMissingPositive(a));
        sc.close();
    }
}

class Solution_41 {
    public int firstMissingPositive(int[] a) {
        int f = 0, x, i;
        i=1;   
        
    }
}