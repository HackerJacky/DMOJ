/*
 * 
 * 
 * @author Jacky
 * Update date:May 2,2025
 */


import java.util.Scanner;

public class FlipArray {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][]array=new int[rows][cols];
        int[][] temp1=new int[rows][1];
        
        
        //input the num into the array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        
        //upside down
        if(rows%2==0){
            for(int k=1;k<=(rows/2);k++){
                temp1[k-1]=array[k-1];
                array[k-1]=array[rows-k];
                array[rows-k]=temp1[k-1];
        }
        }else{
            for(int r=1;r<=((rows-1)/2);r++){
                temp1[r-1]=array[r-1];
                array[r-1]=array[rows-r];
                array[rows-r]=temp1[r-1];
        }
        }
        
        //swap left and right
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols / 2; c++) {
                int temp = array[r][c];
                array[r][c] = array[r][cols - 1 - c];
                array[r][cols - 1 - c] = temp;
            }
        }
        

        
        //show the flip array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
