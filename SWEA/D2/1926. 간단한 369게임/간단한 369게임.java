import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            int cur = i;
            int clap = 0;
            while(cur != 0) {
                int a = cur % 10; // a : i의 일의자리 수
                if(a == 3 || a == 6 || a == 9) clap++;
                cur /= 10;
            }
            if(clap == 0) sb.append(i);
            else for(int j = 0; j < clap; j++) {
                sb.append("-");
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}