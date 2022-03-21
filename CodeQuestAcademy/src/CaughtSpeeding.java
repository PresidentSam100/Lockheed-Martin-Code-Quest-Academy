import java.util.Scanner;
// Problem 92: Caught Speeding
// Difficulty: Easy
// Author: Holly Norton, Fort Worth, Texas, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class CaughtSpeeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int speed = sc.nextInt();
            boolean birthday = sc.nextBoolean();
            if (birthday)
                speed -= 5;
            if (speed <= 60)
                System.out.println("no ticket");
            else if (speed <= 80)
                System.out.println("small ticket");
            else
                System.out.println("big ticket");
        }
    }
}
