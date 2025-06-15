import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] % nums[j] == 0 || nums[j] % nums[i] == 0){   //這裡的判斷式表式只要重複一舊址count一次
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
