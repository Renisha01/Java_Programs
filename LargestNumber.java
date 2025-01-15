import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        String s[] = new String[n];
        String str = "";
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            s[i] = ""+a[i];
        }
        Arrays.sort(s);
        for (int i = n-1; i >= 0; i--) {
            str += s[i];
        }
        System.out.println(str);
        sc.close();
    }
}
