import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] numCount = new int[10];
        for(int i = 0; i < s.length(); i++) {
            numCount[s.charAt(i) - 48]++;
        }

        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < numCount[i]; j++) {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}