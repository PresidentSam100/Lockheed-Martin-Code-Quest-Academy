import java.util.Scanner;
// Problem 67: AEIOU
// Originally Published: Code Quest 2018
// Difficulty: Easy
// Code Written By: Sam L.
public class AEIOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String s = sc.nextLine();
            System.out.println(s.replaceAll("[^aeiou]","").length());
        }
    }
}
