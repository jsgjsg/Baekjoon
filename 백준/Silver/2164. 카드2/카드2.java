import java.io.*;

public class Main {
    static int[] queue;
    static int front = 0;
    static int back = -1;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        queue = new int[N * 2];

        for(int i = 1; i <= N; i++) {
            push(i);
        }

        boolean dump = true;
        while(size() > 1) {
            if(!dump) push(front());
            pop();
            dump = !dump;
        }
        System.out.println(front());
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