import java.util.Scanner;

public class SumEvenUnder100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num < 100 && num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}

