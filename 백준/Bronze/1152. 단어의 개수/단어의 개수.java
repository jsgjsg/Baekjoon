import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());

        int count = 0;
        while(st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}