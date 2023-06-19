import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int result1 = (A + B) % C;
        int result2 = ((A % C) + (B % C)) % C;
        int result3 = (A * B) % C;
        int result4 = ((A % C) * (B % C)) % C;
        
        sb.append(result1).append("\n");
        sb.append(result2).append("\n");
        sb.append(result3).append("\n");
        sb.append(result4);
        System.out.println(sb);
    }
}