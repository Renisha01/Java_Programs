import java.util.*;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        if (nums[0] > 1) {
            ans = 1;
        }else if(nums[nums.length-1]<0){
            ans = 1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > 0) {
                    if ((nums[i + 1] - nums[i]) > 1) {
                        ans = nums[i] + 1;
                        break;
                    }
                }
            }
            if (ans == 0) {
                ans = nums[nums.length - 1] + 1;
            }
            if (ans < 0) {
                ans = 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
