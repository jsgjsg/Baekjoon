import java.io.*;

public class Main {
    static char[] par;
    static int top;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if(s.charAt(0) == '.') break;

            par = new char[s.length()];
            top = -1;
            String res = VPS(s);
            sb.append(res).append("\n");
        }

        System.out.println(sb);
    }
    public static String VPS(String ps) {
        for(int i = 0; i < ps.length(); i++) {
            if(ps.charAt(i) == '(') {
                par[++top] = '(';
            } else if(ps.charAt(i) == ')') {
                if(top <= -1) return "no";
                else if(par[top] == '(') top--;
                else return "no";
            }
            else if(ps.charAt(i) == '[') {
                par[++top] = '[';
            } else if(ps.charAt(i) == ']') {
                if(top <= -1) return "no";
                else if(par[top] == '[') top--;
                else return "no";
            }
        }
        if(top == -1) return "yes";
        else return "no";
    }
}