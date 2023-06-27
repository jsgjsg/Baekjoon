import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = fibonacci(N);
        System.out.println(result);
    }
    public static int fibonacci(int N) {
        if(N == 0) return 0;
        else if(N == 1) return 1;
        else return fibonacci(N - 2) + fibonacci(N - 1);
    }
}