import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case).append("\n");
            int N = Integer.parseInt(br.readLine());
            int[][] pascal = new int[N + 1][N + 1];
            pascal[0][0] = 1;
            for(int i = 1; i <= N; i++) {
                for(int j = 1; j <= i; j++) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    sb.append(pascal[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}