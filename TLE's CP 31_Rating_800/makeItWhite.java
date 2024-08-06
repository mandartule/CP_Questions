import java.util.*;
 
public class makeItWhite {
 
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            
            int m = sc.nextInt();
            String s = sc.next();
            
            int low = 0;
            int high = m-1;

            while(low<high && s.charAt(low) == 'W')low++;

            while(high>=low && s.charAt(high) == 'W')high--;


            System.out.println(high-low+1);
        }
 
    }
}