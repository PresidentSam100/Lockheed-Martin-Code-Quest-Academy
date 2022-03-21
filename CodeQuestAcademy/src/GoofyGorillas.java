import java.util.Scanner;
// Problem 91: Goofy Gorillas
// Difficulty: Easy
// Author: Shelly Adamie, Fort Worth, Texas, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class GoofyGorillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            boolean g1 = sc.nextBoolean();
            boolean g2 = sc.nextBoolean();
            System.out.println(g1 == g2);
        }
    }
}
