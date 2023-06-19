import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        
        sb.append("a = ").append(st.nextToken()).append("\n");
        sb.append("b = ").append(st.nextToken());
        
        System.out.println(sb);
    }
}