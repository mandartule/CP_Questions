import java.io.*;
import java.util.*;

public class C_1_Skibidus_and_Fanum_Tax_easy_version {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
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

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int testCases = in.nextInt();
        while (testCases-- > 0) {

            int n = in.nextInt();
            int m = in.nextInt(); // m is 1

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int j = in.nextInt(); // b has one element

            boolean possible = true;
            if (n == 0) {
                out.println("YES");
                continue;
            }

            // Start processing from the last element
            int nextVal = Math.max(a[n - 1], j - a[n - 1]);

            for (int i = n - 2; i >= 0; i--) {

                int current = a[i];
                int flip = j - current;
                int best = -1;

                // Check both options
                boolean canCurrent = current <= nextVal;
                boolean canFlip = flip <= nextVal;

                if (canCurrent && canFlip) {
                    best = Math.max(current, flip);
                } 
                else if (canCurrent) best = current;
                else if (canFlip)  best = flip;
                else {
                    possible = false;
                    break;
                }

                nextVal = best;
            }

            if (possible) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

        out.close();
    }
}