import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
        }
        sorting(num);
        System.out.println(sum / 5);
        System.out.println(num[2]);
    }
    public static void sorting(int[] sort) {
        for(int i = 0; i < sort.length - 1; i++) {
            for(int j = 0; j < sort.length - 1; j++) {
                if(sort[j] > sort[j + 1]) {
                    int tmp = sort[j + 1];
                    sort[j + 1] = sort[j];
                    sort[j] = tmp;
                }
            }
        }
    }
}