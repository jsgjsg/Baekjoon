import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T  = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) num[i] = Integer.parseInt(st.nextToken());

            int max  = Integer.MIN_VALUE;
            for(int i = 1; i < N; i++) {
                if(num[i - 1] > 0) num[i] += num[i - 1];
                max = Math.max(num[i], max);
            }
            max = Math.max(num[0], max);
            sb.append("#").append(t).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
    }
}