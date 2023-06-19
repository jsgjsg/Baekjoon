import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        if(num1 % 400 == 0) System.out.println(1);
        else if(num1 % 100 == 0) System.out.println(0);
        else if(num1 % 4 == 0) System.out.println(1);
        else System.out.println(0);
    }
}