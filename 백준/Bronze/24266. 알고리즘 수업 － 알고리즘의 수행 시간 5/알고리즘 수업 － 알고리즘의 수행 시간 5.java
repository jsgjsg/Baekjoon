import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(n * n * n).append("\n3");
        System.out.println(sb);
    }
}