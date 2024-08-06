import java.util.*;

public class chooseTheDiffrentOnes {
  
  public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int y = sc.nextInt();
 
        for (int i = 0; i < y; i++) {
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];
            int arr2[] = new int[m];

            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }

            for(int j=0; j<m; j++){
                arr2[j] = sc.nextInt();
            }

            Arrays.sort(arr);
            Arrays.sort(arr2);

            int a = 0;
            int b = 0;

            boolean flag = true;

            for(int j = 1; j<= k; j++){
                int temp = 0;

                if(arr[a] == arr2[b]){
                    temp = arr[a];
                    a++;
                    b++;
                }
                else if(arr[a] < arr2[b]){
                    temp = arr[a];
                    a++;
                   
                }
                else{
                    temp = arr2[b];
                    b++;
                }

                int s = temp;
               
                if(temp != j){
                    
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
 
    }
}

