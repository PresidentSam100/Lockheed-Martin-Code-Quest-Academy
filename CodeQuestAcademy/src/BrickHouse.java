import java.util.Scanner;
// Problem 93: Brick House
// Difficulty: Easy
// Author: Holly Norton, Fort Worth, Texas, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class BrickHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int small = sc.nextInt();
            int large = sc.nextInt();
            int X = sc.nextInt();
            X -= 5 * Math.min(large, X / 5);
            if (small >= X)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
