import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[N][N];
        star(arr, N, 0, 0);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(arr[i][j]) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void star(boolean[][] arr, int N, int Sx, int Sy) {
        for(int i = N / 3; i < N * 2 / 3; i++) {
            for(int j = N / 3; j < N * 2 / 3; j++) {
                arr[i + Sx][j + Sy] = true;
            }
        }
        if(N != 3) {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    star(arr, N / 3, Sx + N * i / 3, Sy + N * j / 3);
                }
            }
        }
    }
}