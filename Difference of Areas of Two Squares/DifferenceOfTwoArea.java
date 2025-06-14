import java.util.Scanner;

public class DifferenceOfTwoArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int area1=num1*num1;
        int area2 =num2*num2;

        int diff =area1-area2;

        System.out.print(Math.abs(diff));
        sc.close();
    }
}
