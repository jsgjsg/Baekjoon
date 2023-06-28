import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String star = "*";

        for(int i = 0; i < N * 2 - 2; i++) {
            if(i % 2 == 0) {
                sb.append("* ".repeat(i / 2));
                sb.append(star.repeat(N * 4 - 3 - 2 * i)).append(" ");
                sb.append("* ".repeat(i / 2));
            }
            else {
                int a = i + 1;
                sb.append("* ".repeat(a / 2));
                sb.append(" ".repeat(N * 4 - 3 - 2 * a)).append(" ");
                sb.append("* ".repeat(a / 2));
            }
            sb.append("\n");
        }

        for(int i = 0; i < N * 4 - 3; i++) sb.append(i % 2 == 0 ? "*" : " ");
        sb.append("\n");

        for(int i = N * 2 - 3; i >= 0; i--) {
            if(i % 2 == 0) {
                sb.append("* ".repeat(i / 2));
                sb.append(star.repeat(N * 4 - 3 - 2 * i)).append(" ");
                sb.append("* ".repeat(i / 2));
            }
            else {
                int a = i + 1;
                sb.append("* ".repeat(a / 2));
                sb.append(" ".repeat(N * 4 - 3 - 2 * a)).append(" ");
                sb.append("* ".repeat(a / 2));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}