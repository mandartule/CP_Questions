import java.io.*;
import java.util.*;


public class A_United_We_Stand {

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

                int arr[] = new int[n];
                for(int i = 0; i<n; i++) arr[i] = in.nextInt();

                Arrays.sort(arr);

                if(arr[0] == arr[n-1]) out.println(-1);
                else{

                    int i = 0;
                    while(i<n && arr[0] == arr[i]) i++;

                    out.println(i+" "+(n-i));
                    for(int j = 0; j<i; j++) out.print(arr[j]+" ");
                    out.println("");
                    for(int j = i; j<n; j++) out.print(arr[j]+" ");
                    out.println("");
                }
                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}