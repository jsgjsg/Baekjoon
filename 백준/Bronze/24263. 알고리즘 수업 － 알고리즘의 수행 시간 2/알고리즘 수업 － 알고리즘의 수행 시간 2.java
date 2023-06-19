import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        sb.append(n).append("\n1");
        System.out.println(sb);
    }
}