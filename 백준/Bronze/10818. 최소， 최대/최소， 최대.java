import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num > max) max = num;
            if(num < min) min = num;
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}