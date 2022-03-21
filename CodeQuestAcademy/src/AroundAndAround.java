import java.util.Scanner;
// Problem 94: Around and Around
// Author: Chris Mason, Sunnyvale, California, United States
// Originally Published: Code Quest 2019
// Difficulty: Easy
// Code Written By: Sam L.
public class AroundAndAround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int altitude = sc.nextInt();
            System.out.printf("%.1f%n", 40075 + altitude * 2 * Math.PI);
        }
    }
}
