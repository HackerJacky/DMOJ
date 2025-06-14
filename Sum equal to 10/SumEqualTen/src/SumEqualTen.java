import java.util.Scanner;

public class SumEqualTen {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);  
        int num=sc.nextInt();
        int[] array=new int[num];
        int[] array2=new int[num];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length;j++){
                if((array[i]+array[j])==10 && (i!=j)){
                count++;
                }
            }
            if(count>0){
                array2[i]=1;
            } else
                array2[i]=0;
                count=0; // Reset count for the next element
        }
    

        for(int k=0;k<num;k++){
            System.out.print(array2[k]+" ");
        }
        
        sc.close();
    
}
}

