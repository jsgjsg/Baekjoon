import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int side = 2;
        for(int i = 0; i < N; i++) {
            side = side * 2 - 1;
        }

        System.out.println((int)Math.pow(side, 2));
    }
}