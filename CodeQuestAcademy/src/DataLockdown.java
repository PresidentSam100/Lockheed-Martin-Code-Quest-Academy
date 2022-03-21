import java.util.Scanner;
// Problem 116: Data Lockdown
// Difficulty: Easy
// Author: Richard Green, Whiteley, Hampshire, United Kingdom
// Originally Published: Code Quest Australia 2019
// Code Written By: Sam L.
public class DataLockdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int X = sc.nextInt();
            for (int j = 0; j < X; j++)
            {
                String s = sc.next();
                int n = sc.nextInt();
                if (n > 1000 && !s.endsWith(".lmco.com"))
                {
                    System.out.println(s + " " + n);
                }
            }
        }
    }
}
