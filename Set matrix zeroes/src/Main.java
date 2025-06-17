import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int[][] array=new int[rows][cols];
        ArrayList<Integer> arraylist =new ArrayList<>();
        int count=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
                if(array[i][j]==0){
                    arraylist.add(i);
                    arraylist.add(j);
                    count+=2;
                }
            }
        }
        //Let the cols become 0.

        for(int i=0;i<count;i+=2){
            int indexrows=arraylist.get(i+1);
            for(int j=0;j<rows;j++){
                array[j][indexrows]=0;

        }
        }
        //Let the rows become 0.
        //Let the cols become 0.
        for(int i=0;i<count;i+=2){
            int indexcols=arraylist.get(i);
            for(int j=0;j<cols;j++){
                    array[indexcols][j]=0;
            }
        }

        //Let the rows become 0.



        //output
        for(int i=0 ;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+" ");
            }
        }

    }
}