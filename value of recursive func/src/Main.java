import java.util.Scanner;

public class Main {
    public static int func(int num){
        if(num<3){
            return num;
        }else{
            return(4*func(num-3)+2*func(num-2)+func(num-1)+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("f("+n+")="+func(n));

        sc.close();
    }
}