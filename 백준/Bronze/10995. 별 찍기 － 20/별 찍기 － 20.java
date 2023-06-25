import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("* ".repeat(N));
        String pattern = sb.toString();

        sb.setLength(0);
        for(int i = 0; i < N; i++) {
            if(i % 2 == 1) sb.append(" ");
            sb.append(pattern).append("\n");
        }

        System.out.println(sb);
    }
}