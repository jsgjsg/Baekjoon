import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            String space = " ";
            String star = "*";
            sb.append(space.repeat(N - i)).append(star.repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}