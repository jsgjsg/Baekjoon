import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] area = new boolean[100][100];
        int S = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    if(area[x + j][y + k] == false) {
                        area[x + j][y + k] = true;
                        S++;
                    }
                }
            }
        }
        System.out.println(S);
    }
}