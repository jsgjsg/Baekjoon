import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int change = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] WorB = new char[N][M];
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                WorB[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i <= M - 8; i++) {
            for(int j = 0; j <= N - 8; j++) {
                check(WorB, i, j);
            }
        }
        System.out.println(change);
    }
    public static void check(char[][] WorB, int startX, int startY) {
        int countB = 0;
        int countW = 0;
        for(int i = startY; i < startY + 8; i++) {
            for(int j = startX; j < startX + 8; j++) {
                if((i + j) % 2 == 0) {
                    if(WorB[i][j] == 'B') countW++;
                    else countB++;
                } else {
                    if(WorB[i][j] == 'W') countW++;
                    else countB++;
                }
            }
        }
        int min = Math.min(countB, countW);
        if(min < change) change = min;
    }
}