import java.util.Scanner;
// Problem 89: No More Shouting
// Difficulty: Easy
// Author: Brett Reynolds, Orlando, Florida, United States
// Originally Published: Code Quest 2019
// Code Written By: Sam L.
public class NoMoreShouting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String s = sc.nextLine();
            System.out.println(s.toLowerCase());
        }
    }
}
