import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextInt();
        double b= sc.nextInt();
        double c= sc.nextInt();
        int count=0;
        if((a+b>c)&&(b+c>a)&&(a+c>b)){
            count++;
        }else{
            count--;
        }
        //記得這邊s要設定成double不然海龍計算會有誤差

        double s=(a+b+c)/2;
        double Heron=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        if(count==1){
            System.out.print("面積");
            System.out.printf("%.2f", Heron);
        }else{
            System.out.print("不是三角形");
        }

    }
}