import java.util.*;

public class ThreeThreadlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int g1, g2, g3;
        int a[] = new int[3];
        while (t-- > 0) {
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            if (a[0] == a[1] && a[1]==a[2]) {
                System.out.println("YES");
            }else{
                Arrays.sort(a);
                if (a[1]%a[0]==0 && a[2]%a[0]==0 ) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            // g1 = GCD(a, b);
            // g2 = GCD(b, c);
            // g3 = GCD(a, c);
            // if (g1<=3 && g2<=3 && g3<=3) {
            //     System.out.println("YES");
            // }else{
            //     System.out.println("NO");
            // }
        }
        sc.close();
    }

    // public static int GCD(int x, int y) {
    //     int min = Math.min(x, y);
    //     while (min > 0) {
    //         if (x % min == 0 && y % min == 0) {
    //             break;
    //         }
    //         min--;
    //     }
    //     return min;
    // }
}
