import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] queue;
    static int front = 0;
    static int back = -1;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        queue = new int[N * K];

        for(int i = 1; i <= N; i++) {
            push(i);
        }

        int dump = 1;
        sb.append("<");
        while(size() > 1) {
            if(dump % K != 0) push(front());
            else sb.append(front()).append(", ");
            pop();
            dump++;
        }
        sb.append(front()).append(">");
        System.out.println(sb);
    }
    public static void push(int n) {
        queue[++back] = n;
    }
    public static int pop() {
        if(front > back) return -1;
        return queue[front++];
    }
    public static int size() {
        return back - front + 1;
    }
    public static int front() {
        if(front > back) return -1;
        return queue[front];
    }
    public static int back() {
        if(front > back) return -1;
        return queue[back];
    }
}