import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        if (num1 >= 90) {
            System.out.println("A");
        }
        else if (num1 >= 80) {
            System.out.println("B");
        }
        else if (num1 >= 70) {
            System.out.println("C");
        }
        else if (num1 >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}