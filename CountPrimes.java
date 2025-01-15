import java.util.*;
public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i = 2; i <= n; i++) {
            int j = 2,c=0;
            while (j<i) {
                if (i%j==0) {
                    c++;
                }
                j++;
            }
            if (c==0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
