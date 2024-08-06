import java.util.*;

public class makeEqual {
  
  public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int y = sc.nextInt();
 
        for (int i = 0; i < y; i++) {
            
            

            int n = sc.nextInt();
            boolean flag = true;

            int arr[] = new int[n];

            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,0);
            int sum = 0;

            for(int j = 0; j<n; j++){

                arr[j] = sc.nextInt();
                sum+= arr[j];
                map.put(j+1,sum);
            }
            

            int want = map.get(n)/n;

            for(int j = n-1; j>=0; j--){
                if(arr[j] < want){
                    int need = want-arr[j];

                    if((want*j)+need>map.get(j)){
                        flag = false;
                        break;
                    } 
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

