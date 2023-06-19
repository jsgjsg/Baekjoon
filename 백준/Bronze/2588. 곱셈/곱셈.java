import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int result3 = num1 * (num2 % 10);
        int result4 = num1 * (num2 / 10 % 10);
        int result5 = num1 * (num2 / 100 % 10);
        int result6 = result3 + result4 * 10 + result5 * 100;

        sb.append(result3).append("\n");
        sb.append(result4).append("\n");
        sb.append(result5).append("\n").append(result6);
        System.out.println(sb);
    }
}