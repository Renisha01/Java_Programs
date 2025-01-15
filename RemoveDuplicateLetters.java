import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String ans = "";
        int arr[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (arr[a.charAt(i) - 'a'] == 0) {
                ans+=a.charAt(i);
                arr[a.charAt(i) - 'a'] = 1;
            }
        }
        char strarr[] = ans.toCharArray();
        Arrays.sort(strarr);
        for (int i = 0; i < strarr.length; i++) {
            System.out.print(strarr[i]);
        }
        sc.close();
    }
}
