import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max;
        int other;
        if(a > b && a > c) {
            max = a;
            other = b + c;
        }
        else if(b > a && b > c) {
            max = b;
            other = a + c;
        }
        else if(c > a && c > b) {
            max = c;
            other = a + b;
        }
        else {
            max = 0;
            other = a + b + c;
        }

        if(max >= other) System.out.println(other * 2 - 1);
        else System.out.println(max + other);
    }
}