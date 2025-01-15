import java.util.*;

public class MultiplyString_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        Solution43 s43 = new Solution43();
        System.out.print(s43.multiply(num1, num2));
        sc.close();
    }
}

class Solution43 {
    public String multiply(String num1, String num2) {
        long x = 0, y = 0, rem;
        int i=0;
        long mul;
        String str = "";
        if (num1.equals("0") || num2.equals("0")) {
            str = "0";
            return str;
        }
        for (i = 0; i < num1.length(); i++) {
            x = x * 10 + (num1.charAt(i) - '0');
        }
        for (i = 0; i < num2.length(); i++) {
            y = y * 10 + (num2.charAt(i) - '0');
        }
        mul = x * y;
        while (mul > 0) {
            rem = mul % 10;
            str = rem + str;
            mul = mul / 10;
        }
        return str;
    }
}