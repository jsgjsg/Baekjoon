import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] N = new int[9];

        int max = 0;
        int count = -1;

        for (int i = 0; i < 9; i++) {
            N[i] = Integer.parseInt(br.readLine());

            if (N[i] > max) {
                max = N[i];
                count = i + 1;
            }
        }
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(count));
        bw.flush();

        bw.close();
        br.close();
    }
}