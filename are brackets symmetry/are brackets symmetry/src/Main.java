import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int count1=0;
        int count2=0;
        int mistakes=0;
        char target1 = '(';
        char target2 = ')';

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target1){
                count1++;
            }else if(str.charAt(i)==target2){
                if((count1>count2)){
                    count2++;
                }else{
                    mistakes+=1;
                    count2++;

                }
            }
        }

        if(mistakes != 0 || count1!=count2){
            System.out.print("N:"+str);
        }else{
            System.out.print(str);
        }
        sc.close();
    }
}
