import java.io.*;
import java.util.*;


public class A_Make_it_Beautiful {

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

                int n=in.nextInt();
                int arr[] = new int[n];

                boolean flag = true;
                int prev = 0;

                for(int i = 0; i<n; i++){

                    arr[i] = in.nextInt();

                    if(i != 0 && prev != arr[i]) flag = false;
                        
                    prev = arr[i];
                    
                } 

                if(flag) out.println("NO");
                else{
                    int temp = arr[1];
                    arr[1] = arr[arr.length-1];
                    arr[arr.length-1] = temp;

                    out.println("YES");
                    for(int i : arr) out.print(i+" ");
                    out.println("");
                }

                
                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    
}