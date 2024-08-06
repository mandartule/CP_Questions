import java.util.*;
 
public class areaOfSquare {
 
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
 
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
 
            for(int j = 0; j<3; j++){
                int m = sc.nextInt();
            }
 
            int a;
            if(x1 != x2){
                 a = x2 - x1;
            }else{
                 a = x3 - x1;
            }
            
            //int b = y2 - y1;
 
            //double sideLength = Math.sqrt((a * a) + (b * b));
           // double area = sideLength;
            //System.out.println(y1);
            //System.out.println(x1+" "+y1+" "+x2+" "+y2);
            System.out.println(a*a);
        }
 
    }
}