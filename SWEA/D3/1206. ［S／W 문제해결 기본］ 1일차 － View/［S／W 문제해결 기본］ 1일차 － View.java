import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] building = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= N; i++) building[i] = Integer.parseInt(st.nextToken());

            int count = 0;
            for(int i = 3; i <= N - 2; i++) {
                int maxL = Math.max(building[i - 2], building[i - 1]);
                int maxR = Math.max(building[i + 1], building[i + 2]);
                int max = Math.max(maxL, maxR);

                if(building[i] > max) count += building[i] - max;
            }

            sb.append("#").append(t).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}