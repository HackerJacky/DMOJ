import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  num =sc.nextInt();
        int  gap=2024-num;
        if(gap>0){
            System.out.print(5-(gap%12)+" ");
        }else{
            System.out.print(5+Math.abs(gap%12)+" ");
        }

        //遇到非400倍數的,要設定年分除100的餘數不等於0
        if((num%4==0 && num%100!=0) ||(num%400==0 && num%100==0)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}