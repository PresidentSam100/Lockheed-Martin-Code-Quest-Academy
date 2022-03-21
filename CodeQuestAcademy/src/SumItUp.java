import java.util.Scanner;
// Problem 90: Sum It Up
// Difficulty: Easy
// Author: Shelly Adamie, Fort Worth, Texas, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class SumItUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b)
                System.out.println((a + b) * 2);
            else
                System.out.println(a + b);
        }
    }
}
