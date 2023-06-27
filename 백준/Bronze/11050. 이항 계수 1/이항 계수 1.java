import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][K + 1];

        int result = getC(N, K);

        System.out.println(result);
    }
    public static int getC(int N, int K) {
        if(N == K || K == 0) {
            arr[N][K] = 1;
        }else {
            arr[N][K] = getC(N - 1, K - 1) + getC(N - 1, K);
        }

        return arr[N][K];
    }
}