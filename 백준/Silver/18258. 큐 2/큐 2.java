import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] queue = new int[2000000];
    static int front = 0;
    static int back = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
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
    public static int empty() {
        if(front > back) return 1;
        else return 0;
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