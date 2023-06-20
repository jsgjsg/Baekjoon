import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String star = "*";
        for(int i = 1; i < N; i++) {
            sb.append(star.repeat(i)).append("\n");
        }
        for(int i = N; i >= 1; i--) {
            sb.append(star.repeat(i)).append("\n");
        }

        System.out.println(sb);
    }
}