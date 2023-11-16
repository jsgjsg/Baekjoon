import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'A' + 1).append(" ");
        }

        System.out.println(sb);
    }
}