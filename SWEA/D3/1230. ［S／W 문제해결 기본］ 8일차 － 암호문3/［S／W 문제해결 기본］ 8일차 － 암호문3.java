import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList code = new ArrayList();

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                code.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++) {
                String cmd = st.nextToken();
                if(cmd.equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for(int idx = x; idx < x + y; idx++) {
                        code.add(idx, Integer.parseInt(st.nextToken()));
                    }
                } else if(cmd.equals("D")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for(int count = 0; count < y; count++) {
                        code.remove(x);
                    }
                } else if(cmd.equals("A")) {
                    int y = Integer.parseInt(st.nextToken());
                    for(int count = 0; count < y; count++) {
                        code.add(Integer.parseInt(st.nextToken()));
                    }
                }
            }
            sb.append("#").append(t).append(" ");
            for(int i = 0; i < 10; i++) sb.append(code.get(i)).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}