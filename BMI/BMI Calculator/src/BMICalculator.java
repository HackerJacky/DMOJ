import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入身高（公尺）
        System.out.print("請輸入身高（公尺）：");
        double height = scanner.nextDouble();

        // 輸入體重（公斤）
        System.out.print("請輸入體重（公斤）：");
        double weight = scanner.nextDouble();

        // 計算 BMI
        double bmi = weight / (height * height);

        // 輸出 BMI 結果
        System.out.printf("你的 BMI 為：%.2f\n", bmi);

        // 健康狀態判斷
        if (bmi < 18.5) {
            System.out.println("體重過輕");
        } else if (bmi < 24) {
            System.out.println("正常範圍");
        } else if (bmi < 27) {
            System.out.println("過重");
        } else if (bmi < 30) {
            System.out.println("輕度肥胖");
        } else if (bmi < 35) {
            System.out.println("中度肥胖");
        } else {
            System.out.println("重度肥胖");
        }

        scanner.close();
    }
}
