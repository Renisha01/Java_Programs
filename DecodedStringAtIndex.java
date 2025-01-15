import java.util.*;
public class DecodedStringAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        int k = sc.nextInt();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)<='z'&&s.charAt(i)>='a') {
                ans += s.charAt(i);
            }else{
                int n = s.charAt(i)-'0';
                n--;
                String temp = ans;
                while (n-->0) {
                    ans+=temp;
                }
            }
        }
        System.out.println(ans.charAt(k-1));
    }
}
