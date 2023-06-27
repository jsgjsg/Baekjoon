import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] queue;
    static int N;
    static int front;
    static int back;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            queue = new int[N * N][2];
            front = 0;
            back = -1;

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                push(Integer.parseInt(st.nextToken()), j);
            }

            int count = 0;
            while(true) {
                int n = queue[front][0];
                int index = queue[front][1];
                pop();
                boolean print = true;
                for(int j = front; j <= back; j++) {
                    if(n < queue[j][0]) {
                        push(n, index);
                        print = false;
                        break;
                    }
                }
                if(print) {
                    count++;
                    if(index == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
    public static void push(int n, int index) {
        queue[++back][0] = n;
        queue[back][1] = index;
    }
    public static void pop() {
        front++;
    }
}