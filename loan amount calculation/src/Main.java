import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Loan= sc.nextDouble();
        double rate= sc.nextDouble();
        double period= sc.nextDouble();
        double monthpay=(Loan*rate)/(1-(1/Math.pow(1+rate,period*12)));

        double totalpay=Math.round(monthpay)*period*12;
        System.out.println("monthlyPayment： "+Math.round(monthpay));
        System.out.print("totalPayment： "+Math.round(totalpay));
    }
}