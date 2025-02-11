import java.io.*;
import java.util.*;

public class A_Forked {

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

    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();

            int testCases = in.nextInt();

            while (testCases-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();

                int kx = in.nextInt();
                int ky = in.nextInt();

                int qx = in.nextInt();
                int qy = in.nextInt();

                Set<String> kingAttacks = new HashSet<>();
                Set<String> queenAttacks = new HashSet<>();

                // Generate all possible attack positions for the king
                addPositions(kx, ky, a, b, kingAttacks);
                addPositions(kx, ky, b, a, kingAttacks);

                // Generate all possible attack positions for the queen
                addPositions(qx, qy, a, b, queenAttacks);
                addPositions(qx, qy, b, a, queenAttacks);

                int ans = 0;
                for (String pos : kingAttacks) {
                    if (queenAttacks.contains(pos)) {
                        ans++;
                    }
                }
                // out.print(kingAttacks);
                // out.println(queenAttacks);
                out.println(ans);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addPositions(int x, int y, int a, int b, Set<String> set) {
        set.add((x + a) + "," + (y + b));
        set.add((x + a) + "," + (y - b));
        set.add((x - a) + "," + (y + b));
        set.add((x - a) + "," + (y - b));
    }
}