import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] org = new int[N];
        int[] co = new int[N];
        for(int i = 0; i < N; i++) {
            org[i] = co[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(co);

        int R = 0;
        HashMap<Integer, Integer> rank = new HashMap<>();

        for(int i: co) {
            if(!rank.containsKey(i)) {
                rank.put(i, R);
                R++;
            }
        }
        for(int i: org) {
            int val = rank.get(i);
            sb.append(val).append(" ");
        }

        System.out.println(sb);
    }
}