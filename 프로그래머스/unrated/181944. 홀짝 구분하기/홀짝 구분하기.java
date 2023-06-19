import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        if(n % 2 == 0) sb.append(" is even");
        else sb.append(" is odd");
        
        System.out.println(sb);
    }
}