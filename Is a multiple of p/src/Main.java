import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int[] array=new int[num1];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<array.length;i+=num2){
            if((array[i]%num3)==0){
                System.out.print("0"+" ");
            }else{
                System.out.print((array[i]*num3)+" ");
            }
        }

        sc.close();


    }
}