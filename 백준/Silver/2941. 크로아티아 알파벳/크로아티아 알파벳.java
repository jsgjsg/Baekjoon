import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char tmp[] = new char[2];
        int total = S.length();

        for(int i = 0; i < S.length(); i++) {
            char now = S.charAt(i);
            if( (tmp[1] == 'c' || tmp[1] == 'd') && now == '-') {
                total--;
            }else if(tmp[0] == 'd' && tmp[1] == 'z' && now == '=') {
                total -= 2;
            }else if(tmp[0] != 'd' && tmp[1] == 'z' && now == '=') {
                total--;
            }else if( (tmp[1] == 'l' || tmp[1] == 'n') && now == 'j') {
                total--;
            }else if( (tmp[1] == 's' || tmp[1] == 'c') && now == '=') {
                total--;
            }
            tmp[0] = tmp[1];
            tmp[1] = now;
        }
        System.out.println(total);
    }
}