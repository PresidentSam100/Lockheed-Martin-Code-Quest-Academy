import java.util.Scanner;
// Problem 48: Batter Up!
// Difficulty: Easy
// Originally Published: Code Quest 2017
// Code Written By: Sam L.
public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            String[] s = str.split("[:,]");
            double atBats = 0;
            int total = 0;
            for (int j = 1; j < s.length; j++)
            {
                switch (s[j])
                {
                    case "1B":
                        total += 1;
                        atBats++;
                        break;
                    case "2B":
                        total += 2;
                        atBats++;
                        break;
                    case "3B":
                        total += 3;
                        atBats++;
                        break;
                    case "HR":
                        total += 4;
                        atBats++;
                        break;
                    case "K":
                        atBats++;
                        break;
                }
            }
            double SLG = total / atBats;
            if (atBats == 0)
                SLG = 0;
            System.out.printf(s[0] + "=%.3f%n", SLG);
        }
    }
}
