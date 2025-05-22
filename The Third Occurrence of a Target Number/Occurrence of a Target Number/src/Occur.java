import java.util.Scanner;

public class Occur {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array=new int[10];

        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }

        int count=0;
        int ind=0;
        
        for(int j=0;j<10;j++){
            if(array[j]==num){
                count++;                
            }
            if(count==1 &&array[j]==num){
                ind=j;
            }
            if(count==2&&array[j]==num){
                ind=j;
            }
            if(array[j]==num && count==3){
                System.out.print(j+1);
            }
        }
        
        if (count==0) {
            System.out.print("-1");
        }
        if(count==2 || count==1){
            System.out.print(ind+1);
        }
    }
}
