import java.util.*;
public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String jewel = sc.nextLine();
        String stones = sc.nextLine();
        char ch[] = new char[jewel.length()];
        for (int i = 0; i < jewel.length(); i++) {
            ch[i] = jewel.charAt(i);
        }
        for (int i = 0; i < stones.length(); i++) {
            if (jewel.indexOf(stones.charAt(i))>=0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
