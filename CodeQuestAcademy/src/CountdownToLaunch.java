import java.util.Scanner;
// Problem 146: Confusing Conversions
// Author: Ben Fenton, Ampthill, Reddings Wood, United Kingdom
// Originally Published: Code Quest 2021
// Difficulty: Medium
// Code Written By: Sam L.
public class CountdownToLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int X = sc.nextInt();
            boolean work = false;
            String launch = "ABORT LAUNCH";
            for (int j = 0; j < X; j++)
            {
                String data = sc.next();
                String time = sc.next();
                int thickness = sc.nextInt();
                double windSpeed = sc.nextDouble();
                int degree = sc.nextInt();
                double windEW = windSpeed * Math.sin(Math.toRadians(degree));
                double windNS = windSpeed * Math.cos(Math.toRadians(degree));
                if (!work && thickness <= 1000 && Math.abs(windNS) <= 20 && Math.abs(windEW) <= 40)
                {
                    work = true;
                    launch = data + " " + time;
                }
            }
            System.out.println(launch);
        }
    }
}
