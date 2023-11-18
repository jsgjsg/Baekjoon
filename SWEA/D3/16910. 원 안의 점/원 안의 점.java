import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T  = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int ans = 0;
            for(int x = 0; x <= N; x++) {
                for(int y = 1; y <= N; y++) {
                    if(x * x + y * y <= N * N) ans++;
                }
            }
            ans *= 4;
            ans += 1;

            sb.append("#").append(t).append(" ").append(ans).append("\n");
        }
        System.out.println(sb);
    }
}