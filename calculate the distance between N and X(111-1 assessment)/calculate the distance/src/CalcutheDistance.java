import java.util.Scanner;

public class CalcutheDistance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        
        int numroot=(int)Math.round(Math.cbrt(num));

        int cub=(int)Math.pow(numroot,3);
        int dis=cub-num;

        System.out.print("X:"+cub+" "+"距離:"+Math.abs(dis));






    }
}
