import java.util.*;
public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = 0;
        int sign = 1;

        if (dividend < 0 && divisor > 0) {
            sign = -1;
            dividend = -1*dividend;
        }
        if (dividend > 0 && divisor < 0) {
            sign = -1;
            divisor = -1*divisor;
        }
        if (dividend<0 && divisor<0) {
            dividend = -1*dividend;
            divisor = -1*divisor;
        }
        System.out.println(dividend +" "+ divisor);

        if (divisor == 1) {
            if (sign == -1) {
                quotient = quotient * -1;
            }
            quotient = dividend;
            // return dividend;
        } else {
            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }
            if (sign == -1) {
                quotient = quotient * -1;
            }
            // return quotient;
        }
        System.out.println(quotient);
        sc.close();
    }
}
