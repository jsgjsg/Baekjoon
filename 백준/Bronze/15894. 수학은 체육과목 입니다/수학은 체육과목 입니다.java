import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long result = Long.parseLong(br.readLine()) * 4;
        System.out.println(result);
    }
}