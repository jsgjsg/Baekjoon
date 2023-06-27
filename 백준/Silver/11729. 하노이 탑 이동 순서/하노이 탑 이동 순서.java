import java.io.*;

public class Main {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 2, 3);

        System.out.println(count);
        System.out.println(sb);
    }
    public static void hanoi(int N, int start, int tmp, int end) {
        if(N == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            count++;
        } else {
            hanoi(N - 1, start, end, tmp);
            hanoi(1, start, tmp, end);
            hanoi(N - 1, tmp, start, end);
        }
    }
}