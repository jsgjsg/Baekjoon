import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            int ymd = Integer.parseInt(br.readLine());
            int date = ymd % 100;
            int month = (ymd / 100) % 100;
            int year = (ymd / 10000);
            
            sb.append("#").append(test_case).append(" ");

            if(date > 31) sb.append("-1\n");
            else if(year <= 0 || month <= 0 || date <= 0) sb.append("-1\n");
            else if(month == 2 && date > 28) sb.append("-1\n");
            else if(month == 4 || month == 6 || month == 9 || month == 11 && date > 30) sb.append("-1\n");
            else {
                if(year < 1000) {
                    sb.append(0);
                    if(year < 100) {
                        sb.append(0);
                        if(year < 10) sb.append(0);
                    }
                }
                sb.append(year).append("/");
                if(month < 10) sb.append(0);
                sb.append(month).append("/");
                if(date < 10) sb.append(0);
                sb.append(date).append("\n");
            }
        }
        System.out.println(sb);
    }
}