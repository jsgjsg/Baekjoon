import java.io.*;

public class Main {
    static char[] par;
    static int top;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            par = new char[50];
            top = -1;

            String res = VPS(br.readLine());
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
    public static String VPS(String ps) {
        for(int i = 0; i < ps.length(); i++) {
            if(ps.charAt(i) == '(') par[++top] = '(';
            else if(ps.charAt(i) == ')') {
                if(top <= -1) return "NO";
                else top--;
            }
        }
        if(top == -1) return "YES";
        else return "NO";
    }
}