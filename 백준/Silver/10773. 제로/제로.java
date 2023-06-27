import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        int[] stack = new int[100000];
        int top = -1;
        int sum = 0;

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) sum -= stack[top--];
            else sum += stack[++top] = num;
        }
        System.out.println(sum);
    }
}