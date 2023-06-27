import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] deque;
    static int front;
    static int back;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] popIndex = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            popIndex[i] = Integer.parseInt(st.nextToken());
        }

        deque = new int[N * (N + 1)];
        front = N * N / 2;
        back = N * N / 2 - 1;

        for(int i = 1; i <= N; i++) {
            push_back(i);
        }

        int count = 0;
        for(int i = 0; i < M; i++) {
            int ForB = 0;
            boolean left = true;
            for(int j = front; j <= back; j++) {
                if(deque[j] == popIndex[i]) ForB = j - front;
            }
            if(ForB > size() / 2) left = false;

            if(left) {
                for(int j = 0; j < ForB; j++) {
                    moveLeft();
                    count++;
                }
            }
            else {
                for(int j = 0; j < size() - ForB; j++) {
                    moveRight();
                    count++;
                }
            }
            int a = pop_front();
        }
        System.out.println(count);
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
    public static void moveLeft() {
        int n = pop_front();
        push_back(n);
    }
    public static void moveRight() {
        int n = pop_back();
        push_front(n);
    }
}