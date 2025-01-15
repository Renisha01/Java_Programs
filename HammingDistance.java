import java.util.*;
public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        String a = Integer.toBinaryString(n);
        String b = Integer.toBinaryString(m);

        if(a.length()>b.length()){
            while(b.length()!=a.length()){
                b='0'+b;
            }
        }else{
            while(b.length()!=a.length()){
                a='0'+a;
            }
        }
        System.out.println(a+" "+b);
        sc.close();
    }
}
