import java.util.*;

public class LongestSubstring_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution_3 s3 = new Solution_3();
        System.out.println(s3.lengthOfLongestSubstring(s.toLowerCase()));
        sc.close();
    }
}

class Solution_3 {
    public int lengthOfLongestSubstring(String s) {
        int a[] = new int[26];
        int i;
        String str = "";
        String max = "";
        for (i = 0; i < s.length(); i++) {
            if (a[s.charAt(i) - 'a'] > 0) {
                for (int j = 0; j < str.length(); j++) {
                    a[str.charAt(j) - 'a'] = 0;
                }
                if (str.length() >= max.length()) {
                    max = str;
                    str = "";
                    str += s.charAt(i);
                    a[s.charAt(i) - 'a']++;
                }
            } else {
                a[s.charAt(i) - 'a']++;
                str += s.charAt(i);
            }
        }
        if (str.length() > max.length()) {
            max = str;
        }
        return max.length();
    }
}