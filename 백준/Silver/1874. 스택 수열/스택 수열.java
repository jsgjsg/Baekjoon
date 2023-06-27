import java.io.*;

public class Main {
    static int[] stack = new int[100000];
    static int top = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        for(int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }

        int pushNum = 1;
        int index = 0;
        boolean pop = false;
        while(index < seq.length) {
            if(!pop || top == -1) {
                push(pushNum++);
                sb.append("+\n");
            }

            if(stack[top] == seq[index]) {
                pop();
                sb.append("-\n");
                index++;
                pop = true;
            } else if(stack[top] > seq[index]) {
                sb.setLength(0);
                sb.append("NO");
                break;
            } else pop = false;
        }

        System.out.println(sb);
    }
    public static void push(int n) {
        stack[++top] = n;
    }
    public static int pop() {
        return stack[top--];
    }
}