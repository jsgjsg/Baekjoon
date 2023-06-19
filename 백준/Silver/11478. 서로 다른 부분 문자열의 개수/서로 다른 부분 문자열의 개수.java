import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int len = S.length();
        HashSet<String> str = new HashSet<>();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len - i; j++) {
                String tmp = S.substring(i, i + j + 1);
                if(!str.contains(tmp)) {
                    str.add(tmp);
                }
            }
        }

        System.out.println(str.size());
    }
}