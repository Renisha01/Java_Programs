import java.util.*;
public class KeyBoardRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        String l1 = "qwertyuiop";
        String l2 = "asdfghjkl";
        String l3 = "zxcvbnm";
        int ch=0;
        int size = 0;
        int f=0;
        for(int i=0; i<words.length; i++){
            if(l1.indexOf(words[i].charAt(0))>=0){
                ch=1;
            }else if (l2.indexOf(words[i].charAt(0))>=0) {
                ch=2;
            }else if (l3.indexOf(words[i].charAt(0))>=0) {
                ch=3;
            }
            for (int j = 0; j < words[i].length(); j++) {
                if (ch==1 && l1.indexOf(words[i].charAt(j))<0) {
                    f=1;
                    break;
                }
            }
            if (f=0) {
                
            }
        }
    }
}
