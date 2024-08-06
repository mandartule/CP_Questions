import java.util.*;

public class recoveringSmallString {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            int count = 3;

            while (a > 0) {
                if (a>=28) {
                    sb.insert(0, "z");
                    a -= 26;
                    count --;
                } else {
                    if(count == 1){
                        sb.insert(0,(char) (a+96));
                        break;
                    }
                    else if(count == 2){
                        sb.insert(0,(char)(a+95));
                        sb.insert(0, "a");
                        break;
                    }else{
                        sb.insert(0,(char)(a+94));
                        sb.insert(0,"a");
                        sb.insert(0, "a");
                        break;
                    }
                    
                }
            }

           System.out.println(sb.toString());
        }

    }
}