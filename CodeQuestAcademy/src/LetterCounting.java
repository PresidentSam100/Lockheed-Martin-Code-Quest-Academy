import java.util.Scanner;
// Problem 113: Letter Counting
// Difficulty: Easy
// Author: Louis Ronat, Denver, Colorado, United States
// Originally Published: Code Quest Australia 2019
// Code Written By: Sam L.
public class LetterCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = sc.next();
            System.out.println(s.length() + 1);
        }
    }
}
