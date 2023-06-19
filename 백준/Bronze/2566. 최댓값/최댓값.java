import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int row = 0;
        int col = 0;
        int[][] matrix = new int[9][9];

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(matrix[i][j] >= max) {
                    max = matrix[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        sb.append(max).append("\n").append(row).append(" ").append(col);
        System.out.println(sb);
    }
}