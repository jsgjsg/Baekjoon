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

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            deque = new int[n];
            front = 0;
            back = -1;

            String arr = br.readLine();
            arr = arr.substring(1, arr.length() - 1);
            st = new StringTokenizer(arr, ",");

            for(int j = 0; j < n; j++) {
                push_back(Integer.parseInt(st.nextToken()));
            }

            boolean error = false;
            boolean ForB = true; // front : true
            for(int j = 0; j < p.length(); j++) {
                char cal = p.charAt(j);
                if(cal == 'D') {
                    if(empty() == 1) {
                        error = true;
                        break;
                    }

                    if(ForB) pop_front();
                    else pop_back();
                } else if(cal == 'R') {
                    ForB = !ForB;
                }
            }

            // 출력
            if(error) sb.append("error\n");
            else if(empty() == 1) sb.append("[]\n");
            else {
                sb.append("[");
                while(empty() != 1) {
                    if(ForB) sb.append(pop_front()).append(",");
                    else sb.append(pop_back()).append(",");
                }
                sb.setLength(sb.length() - 1);
                sb.append("]\n");
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