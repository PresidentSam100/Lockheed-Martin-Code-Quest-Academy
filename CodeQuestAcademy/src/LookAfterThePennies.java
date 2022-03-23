import java.util.Scanner;
// Problem 4: Look After The Pennies
// Difficulty: Easy
// Author: Ben Fenton, Ampthill, Reddings Wood, United Kingdom
// Code Written By: Sam L.
public class LookAfterThePennies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int X = sc.nextInt();
            double savings = 0;
            for (int j = 0; j < X; j++)
            {
                double d = sc.nextDouble();
                System.out.println((int)Math.ceil(d));
                savings += Math.ceil(d) - d;
            }
            System.out.printf("%.2f%n", savings);
        }
    }
}
