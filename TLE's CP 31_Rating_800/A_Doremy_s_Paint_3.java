import java.io.*;
import java.util.*;


public class A_Doremy_s_Paint_3 {

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

                HashMap<Integer,Integer> map = new HashMap<>();

                for(int i = 0; i<n; i++){
                    int curr = in.nextInt();
                    map.put(curr,map.getOrDefault(curr,0)+1);
                }
                if(map.size() == 1)out.println("Yes");
                else if(map.size()>2) out.println("No");
                else{
                     int a = 0,b = 0;
                    for(int i : map.values()){
                     b = a;
                     a = i;
                     
                    }
                    //out.print(a+" "+b+" ");
                    if(n%2 == 0 && a == b)out.println("Yes");
                    else if(n%2 == 1 && Math.abs(a-b) == 1) out.println("Yes");
                    else out.println("No");
                }
               

            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}