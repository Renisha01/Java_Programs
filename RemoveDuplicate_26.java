import java.util.*;

public class RemoveDuplicate_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution26 s26 = new Solution26();
        n = s26.removeDuplicates(a);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}

class Solution26 {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        if(n==0 || n==1){
            return n;
        }
        int ans[] = new int[n];
        int j=0;
        for(int i=0; i<n-1; i++){
            if(a[i]!=a[i+1]){
                ans[j++]=a[i];
            }
        }
 
       ans[j++]=a[n-1];
        for (int i = 0; i < j; i++){
            a[i] = ans[i];
        }
        return j;
    }
}