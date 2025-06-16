import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),num2=num,num1=num;
        int index1=0,index2=0;


        do{
            num1++;
            index1++;

        }while(Math.cbrt(num1)!=(int)Math.cbrt(num1));

        do{
            num2--;
            index2++;

        }while(Math.cbrt(num2)!=(int)Math.cbrt(num2));

        if(index1>index2){
            System.out.print("X："+(int)num2+" 距離："+index2);
        }else if(index1<index2){
            System.out.print("X："+(int)num1+" 距離："+index1);
        }



    }
}

//更間單的做法就是先將輸入的數字開三次方根,得到的數進行四捨五入,然後四捨五入的數三次方後,就可以得到我們要的數