import java.io.*;
import java.util.*;

public class Solution {
    static int range = 10_000_000;
    static boolean[] isPrime = new boolean[range + 1];
    static ArrayList<Integer> prime = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        findPrime();
        ArrayList<Integer> needs;

        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++) {
            int A = Integer.parseInt(br.readLine());
            needs = new ArrayList<>();

            for(int idx = 0; idx < prime.size(); idx++) {
                int i = prime.get(idx);
                if(isPrime[i]) continue;

                int count = 0;
                while(A % i == 0) {
                    A /= i;
                    count++;
                }
                if(count % 2 == 1) needs.add(i);

                if(A == 1 || i > A) break; // Math.sqrt(10^7)보다 큰 소수는 알 수 없다.
            }
            int ans = 1;
            while(!needs.isEmpty()) {
                ans *= needs.remove(0);
            }
            if(A > 1) ans *= A;
            sb.append("#").append(t).append(" ").append(ans).append("\n");
        }
        System.out.println(sb);
    }
    static void findPrime() {
        isPrime[0] = isPrime[1] = true;
        for(int i = 2; i <= Math.sqrt(range); i++) {
            if(isPrime[i]) continue;
            else prime.add(i);
            for(int j = i * i; j <= range; j += i) {
                if(!isPrime[j]) isPrime[j] = true;
            }
        }
    }
}