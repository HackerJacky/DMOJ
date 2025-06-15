import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int plustimes=1;


        if(num>=0){
            do{
                num++;

                plustimes++;
            }while(Math.cbrt(num) != (int)Math.cbrt(num));
        }else {

            do {
                num++;

                plustimes++;


            } while( Math.cbrt(num) != (int)Math.cbrt(num));
        }

        int cube=(int)(Math.cbrt(num));


        if(num>=0){
            System.out.print("X=" + (plustimes-1) + "," + "Y=" + num + "(" + cube + "的立方)");
        }else{
            System.out.print("X=" + (plustimes-1) + "," + "Y=" +num + "(" + cube + "的立方)");
        }
    }
}