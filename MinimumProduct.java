import java.util.*;
public class MinimumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long a,b,x,y,n;
        while (t-->0) {
            a = sc.nextLong();
            b = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            n = sc.nextLong();
            System.out.println(Math.min(product(a, b, x, y, n),product(b, a, y, x, n)));
        }
        sc.close();
    }
    static Long product(long a, long b, long x, long y, long n){
        long c = Math.min(n,a-x);
        n-=c;
        a-=c;
        c = Math.min(n, b-y);
        b-=c;
        return a*b;
    }
}