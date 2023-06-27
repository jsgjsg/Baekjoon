import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] deque;
    static int front;
    static int back;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        deque = new int[2 * N];
        front = N;
        back = N - 1;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
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
    public static void push_front(int X) {
        deque[--front] = X;
    }
    public static void push_back(int X) {
        deque[++back] = X;
    }
    public static int pop_front() {
        if(empty() == 1) return -1;
        return deque[front++];
    }
    public static int pop_back() {
        if(empty() == 1) return -1;
        return deque[back--];
    }
    public static int size() {
        return back - front + 1;
    }
    public static int empty() {
        if(front > back) return 1;
        else return 0;
    }
    public static int front() {
        if(empty() == 1) return -1;
        return deque[front];
    }
    public static int back() {
        if(empty() == 1) return -1;
        return deque[back];
    }
}