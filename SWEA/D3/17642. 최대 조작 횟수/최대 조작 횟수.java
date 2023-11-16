import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            if(A == B) {
                sb.append(0).append("\n");
                continue;
            }

            long d = B - A;
            if(d <= 1) {
                sb.append(-1).append("\n");
                continue;
            }

            sb.append(d / 2).append("\n");
        }
        System.out.println(sb);
    }
}