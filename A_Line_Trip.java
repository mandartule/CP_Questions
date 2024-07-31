
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.*;

public class A_Line_Trip {

 static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {

            FastReader in=new FastReader();
            FastWriter out = new FastWriter();

            //int testCases=in.nextInt();

            Scanner sc = new Scanner(System.in);
            int testCases = sc.nextInt();
            
            while(testCases-- > 0){
                //Your code goes here .....

                int n = sc.nextInt();
                int x = sc.nextInt();

                int arr[] = new int[n];
                for(int i = 0; i<n; i++)arr[i] = sc.nextInt();

                int max = (x-arr[n-1])*2;
                int prev = 0;

                for(int i = 0; i<n; i++){

                    max = Math.max(arr[i]-prev,max);
                    prev = arr[i];
                }
                
                System.out.println(max);                
           
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}