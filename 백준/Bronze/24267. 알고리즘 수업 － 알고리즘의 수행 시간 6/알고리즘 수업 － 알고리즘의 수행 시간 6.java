import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long ans = (long) n * (n - 1) * (n - 2) / 6;

        StringBuilder sb = new StringBuilder();
        sb.append(ans).append("\n3");
        System.out.println(sb);
    }
}