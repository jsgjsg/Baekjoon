import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double totalCredit = 0;
        double totalScore = 0;
        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if(score.equals("P")) continue;
            totalCredit += credit;

            switch (score) {
                case "A+":
                    totalScore += 4.5 * credit;
                    break;
                case "A0":
                    totalScore += 4.0 * credit;
                    break;
                case "B+":
                    totalScore += 3.5 * credit;
                    break;
                case "B0":
                    totalScore += 3.0 * credit;
                    break;
                case "C+":
                    totalScore += 2.5 * credit;
                    break;
                case "C0":
                    totalScore += 2.0 * credit;
                    break;
                case "D+":
                    totalScore += 1.5 * credit;
                    break;
                case "D0":
                    totalScore += 1.0 * credit;
                    break;
                default:
                    break;
            }
        }
        if(totalCredit == 0.0) System.out.printf("%f", 0.0);
        else System.out.printf("%f", totalScore / totalCredit);
    }
}