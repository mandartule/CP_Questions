import java.util.*;

public class reactangleCutting {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean  ans = false;
            
            if((a/2 != b && a%2 == 0) || (b%2 == 0  && b/2 != a)) ans = true;


            if(a == 1 && b == 1) ans = false;
        
            if(ans)System.out.println("YES");
            else System.out.println("NO");
        }

    }
}