import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double M = 1;
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if(score[i] > M) {
                M = score[i];
            }
        }
        double sum = 0;
        for(int i = 0; i < N; i++) {
            sum += score[i] / M * 100;
        }
        System.out.println(sum / N);
    }
}