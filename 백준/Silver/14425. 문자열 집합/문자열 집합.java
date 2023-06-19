import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static String[] S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        S = new String[N];
        for(int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        int count = 0;
        for(int i = 0; i < M; i++) {
            if(checking(br.readLine())) count++;
        }
        System.out.println(count);
    }
    public static boolean checking(String str) {
        for(int i = 0; i < N; i++) {
            if(S[i].equals(str)) return true;
        }
        return false;
    }
}