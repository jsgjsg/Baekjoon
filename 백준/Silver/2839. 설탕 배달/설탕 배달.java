import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while(N != 0) {
            if(N % 5 != 0 && N % 3 != 0) {
                N -= 5;
                if(N < 0) {
                    count = -1;
                    N = 0;
                }else {
                    count++;
                }
            } else {
                if(N % 5 == 0) {
                    count += N / 5;
                    N = 0;
                }else {
                    if(N >= 15) {
                        count += 3;
                        N -= 15;
                    } else {
                        count += N / 3;
                        N = 0;
                    }
                }
            }
        }
        System.out.println(count);
    }
}