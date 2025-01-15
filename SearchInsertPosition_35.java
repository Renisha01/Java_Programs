import java.util.*;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution35 s35 = new Solution35();
        System.out.print(s35.searchInsert(a, target));
        sc.close();
    }
}

class Solution35 {
    public int searchInsert(int[] a, int target) {
        int i = 0;
        if (target<a[0]) {
            return 0;
        }else if(target>a[a.length-1]){
            return a.length;
        }
        else{
            for (i = 0; i < a.length; i++) {
                if (a[i] >= target) {
                    return i;
                }
            }
        }
        return 0;
    }
}