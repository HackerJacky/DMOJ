/** 
 * 
 * @author Jacky
 * Update date:April 30,2025
*/

//請使用者從鍵盤逐一輸入成績資料，直到輸入負數或超過100分為止，由螢幕列出低於60的分數與人數。
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> under60 = new ArrayList<>();

        while (true) {
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                break;
            }
            if (score < 60) {
                under60.add(score);
            }
        }

        System.out.println("未達60分以上" + under60.size() + "人");
        System.out.println("包含：");
        for (int score : under60) {
            System.out.println(score);
        }
    }
}
