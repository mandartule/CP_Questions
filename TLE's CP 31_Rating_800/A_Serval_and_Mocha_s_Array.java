import java.io.*;
import java.util.*;


public class A_Serval_and_Mocha_s_Array {

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
            int n=in.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=in.nextInt();
            }
            boolean flag=false;
            for(int i=0 ; i<n; i++){
                for( int j=i+1; j<n; j++){

                    if(gcd(arr[i],arr[j])<=2){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
                
            }
            if(flag){
               out.println("Yes");
            }else{
               out.println("No");
            }

                
                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    public static int gcd(int a,int b){
        // euclidean algorithm
 
        if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
}