import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0, i=0;
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        } 
        Arrays.sort(a);
        i = 0;
        while(i<n-1) {
            if (a[i] == a[i+1]) {
                i++;
            }else{
                f = 1;
                System.out.println(a[i]);
                break;
            }
            i++;
        }
        if (f == 0) {
            System.out.println(a[n-1]);
        }
        sc.close();
    }
}
//1 1 2 2 4