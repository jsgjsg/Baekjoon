import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T;
        T=Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            double sum = 0;
            int avg = 0;
            for(int i = 0; i < 10; i++) {
                sum += Integer.parseInt(st.nextToken());
                avg = (int)Math.round(sum / 10);
            }
            sb.append("#").append(test_case).append(" ").append(avg).append("\n");
        }
        System.out.println(sb);
    }
}