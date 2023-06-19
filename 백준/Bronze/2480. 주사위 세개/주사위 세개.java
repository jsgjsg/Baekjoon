import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int Dice1 = Integer.parseInt(st.nextToken());
        int Dice2 = Integer.parseInt(st.nextToken());
        int Dice3 = Integer.parseInt(st.nextToken());
        int reward;

        if(Dice1 == Dice2 && Dice2 == Dice3) reward = 10000 + Dice1 * 1000;
        else if(Dice1 == Dice2) reward = 1000 + Dice1 * 100;
        else if(Dice2 == Dice3) reward = 1000 + Dice2 * 100;
        else if(Dice3 == Dice1) reward = 1000 + Dice3 * 100;
        else reward = Math.max(Dice1, Math.max(Dice2, Dice3)) * 100;

        System.out.println(reward);
    }
}