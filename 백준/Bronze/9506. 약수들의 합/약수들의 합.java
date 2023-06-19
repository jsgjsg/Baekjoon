import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) break;

            sb.append(perfect(n)).append("\n");
        }
        System.out.println(sb);
    }
    public static String perfect(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        sb.append(n).append(" = ");
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
                sb.append(i).append(" + ");
            }
        }
        String res = sb.substring(0, sb.length() - 3);

        if(sum == n) return res;
        else return n + " is NOT perfect.";
    }

}