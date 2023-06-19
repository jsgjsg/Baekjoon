import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N + 1];
        for(int i = 2; i <= N; i++) {
            if(prime[i] == false) {
                for(int j = 2 * i; j <= N; j += i) {
                    prime[j] = true;
                }
                if(i >= M) sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}