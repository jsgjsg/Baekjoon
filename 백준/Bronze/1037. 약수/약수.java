import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int max = 2, min = 1000000;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp > max) max = tmp;
            if(tmp < min) min = tmp;
        }
        System.out.println(max * min);
    }
}