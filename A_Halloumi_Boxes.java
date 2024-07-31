import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import java.util.*;

/**
 * A_Halloumi_Boxes
 */
public class A_Halloumi_Boxes {

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

            int testCases=in.nextInt();
            
            while(testCases-- > 0){

                //Your code goes here .....
                int n = in.nextInt();
                int k = in.nextInt();

                int arr[] = new int[n];
                for(int i = 0; i<n; i++){
                    arr[i] = in.nextInt();
                }

                Sy
                // for(int i: arr)out.print(i+" ");

                
                
                //out.println(n+" "+k+" ");
                if(k>1) out.println("YES");
                else {
                    int i;
                    for(i = 0; i<n-1; i++){
                        if(arr[i]>arr[i+1]){
                            out.println("NO");
                            break;
                        }
                    }
                    if(i == n-1)
                     out.println("YES");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}