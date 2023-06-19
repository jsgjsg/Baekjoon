import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int king = 1 - Integer.parseInt(st.nextToken());
        int queen = 1 - Integer.parseInt(st.nextToken());
        int rook = 2 - Integer.parseInt(st.nextToken());
        int bishop = 2 - Integer.parseInt(st.nextToken());
        int knight = 2 - Integer.parseInt(st.nextToken());
        int pawn = 8 - Integer.parseInt(st.nextToken());

        sb.append(king).append(" ");
        sb.append(queen).append(" ");
        sb.append(rook).append(" ");
        sb.append(bishop).append(" ");
        sb.append(knight).append(" ");
        sb.append(pawn);
        System.out.println(sb);
    }
}