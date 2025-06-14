import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array1=new int[num];
        int[] array2=new int[num];
        for(int i=0;i<num;i++){
            array1[i]=sc.nextInt();
        }

        for(int i=0;i<num;i++){
            array2[i]=sc.nextInt();
        }

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(((j+1)<num) && array1[j]>array1[j+1]){
                    int temp=array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;

                }
            }
        }

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(((j+1)<num) && array2[j]>array2[j+1]){
                    int temp=array2[j];
                    array2[j]=array2[j+1];
                    array2[j+1]=temp;

                }
            }
        }

        if(Arrays.equals(array1,array2)){
             System.out.print("1");
        }else{
             System.out.print("0");
        }
    }
}