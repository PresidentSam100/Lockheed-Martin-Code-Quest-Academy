import java.util.Scanner;
// Problem 118: Stalling Out
// Difficulty: Easy
// Author: Out Danny Lin, Greenville, South Carolina, United States
// Originally Published: Code Quest Australia 2019
// Code Written By: Sam L.
public class StallingOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            double critical = sc.nextDouble();
            double port = sc.nextDouble();
            double starboard = sc.nextDouble();
            if (Math.abs(port - starboard) > 5)
                System.out.println("WARNING");
            else if ((port + starboard) / 2 >= critical + 2)
                System.out.println("ALARM");
            else
                System.out.println("OK");
        }
    }
}
