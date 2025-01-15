import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int a[] = new int[n];
        i=k;
        int index=n-1;
        while (k>0) {
            a[k - 1] = nums[index--];
            k=k-1;
        }
        int j=0;
        while (i<n) {
            a[i] = nums[j++];
            i++;
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
