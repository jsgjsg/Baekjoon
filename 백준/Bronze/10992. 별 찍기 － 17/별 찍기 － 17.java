import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String star = "*";
        sb.append(" ".repeat(N - 1)).append(star).append("\n");
        for(int i = 2; i < N; i++) {
            sb.append(" ".repeat(N - i)).append(star);
            sb.append(" ".repeat(i * 2 - 3)).append(star);
            sb.append("\n");
        }
        if(N > 1) sb.append(star.repeat(N * 2 - 1));

        System.out.println(sb);
    }
}