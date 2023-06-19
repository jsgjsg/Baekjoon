import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());

        int index = 0;
        int count = 0;

        for(int i = 1; i <= 4472; i++) {
            if(X <= i * (i + 1) / 2) {
                index = i;
                count = X - (i - 1) * i / 2;
                break;
            }
        }

        if(index % 2 == 0) sb.append(count).append("/").append(index - count + 1);
        else sb.append(index - count + 1).append("/").append(count);

        System.out.println(sb);
    }
}