import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            sb.append(getC(N, K)).append("\n");
        }
        System.out.println(sb);
    }
    public static int getC(int N, int K) {
        if(arr[N][K] != 0) return arr[N][K];

        if(N == K || K == 0) {
            arr[N][K] = 1;
        }else {
            arr[N][K] = getC(N - 1, K - 1) + getC(N - 1, K);
        }

        return arr[N][K];
    }
}