import java.util.*;

public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length()+" "+ b.length());
        // int a1 = Integer.parseInt(a,2);
        // int b1 = Integer.parseInt(b,2);

        // int sum = a1+b1;

        // String output = Integer.toBinaryString(sum);
        // System.out.println(output);
        int a1 = 0,b1 = 0;

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i)-'0' +" "+Math.pow(2, a.length()-i-1));
            a1 = a1 + (a.charAt(i)-'0') * Math.pow(a.length() - i - 1, 2);
        }
        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i)-'0' +" "+Math.pow(2, b.length()-i-1));
            b1 += (b.charAt(i)-'0') * Math.pow(b.length() - i - 1, 2);
        }
        System.out.println(a1 +" "+b1);
        sc.close();
    }
}
