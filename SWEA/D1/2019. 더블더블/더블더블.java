import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int a = 1;
        for(int i = 0; i <= N; i++) {
            sb.append(a).append(" ");
            a *= 2;
        }
        System.out.println(sb);
    }
}