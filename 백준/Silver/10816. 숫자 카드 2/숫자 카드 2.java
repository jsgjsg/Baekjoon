import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> card = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int inputNum = Integer.parseInt(st.nextToken());
            if(card.containsKey(inputNum)) {
                int count = card.get(inputNum);
                card.put(inputNum, count + 1);
            } else {
                card.put(inputNum, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(card.containsKey(num)) sb.append(card.get(num)).append(" ");
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}