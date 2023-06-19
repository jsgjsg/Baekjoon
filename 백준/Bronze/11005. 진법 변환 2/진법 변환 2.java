import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while(N != 0) {
            int r = N % B;
            if(r < 10) sb.append(r);
            else {
                char c = (char) (r - 10 + 'A'); // 아스키 코드를 사용
                sb.append(c);
            }
            N /= B;
        }
        sb.reverse();
        System.out.println(sb);
    }
}