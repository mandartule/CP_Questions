import java.util.*;

public class sashaAndDrawings {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        for (int i = 0; i < y; i++) {

            int n = sc.nextInt();
            int k = sc.nextInt();  

            int total = (4*n)-2;

            if(k == total) System.out.println(n+n);
            else {
                if(k%2 == 0) System.out.println(k/2);
                else System.out.println(k/2+1);
            }

        }

    }
}
