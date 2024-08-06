import java.io.*;
import java.util.*;


public class A_Don_t_Try_to_Count {

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
                int m = in.nextInt();

                String x = in.nextLine();
                String s = in.nextLine();
                
                int cnt = 0;

                if(x.contains(s)) out.println(cnt);
                else{

                  
                    int i = 5;
                    while(i>0){
                        
                        if(x.contains(s)) break;
                        x = x+x;
                        cnt++;

                        
                        i--;
                    } 

                    
                    if(x.contains(s)) out.println(cnt);
                    else  out.println(-1);

                }
                
            }

            out.close();
        } catch (Exception e) {
            return;
        }
    }
}