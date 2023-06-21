import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String star = "*";
        for(int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i)).append(star);
            if(i == 1) {
                sb.append("\n");
                continue;
            }
            sb.append(" ".repeat(i * 2 - 3)).append(star).append("\n");
        }


        System.out.println(sb);
    }
}