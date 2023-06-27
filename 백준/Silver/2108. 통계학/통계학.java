import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max) max = num;
            if(num < min) min = num;

            sum += num;
            count[num + 4000]++;
        }
        double average = sum * 1.0 / N;
        sb.append(Math.round(average)).append("\n");

        int countMax = 0;
        boolean dup = false;
        int maxIndex = -1;
        int midCount = 0;
        int midIndex = -1;
        for(int i = 0; i < 8001; i++) {
            if(midCount < N / 2 + 1) {
                midCount += count[i];
                midIndex = i;
            }

            if(count[i] > countMax) {
                countMax = count[i];
                dup = false;
                maxIndex = i;
            } else if(count[i] == countMax && dup == false) {
                dup = true;
                maxIndex = i;
            }
        }
        sb.append(midIndex - 4000).append("\n");
        sb.append(maxIndex - 4000).append("\n");
        sb.append(max - min);

        System.out.println(sb);
    }
}