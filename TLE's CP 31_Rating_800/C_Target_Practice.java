import java.io.*;
import java.util.*;


public class C_Target_Practice {

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

                ArrayList<int[]> list = new ArrayList<>();

                for(int i = 0; i<10; i++){
                    String s = in.nextLine();
                    for(int j = 0; j<10; j++){
                        char ch = s.charAt(j);
                        if(ch == 'X'){
                            list.add(new int[]{i,j});
                        }
                    }
                }

                int ans = 0;

                for(int i[] : list){

                    
                    
                    int row = i[0];
                    int col = i[1];

                    
                    //out.print(row+" "+col+" ");
                    row = row>4 ? row-2*(row-4)+1 : row;
                    col = col>4 ? col-2*(col-4)+1 : col;

                   //out.print(row+" "+col+" ");
                    int curr = 0;
                    if(row+col == 8) curr = 5;
                    else if((row>=3 && row <= 4) && (col >= 3 && col <= 4) ) curr= 4;
                    else if((row>=2 && row <= 4) && (col >= 2 && col <= 4) ) curr= 3;
                    else if((row>=1 && row <= 4) && (col >= 1 && col <= 4) ) curr= 2;
                    else if((row>=0 && row <= 4) && (col >= 0 && col <= 4) ) curr= 1;

                    //out.println(curr);
                    ans+=curr;
                }
                

                out.println(ans);
                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}