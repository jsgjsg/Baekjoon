import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] remain = new boolean[42];
        int count = 0;

        for(int i = 0; i < 10; i++) {
            remain[Integer.parseInt(br.readLine())%42] = true;
        }
        for(int i = 0; i < 42; i++) {
            if(remain[i]) count++;
        }

        System.out.println(count);
    }
}