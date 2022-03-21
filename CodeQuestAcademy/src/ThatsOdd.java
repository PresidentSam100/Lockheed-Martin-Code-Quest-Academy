import java.util.Scanner;
// Problem 132: That's Odd
// Difficulty: Easy
// Author: Vedant Patel, Stratford, Connecticut, United States
// Originally Published: Code Quest 2021
// Code Written By: Sam L.
public class ThatsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int n = sc.nextInt();
            System.out.println(n % 2 == 0?"EVEN":"ODD");
        }
    }
}
