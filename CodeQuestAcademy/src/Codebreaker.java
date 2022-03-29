import java.util.ArrayList;
import java.util.Scanner;
// Problem 142: Codebreaker
// Author: Brett Reynolds, Annapolis Junction, Maryland, United States
// Originally Published: Code Quest 2021
// Difficulty: Medium
// Code Written By: Sam L.
public class Codebreaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int X = sc.nextInt();
            sc.nextLine();
            double len = 0;
            int[] arr = new int[26];
            for (int j = 0; j < X; j++)
            {
                String str = sc.nextLine();
                str = str.toUpperCase().replaceAll("[^A-Z]","");
                len += str.length();
                for (int k = 0; k < str.length(); k++)
                {
                    arr[str.charAt(k) - 'A']++;
                }
            }
            for (int j = 0; j < arr.length; j++)
            {
                System.out.printf((char)(j + 'A') + ": %.2f%%\n", arr[j] / len * 100);
            }

        }
    }
}
