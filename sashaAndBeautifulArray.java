import java.util.*;

public class sashaAndBeautifulArray {
  
  public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int y = sc.nextInt();
 
        for (int i = 0; i < y; i++) {
            
            int n = sc.nextInt();
            int arr[] = new int[n];

            long sum = 0;

            

            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            for(int j = 1; j < n; j++){
                sum += arr[j] - arr[j-1];
            }
            
            System.out.println(sum);

        }
 
    }
}


