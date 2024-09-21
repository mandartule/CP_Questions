import java.io.*;
import java.util.*;


public class A_Unit_Array {

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

                int ans = 0;
                int cnt = 0;
                int sum = 0;
                
                for(int i = 0; i<n; i++){

                    int curr = in.nextInt();

                    sum+= curr;
                    if(curr<0) cnt++;
                }

                if(cnt%2 == 0 && sum >=0) out.println(0);
                else if(cnt%2 == 1 && sum >= 0) out.println(1);
                else {

                    ans = (((sum*-1)+1)/2);

                    if(ans%2 == cnt%2) out.println(ans);
                    else out.println(ans+1);
                } 

                //out.println("-> "+cnt+" "+sum+"   "+ans+" ");
                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}