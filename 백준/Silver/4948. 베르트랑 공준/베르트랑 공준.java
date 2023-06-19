import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int M = Integer.parseInt(br.readLine());
            if(M == 0) break;
            int N = 2 * M;
            int count = 0;

            boolean[] prime = new boolean[N + 1];
            for(int i = 2; i <= N; i++) {
                if(prime[i] == false) {
                    for(int j = 2 * i; j <= N; j += i) {
                        prime[j] = true;
                    }
                    if(i > M) count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}