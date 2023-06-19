import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String s;

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            if(st.hasMoreTokens()) {
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                sb.append(A + B).append("\n");
            } else break;
        }
        System.out.println(sb);
    }
}