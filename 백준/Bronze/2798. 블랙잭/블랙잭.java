import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] card = new int[N];
        for(int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(sum > max && sum <= M) max = sum;
                }
            }
        }
        System.out.println(max);
    }
}