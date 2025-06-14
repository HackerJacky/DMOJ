/*
 * optimized version
 * Date: 2025-06-14
 */
import java.util.ArrayList;
import java.util.Collections;
public class ShowEvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int val = sc.nextInt();
            if (val % 2 == 0) {
                evenList.add(val);
            }
        }

        if (evenList.isEmpty()) {
            System.out.println("0");
        } else {
            Collections.sort(evenList, Collections.reverseOrder());
            for (int n : evenList) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}






