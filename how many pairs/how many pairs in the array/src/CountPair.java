import java.util.Scanner;

public class CountPair {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array=new int[num];

        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(array[i]==array[j] && i<j){
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}
