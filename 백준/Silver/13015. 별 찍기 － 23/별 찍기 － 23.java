import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String star = "*";

        sb.append(star.repeat(N)).append(" ".repeat(N * 2 - 3)).append(star.repeat(N)).append("\n");
        for(int i = 1; i < N - 1; i++) {
            sb.append(" ".repeat(i))
                    .append(star).append(" ".repeat(N - 2)).append(star)
                    .append(" ".repeat(N * 2 - 3 - i * 2))
                    .append(star).append(" ".repeat(N - 2)).append(star).append("\n");
        }
        sb.append(" ".repeat(N - 1))
                .append(star).append(" ".repeat(N - 2)).append(star)
                .append(" ".repeat(N - 2)).append(star).append("\n");
        for(int i = N - 2; i >= 1; i--) {
            sb.append(" ".repeat(i))
                    .append(star).append(" ".repeat(N - 2)).append(star)
                    .append(" ".repeat(N * 2 - 3 - i * 2))
                    .append(star).append(" ".repeat(N - 2)).append(star).append("\n");
        }
        sb.append(star.repeat(N)).append(" ".repeat(N * 2 - 3)).append(star.repeat(N)).append("\n");
        System.out.println(sb);
    }
}