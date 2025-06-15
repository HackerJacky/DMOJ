import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int cols= sc.nextInt();
        int[][] array=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<cols;i++){
            if(i%2==0){
                for(int k=0;k<rows;k++){
                    System.out.print(array[k][i]+" ");
                }
            }else{
                for(int j=rows-1;j>=0;j--){
                    System.out.print(array[j][i]+" ");
                }
            }
        }









    }
}