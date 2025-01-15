import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits[] = new int[n];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }
        if (digits[n-1]!=9) {
            digits[n-1]=digits[n-1]+1;
        }else{
            
        }
    }
}
