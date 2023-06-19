import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if(c >= 'a') sb.append((char)(c - 'a' + 'A'));
            else sb.append((char)(c - 'A' + 'a'));
        }
        
        System.out.println(sb);
    }
}