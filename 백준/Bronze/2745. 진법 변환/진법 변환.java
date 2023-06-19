import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        for(int i = 0; i < N.length(); i++) {
            int num = N.charAt(i);

            if(num >= 'A' && num <= 'Z') num = num - 'A' + 10; //문자일 경우 수로 변환
            else if(num >= '0' && num <= '9') num -= '0'; //숫자일 경우 실제 값으로 변환

            result += Math.pow(B, N.length() - i - 1) * num;

        }
        System.out.println(result);
    }
}