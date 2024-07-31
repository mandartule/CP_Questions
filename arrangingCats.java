import java.util.*;
 
public class arrangingCats {
 
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            
            int m = sc.nextInt();
            String s = sc.next();
            String v = sc.next();
            
            int count = 0;
            int cat = 0;
            int box = 0;
 
            int a = 0;
 
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j)!=(v.charAt(j))){
                    if(s.charAt(j) == '0'){
                        box++;
                    } 
                    else cat++;
                    count++;
                } 
 
                a = Math.min(cat, box);
 
            }
 
            //System.out.println("box "+box);
            //System.out.println("cat "+cat);
            System.out.println(count-a);
        }
 
    }
}